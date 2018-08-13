

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MouseManager implements MouseListener, MouseMotionListener, MouseWheelListener {
	private boolean leftPressed, rightPressed;
	private int mouseX, mouseY;
	
	
	public MouseManager(Window window) {
		window.getContentPane().addMouseListener(this);
		window.getContentPane().addMouseMotionListener(this);
		window.getContentPane().addMouseWheelListener(this);
	}

	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse Release - X:" + e.getX() + " Y:" + e.getY());
	}

	public void mousePressed(MouseEvent e) {
		
		System.out.println("Mouse Pressed - X:" + e.getX() + " Y:" + e.getY());
	}

	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse Exited - X:" + e.getX() + " Y:" + e.getY());
	}

	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse Entered - X:" + e.getX() + " Y:" + e.getY());
	}

	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1) {
			setLeftPressed(true);
		System.out.println("Left mouse clicked - X:" + e.getX() + " Y:" + e.getY());
		}
		if(e.getButton() == MouseEvent.BUTTON3) {
			setRightPressed(true);
			System.out.println("Right mouse clicked - X:" + e.getX() + " Y:" + e.getY());
		}
		if(e.getButton() == MouseEvent.BUTTON2) {
			System.out.println("Middle mouse clicked - X:" + e.getX() + " Y:" + e.getY());
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Mouse Dragged - X:" + e.getX() + " Y:" + e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		System.out.println("Mouse Moved - X:" + mouseX + " Y:" + mouseY);
		
		
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		System.out.println("Mouse Wheel Scrolled - X:" + mouseX + " Y:" + mouseY + " AND IT WAS " + e.getWheelRotation()*-1);
		
	}

	/**
	 * @return the leftPressed
	 */
	public boolean isLeftPressed() {
		return leftPressed;
	}

	/**
	 * @param leftPressed the leftPressed to set
	 */
	public void setLeftPressed(boolean leftPressed) {
		this.leftPressed = leftPressed;
	}

	/**
	 * @return the rightPressed
	 */
	public boolean isRightPressed() {
		return rightPressed;
	}

	/**
	 * @param rightPressed the rightPressed to set
	 */
	public void setRightPressed(boolean rightPressed) {
		this.rightPressed = rightPressed;
	}
}


