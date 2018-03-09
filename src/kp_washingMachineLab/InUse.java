package kp_washingMachineLab;

import java.util.concurrent.TimeUnit;


public class InUse implements WashingMachineState{
	private static final long serialVersionUID = 2L;
	transient WashingMachine washingMachine;
	
	public InUse(WashingMachine washingMachine) {
		this.washingMachine =washingMachine;
	}
	
	@Override
	public void insertQuarters() {
		// message saying the machine won't accept more quarters
		System.out.println("You can't insert another quarter. Washer is already paid.");
	}

	@Override
	public void ejectQuarters() {
		// do nothing
		
	}

	@Override
	public void startMachine() throws InterruptedException {
		// message saying the machine has started
		System.out.println("Washing Machine has started.");
		System.out.println("Filling with water.");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Washing laundry.");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Rinse and spin.");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Washer is done.");
		washingMachine.setState(washingMachine.getNotFullyPaidState());
	}

	@Override
	public void cancel() {
		// stop the washer, keep money, change state to notpaid
		System.out.println("Stopping washer.");
		System.out.println("Sorry. No refund.");
		washingMachine.setState(washingMachine.getNotFullyPaidState());
	}

}
