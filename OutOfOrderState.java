public class OutOfOrderState implements VendingMachineState {

    public void selectItem(VendingMachine currentSystem) {
        System.out.println("The machine is out of order. Item selection is not available.");
    }

    public void insertCoin(VendingMachine currentSystem, int amount) {
        System.out.println("The machine is out of order. Coin insertion is not allowed.");
    }

    public void dispenseItem(VendingMachine currentSystem) {
        System.out.println("The machine is out of order. Unable to dispense items.");
    }

    public void setOutofOrder(VendingMachine currentSystem) {
        System.out.println("The machine is already in an out-of-order state.");
    }
}
