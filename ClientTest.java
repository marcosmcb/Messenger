import javax.swing.JFrame;

public class CLientTest {
	public static void (String[] args){
		Client rebecca;
		rebecca = new Client("127.0.0.1");
		rebecca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rebecca.startRunning();
	}


}