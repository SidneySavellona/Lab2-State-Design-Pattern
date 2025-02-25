
public interface VendingMachineState {
    void selectItem(VendingMachine currentSystem);
    void insertCoin(VendingMachine currentSystem, int amount);
    void dispenseItem(VendingMachine currentSystem);
    void setOutofOrder(VendingMachine currentSystem);
}
