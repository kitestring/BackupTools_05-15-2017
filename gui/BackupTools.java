package gui;
import javax.swing.SwingUtilities;

public class BackupTools {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				new MainFrame();
			}
		});
		
	}
	
	

}
