package kp_washingMachineLab;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyService extends Remote{
	public WashingMachineState getState() throws RemoteException;
	public String getLocation() throws RemoteException;
}
