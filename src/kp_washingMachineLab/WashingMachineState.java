package kp_washingMachineLab;

import java.io.Serializable;

public interface WashingMachineState extends Serializable{
	public void insertQuarters();
	public void ejectQuarters();
	public void startMachine() throws InterruptedException;
	public void cancel();
}
