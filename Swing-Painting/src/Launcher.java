import javax.swing.SwingUtilities;

public class Launcher {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				init();
			}
		});

	}
	public static void init() {
		 System.out.println("Created GUI on EDT? "+
	                SwingUtilities.isEventDispatchThread());
	        Window window = new Window("Demo",480,480);
	        
	}

}