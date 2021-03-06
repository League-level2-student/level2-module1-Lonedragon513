package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton bAdd = new JButton("add");
	JButton bView = new JButton("view");

	static ArrayList<String> names = new ArrayList<String>();

	public static void main(String[] args) {
		names.add("Bob Banders");
		names.add("Sandy Summers");
		names.add("Greg Ganders");
		names.add("Donny Doners");
		new GuestBook().otherNeededStuff();
	}

	void otherNeededStuff() {
		f.setVisible(true);
		f.add(p);
		// p.add(f);
		// bAdd.add(p);
		p.add(bAdd);

		// bView.add(p);
		p.add(bView);

		bAdd.addActionListener(this);
		bView.addActionListener(this);
	}

	String addName() {
		String Ack = JOptionPane.showInputDialog("add naem");

		return Ack;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		

		
	
		if (e.getSource().equals(bView)) {
			for(String s : names){
				System.out.println(s);
			}
		}
		if (e.getSource().equals(bAdd)) {
			names.add(addName());

	}
		}

	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".

	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}

