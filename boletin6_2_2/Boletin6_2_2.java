
package boletin6_2_2;

import java.util.Scanner;
public class Boletin6_2_2 {

  
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Escribe un número");
        Scanner sc = new Scanner(System.in);
        Numero a = new Numero(sc.nextShort(),sc.nextShort());
a.operaciones();

    }
    
}
