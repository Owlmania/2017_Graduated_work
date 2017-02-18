import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui extends JFrame {
	
	
	private Mongo m;
	
	private void guiSettings()
	{
		
		  // window Settings
		  setBounds(100 , 100 , 500 , 200);
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  String[] position = {"NOUN", "VERB", "ADVERB","ADJECT","POSTPOSITION","SUFFIX"};
		  
		  Container contentPane = this.getContentPane();
		  
		  // create Objects of Components
		  JPanel pane = new JPanel();
		  pane.setLayout(new FlowLayout());
		  JButton buttonStart = new JButton("ADD");
		  JTextField text1 = new JTextField(10);
		  JComboBox combo = new JComboBox(position);
		  JLabel label = new JLabel("추가할 단어");
		  buttonStart.setMnemonic('S');
		  
		  // add Components
		  
		  pane.add(label);
		  pane.add(text1);
		  pane.add(combo);
		  pane.add(buttonStart);
		  contentPane.add(pane);
		  
		  // Define ActionListener
		  
		  buttonStart.addActionListener(new ActionListener(){
			  public void actionPerformed(ActionEvent e) {
				  m.Write(text1.getText(), combo.getSelectedItem().toString());
	            }
			  
		  });
		  
		  setVisible(true);
		
	}
	
	
	public Gui()
	{
		super("Make Dictionary");
		m = new Mongo();
		guiSettings();
	}
}
