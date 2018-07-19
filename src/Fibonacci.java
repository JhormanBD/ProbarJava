
public class Fibonacci {

	public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int aux;
        int limite = 40000;
        String cadena=n1+","+n2;
       

        while (n2 + n1 <= limite) {
            aux = n1;
            n1 = n2;
            n2 = aux + n1;
            cadena=cadena+","+n2;
            
            
        }
        System.out.println(cadena);
    }

}
