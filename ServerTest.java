import javax.swing.JFrame;

public class ServerTest{
	public static void main(String[] args){
		Server marcos = new Server();
		marcos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marcos.startRunning();
	}
}