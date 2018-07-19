import java.util.*;
public class AdivinaNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =(int)(Math.random()*100);
		
		Scanner entrada = new Scanner(System.in);
		
		int numero =0;
		int intentos = 0;
		
		while(numero!=num){
			System.out.println("Introduce numero pls");
			numero = entrada.nextInt();
			
			if(num<numero) {
				System.out.println("Más bajo");
			}
			else if(num>numero) {
				System.out.println("Más alto");
			}
			intentos++;
		}
		System.out.println("Correcto");
		System.out.println("Número de intentos: "+intentos);
	}

}
