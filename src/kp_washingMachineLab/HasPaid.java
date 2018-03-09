package kp_washingMachineLab;

public class HasPaid implements WashingMachineState{
	private static final long serialVersionUID = 2L;
	transient WashingMachine washingMachine;
	
	public HasPaid(WashingMachine washingMachine) {
		this.washingMachine =washingMachine;
	}
	
	@Override
	public void insertQuarters() {
		// message saying the machine won't accept more quarters
		System.out.println("You can't insert another quarter. Paid in full.");
		
	}

	@Override
	public void ejectQuarters() {
		// refund all quarters
		System.out.println("Refunded all 4 quarters.");
		washingMachine.setState(washingMachine.getNotFullyPaidState());
	}

	@Override
	public void startMachine() {
		//change state to inUse
		washingMachine.setState(washingMachine.getInUseState());
		//somehow have to call the startMachine method in the InUse class
	}

	@Override
	public void cancel() {
		// refund all quarters
		System.out.println("Refunded all 4 quarters.");
		washingMachine.setState(washingMachine.getNotFullyPaidState());
	}

}
