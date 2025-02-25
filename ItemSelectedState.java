public class ItemSelectedState implements VendingMachineState {
    public void selectItem(VendingMachine currentSystem) {
        System.out.println("An item is already selected. Please insert coins.");
    }

    public void insertCoin(VendingMachine currentSystem, int amount) {
        currentSystem.addBalance(amount);
        System.out.println("You inserted: " + amount + " coins.");
        System.out.println("Current balance: " + currentSystem.getBalance() + " coins.");
        
        if (currentSystem.getBalance() >= currentSystem.getItemPrice()) {
            System.out.println("Sufficient balance detected. Dispensing item...");
            currentSystem.setState(new DispensingState());
            currentSystem.dispenseItem(); 
        } else {
            System.out.println("Insufficient balance. Please insert more coins.");
        }
    }

    public void dispenseItem(VendingMachine currentSystem) {
        System.out.println("Cannot dispense. No sufficient balance.");
    }

    public void setOutofOrder(VendingMachine currentSystem) {
        System.out.println("The machine is now out of order.");
        currentSystem.setState(new OutOfOrderState());
    }
}
