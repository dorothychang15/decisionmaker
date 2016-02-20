//package decisionmaker;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.LinkedList;


public class Game implements Runnable {
	public void run() {
		LinkedList<Node> nodes = new LinkedList<Node>();

		final JFrame frame = new JFrame("Decision Maker");
		frame.setLocation(300, 300);

		final JPanel status_panel = new JPanel();
		frame.add(status_panel, BorderLayout.SOUTH);
		final JLabel status = new JLabel("Running...");
		status_panel.add(status);


		final JPanel control_panel = new JPanel();
		frame.add(control_panel, BorderLayout.NORTH);

		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		final JPanel center = new JPanel();
		frame.add(center);
		
		center.addMouseListener(new MouseListener() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	int x = e.getX();
		    	int y = e.getY();
		    	if(e.getClickCount()==2) {
		    		JTextField field1 = new JTextField();
		    		JTextField field2 = new JTextField();
				int option = JOptionPane.showConfirmDialog(frame, new Object[]{field1, field2}, "Enter your choices", JOptionPane.OK_CANCEL_OPTION);
				
				if (option == JOptionPane.OK_OPTION) {
					String op1 = field1.getText();
					String op2 = field2.getText();
					Node n = new Node(op1, op2);
					nodes.add(n);
				}
				
				
		    	}
		    }

			@Override
			public void mouseEntered(MouseEvent arg0) {
				//do nothing
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				//do nothing
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				//do nothing
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				//do nothing
			}
		});
		
	}


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Game());
	}
}
