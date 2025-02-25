# Lab2-State-Design-Pattern

Problem:
A vending machine needs to manage different states, including "Idle", "ItemSelected", "Dispensing", and "OutOfOrder". Each state has specific rules and restrictions regarding allowed operations, and the vending machine has associated attributes like item inventory and balance.
Requirements:
1. Idle State:  <br>
  Allow item selection.
  Disallow dispensing items and inserting coins. 
2. ItemSelected State:  <br>
  Allow inserting coins and dispensing items.
  Disallow item selection.
3. Dispensing State:  <br>
Allow no operations.
  Automatically transition back to the "Idle" state after dispensing is complete.
4. OutOfOrder State:  <br>
  Disallow all operations.

Current System: The system currently relies on conditional statements within the VendingMachine class to check the machine state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.
Implement the State Pattern to improve code maintainability and flexibility:
1. Define VendingMachine States:  <br>
  Create separate classes representing different machine states: IdleState, ItemSelectedState, DispensingState, and OutOfOrderState.
2. Implement State Interface:  <br>
  Define an interface VendingMachineState with methods for common actions like selectItem, insertCoin, dispenseItem, and setOutOfOrder.
3. Implement State Behaviors:  <br>
  Each concrete state class implements the VendingMachineState interface, providing specific behavior for its respective state. For example, the IdleState class would allow   item selection, while the OutOfOrderState wouldn't allow any operations.
4. Update VendingMachine Class:  <br>
  Include attributes for item inventory and balance.
  Remove state-specific logic from the VendingMachine class.
  Introduce a reference to the current VendingMachineState object.
  Delegate actions like selectItem, insertCoin, dispenseItem, and setOutOfOrder to the current state object through its corresponding methods.
