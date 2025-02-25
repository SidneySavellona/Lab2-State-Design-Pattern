public class DispensingState implements VendingMachineState {
    public void selectItem(VendingMachine currentSystem) {
        System.out.println("Item is being dispensed, please wait.");
    }

    public void insertCoin(VendingMachine currentSystem, int amount) {
        System.out.println("Unable to accept coins while dispensing. Please wait for the process to complete.");
    }

    public void dispenseItem(VendingMachine currentSystem) {
        if (currentSystem.getInventory() > 0) {
            currentSystem.reduceInventory();
            currentSystem.setBalance(0);
            System.out.println("Your item has been dispensed. Returning to idle state.");
            currentSystem.setState(new IdleState());
        } else {
            System.out.println("The machine is out of stock. Returning to idle state.");
            currentSystem.setState(new OutOfOrderState());
        }
    }

    public void setOutofOrder(VendingMachine currentSystem) {
        System.out.println("The machine has encountered an issue and is now out of order.");
        currentSystem.setState(new OutOfOrderState());
    }
}
