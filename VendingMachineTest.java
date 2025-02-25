public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(3);

        vendingMachine.selectItem();  
        vendingMachine.insertCoin(3);
        vendingMachine.insertCoin(2); 
        vendingMachine.selectItem();  
        vendingMachine.insertCoin(5); 

        vendingMachine.setOutOfOrder(); 
        vendingMachine.selectItem();  
        vendingMachine.insertCoin(5);   
    }
}