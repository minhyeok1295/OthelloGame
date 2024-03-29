package viewcontroller;

import model.*;
import util.*;
import javafx.scene.control.TextField;

/**
 * View of the Othello game to show who's turn it is.
 * @author minhyeok12
 *
 */
public class VTurn extends TextField implements Observer {
	
	public String turn;
	
	public VTurn() {
		this.setText("X moves next");
	}
	
	@Override
	public void update(Observable o) {
		Othello othello = (Othello) o;
		if (!othello.isGameOver()) {
			this.turn = Character.toString(othello.getWhosTurn());
			this.setText(turn + " moves next");
		}
		
	}

}
