package kp_washingMachineLab;

public class NotFullyPaid implements WashingMachineState{
	private static final long serialVersionUID = 2L;
	transient WashingMachine washingMachine;
	int qtrCount = 0;//keep track of number of quarters inserted
	
	public NotFullyPaid(WashingMachine washingMachine) {
		this.washingMachine = washingMachine;
	}
	
	@Override
	public void insertQuarters() {
		//check to see if there are enough (4) quarters
		System.out.println("\nYou inserted a quarter.");
		qtrCount +=1;//increment count
		System.out.println("Number of quarters paid: "+qtrCount);
		if(qtrCount < 4) {
			System.out.println("Please add another quarter.");
		}
		else if (qtrCount ==4) {
			System.out.println("You have paid in full");
			washingMachine.setState(washingMachine.getHasPaidState());
		}
		
	}

	@Override
	public void ejectQuarters() {
		// Give refund of number of quarters in qtrCount
		if(qtrCount ==0)
			System.out.println("No quarters put in. Cannot refund.");
		else if(qtrCount>1)
			System.out.println(qtrCount +" quarters refunded.");
		else
			System.out.println(qtrCount +" quarter refunded.");
		
		washingMachine.setState(washingMachine.getNotFullyPaidState());
	}

	@Override
	public void startMachine() {
		// error message because they haven't paid in full yet
		System.out.println("Can't start machine until you have paid in full.");
		
	}

	@Override
	public void cancel() {
		// do nothing
		
	}

}
