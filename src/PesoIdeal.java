import javax.swing.*;
public class PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero = "";
		
		do {
			genero=JOptionPane.showInputDialog("Introduce género (H/M)");
		}
		
		while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Inserte altura en centímetros:"));
		int peso=0;
		
		if(genero.equalsIgnoreCase("H")) {
			peso = altura - 110;
		
		}
		else if (genero.equalsIgnoreCase("M")) {
			peso = altura - 120;
		}
		
		System.out.println("Tu peso ideal sería : "+peso+" Kg");
		
		

	}

}
