import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class Etude extends JPanel implements ActionListener{
	private JButton Button;
	private ButtonGroup bg;
	private JRadioButton Choix1,Choix2,Choix3,Choix4,Choix5;
	private JLabel specialiteEtude,niveauEtude;
	private JComboBox<String> cb;
	public Etude() {
		super();
		
	    niveauEtude = new JLabel("Niveau d'etude : ");
	    niveauEtude.setBounds(10, 10, 150, 30);
	    
	    Choix1 = new JRadioButton("Baccaulareat");
	    Choix1.setBounds(20, 40, 150, 20);
	    Choix2 = new JRadioButton("DUT");
	    Choix2.setBounds(20, 60, 150, 30);
	    Choix3 = new JRadioButton("Licence");
	    Choix3.setBounds(20, 80, 150, 30);
	    Choix4 = new JRadioButton("Master");
	    Choix4.setBounds(20, 100, 150, 30);
	    Choix5 = new JRadioButton("Doctorat");
	    Choix5.setBounds(20, 120, 150, 30);

	    bg = new ButtonGroup();
	    bg.add(Choix1);bg.add(Choix2);bg.add(Choix3);bg.add(Choix4);bg.add(Choix5);

	    String specialite[]={"Info","Math","Electrique","Geometrie","Mecanique","Biologie","Geologie","Industriel"}; 
	    specialiteEtude = new JLabel("Specialite : ");
	    specialiteEtude.setBounds(10, 150, 150, 30);
	    
	    cb = new JComboBox<String>(specialite);
	    cb.setBounds(150, 150, 100, 30);

	    Button = new JButton("Valider");
	    Button.setBounds(120, 200, 150, 30);
	    Button.addActionListener(this);

	    add(niveauEtude);
	    add(Choix1);add(Choix2);add(Choix3);add(Choix4);add(Choix5);
	    add(specialiteEtude);
	    add(cb);
	    add(Button);
	    setLayout(null);
	}
	public void actionPerformed(ActionEvent e) {
		if(!Choix1.isSelected() && !Choix2.isSelected() && !Choix3.isSelected()
			&& !Choix4.isSelected() && !Choix5.isSelected()) {
			JOptionPane.showMessageDialog(null,"Select une Niveau d'etude","Error",JOptionPane.WARNING_MESSAGE);
		}
	}
}
