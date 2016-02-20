

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GameCourt extends JPanel {



	public boolean playing = false; // whether the game is running
	private JLabel status; // Current status text (i.e. Running...)

	public GameCourt(JLabel status) {

	    
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.status = status;
		setFocusable(true);
				
	}
	

	/**
	 * (Re-)set the game to its initial state.
	 */
	public void reset() {

		playing = true;
		status.setText("Running...");
		

		requestFocusInWindow();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	@Override
	public Dimension getPreferredSize() {
		return null;
	}
	
}
