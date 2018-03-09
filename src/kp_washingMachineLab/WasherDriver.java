package kp_washingMachineLab;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class WasherDriver {

	public static void main(String[] args) throws InterruptedException, RemoteException {
		// washing machine driver program
		
		MyService machine = null;
		//int count;
		//WashingMachineState state;
		//String state;
		if (args.length < 1) {
			System.out.println("WashingMachine <name>");
 			System.exit(1);
		}

		try {
			//state = String.valueOf(args[1]);

			machine = 
				new WashingMachine(args[0]);
			Naming.rebind("//" + args[0] + "/washingmachine", machine);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
		
		
		
		
		
		
		
		/*WashingMachine washer = new WashingMachine();
		
		System.out.println("Washer #1");
		//System.out.println("Status: "+washer.getState());
		
		try {
		washer.insertQuarter();
		washer.startMachine();
		
		washer.insertQuarter();
		washer.insertQuarter();
		washer.startMachine();
		
		washer.insertQuarter();
		washer.insertQuarter();
		washer.insertQuarter();
		washer.startMachine();
		washer.startMachine();
		}catch(Exception e) {
			e.printStackTrace();
		}*/
	}


