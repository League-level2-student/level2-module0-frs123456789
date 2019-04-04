/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[] jb;
	//2 create an int variable called hiddenButton
	int hiddenButton;
	
	int bleh;
	public static void main(String[] args) {
		
		new _02_FindTheHiddenButton().start();
		
	}
	
	public void start() {
		String num = JOptionPane.showInputDialog("Enter a positive number please.");
		 bleh = Integer.parseInt(num);
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		
		
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		jb = new JButton [bleh];
		//5. Make a for loop to iterate through the JButton array
		for(int i = 0; i<bleh; i++) {
			jb[i]= new JButton();
			jb[i].addActionListener(this);
			panel.add(jb[i]);
		}
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		window.add(panel);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.setVisible(true);
		JOptionPane.showMessageDialog(null, "Finddddd that hidden buttonnnnnnn");
		//9 add the panel to the window
		
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		
		//11. set the JFrame to visible.
		
		//12. Give the user the instructions for the game.
		
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		Random gen = new Random();
		
		hiddenButton = gen.nextInt(bleh-1);
		//14. Set the text of the JButton located at hiddenButton the read "ME"
		jb[bleh].setText("ME");
		//15. Use Thread.sleep(1000); to pause the program.
		//    Surround it with a try/catch - use Eclipse helper for this
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//16. Set the text of the JButton located at hiddenButton to be blank.
		jb[bleh].setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		if(e.getSource() == jb[bleh]) {
			JOptionPane.showMessageDialog(null, "YOU WIN!");
		}
		else {
		JOptionPane.showMessageDialog(null, "Try again");
		}
		//18. else tell them to try again
	}
}
