package intro_to_array_lists;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton bAdd = new JButton ();
	JButton bView = new JButton ();
	int b = -1;
	static String[]names= new String[10];
	
	public static void main(String[] args) {
		names [0] = "Bob Banders";
		names [1] = "Sandy Summers";
		names [2] = "Greg Ganders";
		names [3] = "Donny Doners";
	
	}
	String addName () {
		String Ack = JOptionPane.showInputDialog("add naem");
		
		return Ack;
	}
	
	void viewAll () {
		if(!names     																		 [0].equals(null)) {
			b++;
			if(!names     																		 [1].equals(null)) {
				b++;
				if(!names     																		 [2].equals(null)) {
					b++;
					if(!names     																		 [3].equals(null)) {
						b++;
						if(!names     																		 [4].equals(null)) {
							b++;
							if(!names     																		 [5].equals(null)) {
								b++;
								if(!names     																		 [6].equals(null)) {
									b++;	
									if(!names     																		 [7].equals(null)) {
										b++;
										if(!names     																		 [8].equals(null)) {
											b++;
											if(!names     																		 [9].equals(null)) {
												b++;
												if(!names     																		 [10].equals(null)) {
													
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		for (int i = 0; i <= b; i++) {
			System.out.println(names [i]);
		}
		
				
	}
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names".
	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
