import javax.swing.JFrame;

public class Fenetre {
	private JFrame frame;
	public Fenetre() {
		frame = new JFrame("Renseignement");
		Menu menu = new Menu();
	    frame.add(menu);
	    frame.setSize(400, 315);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
