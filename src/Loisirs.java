import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Loisirs extends JPanel implements ActionListener{
	private JButton Button;
	private JLabel Loisirs,AutreLoisirs;
	private JTextArea TAutreLoisirs;
	private JCheckBox Choix1,Choix2,Choix3,Choix4,Choix5,Choix6;
	public Loisirs() {
		Loisirs = new JLabel("Loisirs : ");
	    Loisirs.setBounds(10, 10, 100, 30);
	    
	    Choix1 = new JCheckBox("Sport");
	    Choix1.setBounds(20, 40, 150, 20);
	    Choix2 = new JCheckBox("Lecture");
	    Choix2.setBounds(20, 60, 150, 30);
	    Choix3 = new JCheckBox("Voyage");
	    Choix3.setBounds(20, 80, 150, 30);
	    Choix4 = new JCheckBox("Photographie");
	    Choix4.setBounds(20, 100, 150, 30);
	    Choix5 = new JCheckBox("Ecriture");
	    Choix5.setBounds(20, 120, 150, 30);
	    Choix6 = new JCheckBox("Shopping");
	    Choix6.setBounds(20, 140, 150, 30);

	    AutreLoisirs = new JLabel("Autre Loisirs : ");
	    AutreLoisirs.setBounds(10, 170, 150, 30);
	    TAutreLoisirs = new JTextArea ();
	    TAutreLoisirs.setBounds(120, 170, 150, 30);
	    
	    Button = new JButton("Valider");
	    Button.setBounds(120, 215, 150, 30);
	    Button.addActionListener(this);
	    
	    add(Loisirs);
	    add(Choix1);add(Choix2);add(Choix3);
	    add(Choix4);add(Choix5);add(Choix6);
	    add(AutreLoisirs);add(TAutreLoisirs);
	    add(Button);
	    setLayout(null);
	}
	public void actionPerformed(ActionEvent e) {
		if(!Choix1.isSelected() && !Choix2.isSelected() && !Choix3.isSelected()
			&& !Choix4.isSelected() && !Choix5.isSelected() && !Choix6.isSelected() 
			&& TAutreLoisirs.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null,"Select une Loisirs","Error",JOptionPane.WARNING_MESSAGE);
		}
	}
}
