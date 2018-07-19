import javax.swing.*;
public class Probando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave = "Jhorman";
		String pass = "";
		
		while(clave.equals(pass)==false) {
			pass=JOptionPane.showInputDialog("Inserte contraseña pls");
			if(clave.equals(pass)==false) {
				System.out.println("Contraseña incorrecta: "+pass);
			}
		}
		System.out.println("Contraseña correcta: "+pass);
	}

}
