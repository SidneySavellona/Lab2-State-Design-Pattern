public class IdleState implements VendingMachineState {
    public void selectItem(VendingMachine currentSystem) {
        System.out.println("You have selected an item. Please insert the required coins.");
        currentSystem.setState(new ItemSelectedState());
    }

    public void insertCoin(VendingMachine currentSystem, int amount) {
        System.out.println("Please select an item before inserting coins.");
    }

    public void dispenseItem(VendingMachine currentSystem) {
        System.out.println("No item selected. Unable to dispense.");
    }

    public void setOutofOrder(VendingMachine currentSystem) {
        System.out.println("The machine is now out of order.");
        currentSystem.setState(new OutOfOrderState());
    }
}
