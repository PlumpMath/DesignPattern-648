package proxy.remoteproxy.client;

import java.rmi.*;

import proxy.remoteproxy.common.GumballMachineRemote;
/**
 * �ͻ��� 
* @ClassName: GumballMonitor
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����9:15:58
*
 */
public class GumballMonitor {
	GumballMachineRemote machine;
 
	public GumballMonitor(GumballMachineRemote machine) {
		this.machine = machine;
	}
 
	public void report() {
		try {
			System.out.println("Gumball Machine: " + machine.getLocation());
			System.out.println("Current inventory: " + machine.getCount() + " gumballs");
			System.out.println("Current state: " + machine.getState());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
