import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GraphicPanel extends JPanel{
	

	public GraphicPanel() {
		
	}
	
    public void paintComponent(Graphics g) {
        super.paintComponent(g);       

        this.setBackground(Color.BLACK);
        g.setColor(Color.RED);
        g.fillRect(10,10,200,200);
    }  
}
