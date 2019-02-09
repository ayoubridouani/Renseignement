import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Profession extends JPanel implements ActionListener{
	private JButton Button;
	private JTextArea TNomSociete;
	private JLabel NomProfession,NomSociete,Jours,Mois,Anne;
	private JTextField TNomProfession,TJours,TMois,TAnne;
	public Profession() {
		super();
		NomProfession = new JLabel("Proffession : ");
	    NomProfession.setBounds(10, 10, 100, 30);
	    TNomProfession = new JTextField ();
	    TNomProfession.setBounds(100, 10, 250, 30);
	    
	    NomSociete = new JLabel("Societe : ");
	    NomSociete.setBounds(10, 40, 100, 30);
	    TNomSociete = new JTextArea ();
	    TNomSociete.setBounds(100, 40, 250, 30);
	    
	    Jours = new JLabel("Jours : ");
	    Jours.setBounds(10, 70, 100, 30);
	    TJours = new JTextField ();
	    TJours.setBounds(100, 70, 250, 30);
	    
	    Mois = new JLabel("Mois : ");
	    Mois.setBounds(10, 100, 100, 30);
	    TMois = new JTextField ();
	    TMois.setBounds(100, 100, 250, 30);
	    
	    Anne = new JLabel("Annee: ");
	    Anne.setBounds(10, 130, 100, 30);
	    TAnne = new JTextField ();
	    TAnne.setBounds(100, 130, 250, 30);
	    
	    Button = new JButton("Valider");
	    Button.setBounds(120, 180, 150, 30);
	    Button.addActionListener(this);
	    
	    add(NomProfession);add(TNomProfession);
	    add(NomSociete);add(TNomSociete);
	    add(Jours);add(TJours);
	    add(Mois);add(TMois);
	    add(Anne);add(TAnne);
	    add(Button);
	    setLayout(null);
	}
	public void actionPerformed(ActionEvent e) {
		String emptyMsg2= "";
		if(TNomProfession.getText().isEmpty()) {
			emptyMsg2 += "Profession \n"; 
		}
		if(TNomSociete.getText().isEmpty()) {
			emptyMsg2 += "Societe \n"; 
		}
		if(TJours.getText().isEmpty()) {
			emptyMsg2 += "Jours \n"; 
		}
		if(TMois.getText().isEmpty()) {
			emptyMsg2 += "Mois \n"; 
		}
		if(TAnne.getText().isEmpty()) {
			emptyMsg2 += "Anne \n"; 
		}
		if(!emptyMsg2.isEmpty()) {
			String Errora = "S'il Vous Plait Inserer : \n";
			Errora += emptyMsg2;
			JOptionPane.showMessageDialog(null,Errora,"Empty Fields",JOptionPane.WARNING_MESSAGE);
		}
		String value2 = TJours.getText();
		String value3 = TMois.getText();
		String value4 = TAnne.getText();
		if(!value2.isEmpty()) {
			int val2 = Integer.parseInt(value2);
			if(val2<0 || val2 >31) {
				TJours.setText("");
				JOptionPane.showMessageDialog(null,"inserer une valide Jours","Error",JOptionPane.WARNING_MESSAGE);
			}
		}
		if(!value3.isEmpty()) {
			int val2 = Integer.parseInt(value3);
			if(val2<0 || val2 >12) {
				TMois.setText("");
				JOptionPane.showMessageDialog(null,"inserer une valide Mois","Error",JOptionPane.WARNING_MESSAGE);
			}
		}
		if(!value4.isEmpty()) {
			int val2 = Integer.parseInt(value4);
			if(val2<1950 || val2 >2018) {
				TAnne.setText("");
				JOptionPane.showMessageDialog(null,"inserer une valide Anne","Error",JOptionPane.WARNING_MESSAGE);
			}
		}
	}
}
