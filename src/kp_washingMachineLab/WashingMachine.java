package kp_washingMachineLab;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class WashingMachine extends UnicastRemoteObject implements MyService{
	private static final long serialVersionUID = 2L;
	
	WashingMachineState notFullyPaidState;
	WashingMachineState hasPaidState;
	WashingMachineState inUseState;
	
	WashingMachineState state; 
	String location;
	//String status;
	
	public WashingMachine(String location) throws RemoteException{
		notFullyPaidState = new NotFullyPaid(this);
		hasPaidState = new HasPaid(this);
		inUseState = new InUse(this);
		state  = notFullyPaidState;
		
		this.location = location;
		//this.state = status;
	}
	
	public void insertQuarter() {
		state.insertQuarters();
	}
	
	public void ejectQuarter() {
			state.ejectQuarters();
		}
	
	public void startMachine() throws InterruptedException {
		state.startMachine();
	}
	
	public void cancel() {
		state.cancel();
	}
	
	void setState(WashingMachineState state) {
		this.state = state;
	}
	
	public WashingMachineState getState() {
		return state;
	}
	
	public String getLocation() {
        return location;
    }
	
	/*public String getStatus() {
        return status;
    }*/
	
	public WashingMachineState getNotFullyPaidState() {
		return notFullyPaidState;
	}
	
	public WashingMachineState getHasPaidState() {
		return hasPaidState;
	}

	public WashingMachineState getInUseState() {
		return inUseState;
	}
}
