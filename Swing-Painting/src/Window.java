import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends JFrame {
	
	int HEIGHT, WIDTH;
	String TITLE;
	Window(String title, int height, int width){
		
		this.HEIGHT = height;
		this.WIDTH = width;
		this.TITLE = title;
		
		init();
		
	}
	
	private void init() {
		this.setTitle(TITLE);
		this.setSize(WIDTH, HEIGHT);
		this.setMinimumSize(new Dimension(WIDTH,HEIGHT));
		this.setMaximumSize(new Dimension(WIDTH,HEIGHT));
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new GraphicPanel());

		new KeyboardManager(this);
		new MouseManager(this);
	}
	
}
