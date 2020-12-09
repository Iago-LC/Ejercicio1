package boletín.pkg2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
        	int n;
        	int num;
        	int cont = 0;

        	System.out.println("Introduzca un número entre 3 e 10:");
        	n = sc.nextInt();	Scanner sc = new Scanner(System.in);

		while (n < 3 || n > 10) {
         	System.out.println("Error. O número introducido non é válido. Probe con outro");
            	n = sc.nextInt();
        }

	while (cont <= n) {
            num = 0;
            while (num < cont) {
                System.out.print("*");
                num++;
            }
            cont++;
            System.out.println("");

        }
    }

}
