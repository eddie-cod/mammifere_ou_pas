package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Fenetre;

public class ControllerButton implements ActionListener{

	Fenetre f;	
	String r1, r2, r3, v1, v2, v3;
	int note = 0;
	
	public ControllerButton(Fenetre f){
		this.f = f;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.f.BValidate){
			
			if(f.RB1.isSelected())
				r1 = new String(f.RB1.getText());
			else if(f.RB2.isSelected())
				r1 = new String(f.RB2.getText());
			else{
				f.TAPrint.setText("Veuillez répondre à la première question");
				return;
			}
			
			if(f.CBcheck.isSelected())
				r2 = new String("est un insecte");
			else
				r2 = new String("n'est pas un insecte");

			r3 = new String((String)f.CBPlanete.getSelectedItem());
			
			//line1
			if(r1.equals("Mammifère")){
				note++;
				v1 = new String("C'est exact.");
			}
			else
				v1 = new String("Ce n'est pas exact.");
			
			//line2
			if(r2.equals("n'est pas un insecte")){
				note++;
				v2 = new String("C'est exact.");
			}
			else
				v2 = new String("Ce n'est pas exact.");
			
			//line3
			if(r3.equals("mercure")){
				note++;
				v3 = new String("C'est exact.");
			}
			else
				v3 = new String("Ce n'est pas exact.");
			
			String message = new String("Vous prétendez que :\n"
					+ "Un dauphin est un " + r1 + " : " + v1 + "\n"
					+ "Une arraignée " + r2 + " : " + v2 +"\n"
					+ "La planète la plus proche du soleil est " + r3 + " : " + v3 +"\n"
					+ "Votre note est donc de " + note + "/3.");
			f.TAPrint.setText(message);
			f.BValidate.setEnabled(false);
		}
		
	}

}
