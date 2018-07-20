import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		int aux = 1;
		System.out.println("El numero insertado es "+num);
		int cont = 0;
		for(;0<num;num--) {			
			System.out.println("Ciclo #"+cont+" es igual a "+num+"*"+aux);		
			aux*=num;				
			cont++;
		}
		
		System.out.println("El factorial del número "+cont+" es:  "+aux);		

	}

}
