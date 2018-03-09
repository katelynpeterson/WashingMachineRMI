package kp_washingMachineLab;

import java.rmi.RemoteException;

public class WashingMachineMonitor {
	MyService machine;
	
	public WashingMachineMonitor(MyService machine) {
		this.machine = machine;
	}

	public void report() {
		try {
			System.out.println("Washing Machine ");
			System.out.println("Current state: " + machine.getState());
		}catch(RemoteException e) {
			e.printStackTrace();
		}
	}
}
