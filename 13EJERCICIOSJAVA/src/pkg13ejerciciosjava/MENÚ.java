/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author flotante
 */
public class MENÚ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); 
     //MENU PARA QUE UN USUARIO SELECCIONE LA OPCION QUE QUIERE
     boolean salir = false;
     int opcion; // para guardar la opcion del usuario
     while(!salir){
         //Pedir la opción al usuario
         System.out.println("1. Ejercicio 1\n2. Ejercicio 2\n3. Ejercicio 3\n4. Ejercicio 4"
                 + "\n5. Ejercicio 5\n6. Ejercicio 6\n7. Ejercicio 7\n8. Ejercicio 8"
                 + "\n9. Ejercicio 9\n10. Ejercicio 10\n11. Ejercicio 11\n12. Ejercicio 12"
                 + "\n13. Ejercicio 13\n14. Salir");
         System.out.println("Escribe una opcion: ");
         opcion = sn.nextInt();
         
         switch(opcion){
             case 1:
                 ejercicio1(sc);
                 break;
             case 2:
                 ejercicio2(sc);
                 break;
             case 3:
                 ejercicio3(sc);
                 break;
             case 4:
                 ejercicio4(sc);
                 break;
             case 5:
                 ejercicio5(sc);
                 break;
             case 6:
                 ejercicio6(sc);
                 break;
             case 7:
                 ejercicio7(sc);
                 break;
             case 8:
                 ejercicio8(sc);
                 break;
             case 9:
                 ejercicio9(sc);
                 break;
             case 10:
                 ejercicio10(sc);
                 break;
             case 11:
                 ejercicio11(sc);
                 break;
             case 12:
                 ejercicio12(sc);
                 break;
             case 13:
                 ejercicio13(sc);
                 break;
             case 14:
                 salir=true;
                 break;
             default:
                 System.out.println("Has metido mal el número");
         }
     }
    }
    public static void ejercicio1(Scanner sc){
        
    }
   
    
}
