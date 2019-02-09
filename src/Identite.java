import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Identite extends JPanel implements ActionListener{
	private JButton Button;
	private JLabel Nom,Prenom,Age,Adresse;
	private JTextField TNom,TPrenom,TAge;
	private JTextArea TAdresse;
	public Identite() {
		super();
		
		Nom = new JLabel("Nom : ");
	    Nom.setBounds(10, 10, 100, 30);
	    TNom = new JTextField();
	    TNom.setBounds(100, 10, 250, 30);
	    
	    Prenom = new JLabel("PreNom : ");
	    Prenom.setBounds(10, 40, 100, 30);
	    TPrenom = new JTextField(6);
	    TPrenom.setBounds(100, 40, 250, 30);
	    
	    Age = new JLabel("Age : ");
	    Age.setBounds(10, 70, 100, 30);
	    TAge = new JTextField();
	    TAge.setBounds(100, 70, 250, 30);
	    
	    Adresse = new JLabel("Adresse : ");
	    Adresse.setBounds(10, 100, 100, 30);
	    TAdresse = new JTextArea(7,10);
	    TAdresse.setBounds(100, 100, 250, 30);
	    
	    Button = new JButton("Valider");
	    Button.setBounds(120, 150, 150, 30);
	    Button.addActionListener(this);
	    
	    add(Nom);add(TNom);
	    add(Prenom);add(TPrenom);
	    add(Age);add(TAge);
	    add(Adresse);add(TAdresse);
	    add(Button);
	    setLayout(null);
	}
	public void actionPerformed(ActionEvent e) {
		String emptyMsg1= "";
		if(TNom.getText().isEmpty()) {
			emptyMsg1 += "Le Nom \n"; 
		}
		if(TPrenom.getText().isEmpty()) {
			emptyMsg1 += "Le Prenom \n"; 
		}
		if(TAge.getText().isEmpty()) {
			emptyMsg1 += "L'Age \n"; 
		}
		if(TAdresse.getText().isEmpty()) {
			emptyMsg1 += "L'Adresse \n"; 
		}
		if(!emptyMsg1.isEmpty()) {
			String Error= "S'il Vous Plait Inserer : \n";
			Error += emptyMsg1;
			JOptionPane.showMessageDialog(null,Error,"Empty Fields",JOptionPane.WARNING_MESSAGE);
		}
		String value1 = TAge.getText();
		if(!value1.isEmpty()) {
			int value2 = Integer.parseInt(value1);
			if(value2<0 || value2 >150) {
				TAge.setText("");
				JOptionPane.showMessageDialog(null,"inserer un Age entre 0 et 150","Error",JOptionPane.WARNING_MESSAGE);
			}
		}
	}
}
