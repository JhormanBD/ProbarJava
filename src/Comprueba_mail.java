import javax.swing.*;
public class Comprueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean arroba = false;
		String email = JOptionPane.showInputDialog("Digite su email :");
		
		int intString = email.length();
		
		System.out.println("El largo de el email es "+intString);
		
		for(int i = 0 ;i<email.length();i++) {
			
			if(email.charAt(i)=='@') {
				arroba = true;
			}
		}
		
		if (arroba==true) {
			
			System.out.println("El email ingresado es correcto");
			
		}
		else {
			System.out.println("Correo incorrecto");
		}
		
		

	}

}
