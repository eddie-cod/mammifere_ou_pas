package view;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import controller.ControllerButton;

public class Fenetre extends JFrame{ private static final long serialVersionUID = 6999930004738645384L;
	
	public JLabel LQ1, LQ2, LQ3;
	public JButton BValidate;
	public JComboBox<String> CBPlanete;
	public JTextArea TAPrint;
	public JCheckBox CBcheck;
	public JRadioButton RB1,RB2;

	private String[] planetes;
	
	public Fenetre(){
		super("QCM");
		this.setSize(450, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		//labels
		LQ1 = new JLabel("Un dauphin est un : ");
		LQ2 = new JLabel("Une araignée est un insecte : ");
		LQ3 = new JLabel("La planète la plus proche du soleil est : ");
		
		//radiobutton
		ButtonGroup bg = new ButtonGroup();
		RB1 = new JRadioButton("Poisson");
		RB2 = new JRadioButton("Mammifère");
		bg.add(RB1);		bg.add(RB2);
		
		//checkbox
		CBcheck = new JCheckBox();
		
		//button
		BValidate = new JButton("Corriger");
		BValidate.addActionListener(new ControllerButton(this));
		
		//textarea
		TAPrint = new JTextArea(13,35);
		TAPrint.setEditable(false);
		
		//combobox
		planetes = new String[] {"Terre","Venus","Saturne","Jupiter","Uranus","Pluton","Mars","Mercure"};
		CBPlanete = new JComboBox<String>(planetes);
		
		//Disposition
		Container F= this.getContentPane();
		this.setLayout(new BoxLayout(F, BoxLayout.Y_AXIS));
		
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel p5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
//		p1.setLayout(arg0);
		p1.add(LQ1);		p1.add(RB1);		p1.add(RB2);
		p2.add(LQ2);		p2.add(CBcheck);
		p3.add(LQ3);		p3.add(CBPlanete);
		p4.add(BValidate);
		p5.add(TAPrint);
		
		F.add(p1);
		F.add(p2);
		F.add(p3);
		F.add(p4);
		F.add(p5);
		
		
		
		this.setVisible(true);
	}
	
}
