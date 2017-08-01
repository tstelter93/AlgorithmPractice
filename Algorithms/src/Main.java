/**
 * 
 * Program entry point.
 * 
 * @author Timothy Stelter
 * @version 8117
 */
public class Main {

	/**
	 * Start of program execution.
	 * 
	 * @param args Potential system.in arguments
	 */
	public static void main(String[] args) {
		
		/*Create a GUI instance*/
		CMDGui gui = new CMDGui();
		
		/*Starts the GUI to collect needed algorithmic information*/
		gui.startGui();
		/*Outputs the runtime calculations of the specified algorithm + input information*/
		gui.algorithmGo();

	}

} //END CLASS
