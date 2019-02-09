import javax.swing.JPanel;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class Menu extends JTabbedPane{
	private JPanel Panel1;
	private JPanel Panel2;
	private JPanel Panel3;
	private JPanel Panel4;
    public Menu() {
    	super();
    	Panel1 = new Identite();
    	Panel2 = new Etude();
    	Panel3 = new Profession();
    	Panel4 = new Loisirs();
    	
	    add("Identite",Panel1);  
	    add("Etude",Panel2);  
	    add("Profession",Panel3);   
	    add("Loisir",Panel4);
	    setBounds(0, 0,400,280);
    }
}
