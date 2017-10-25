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
         opcion = sc.nextInt();
         
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
        //Pedir dos números
        int num1 = 0;
        int num2 = 0;
        
        
        System.out.println("Dime el primer número: ");
        num1= sc.nextInt();
        System.out.println("Dime el segundo número: ");
        num2= sc.nextInt();
        
       
        if(num1<num2) { 
            for(int i=num1++;num1<num2;num1++) 
            {
                System.out.println("Los números intermedios son: "+ num1);
            }
        } else if(num1==num2){
            System.out.println("Los números son iguales");
        } else if(num1>num2){
            for(int i=num2++;num1>num2;num2++){
                System.out.println("Los números intermedios son: "+ num2);
            }
        }
    } //Hecho
    public static void ejercicio2(Scanner sc){
        //Los veinte primeros múltiplos de 5
        for(int i=0;i==20;i*5){
        System.out.println(i);    
        }
    }
    public static void ejercicio3(Scanner sc){
        
    }
    public static void ejercicio4(Scanner sc){
        
    }
    public static void ejercicio5(Scanner sc){
        
    }
    public static void ejercicio6(Scanner sc){
        
    }
    public static void ejercicio7(Scanner sc){
        
    }
    public static void ejercicio8(Scanner sc){
        
    }
    public static void ejercicio9(Scanner sc){
        
    }
    public static void ejercicio10(Scanner sc){
        
    }
    public static void ejercicio11(Scanner sc){
        
    }
    public static void ejercicio12(Scanner sc){
        
    }
    public static void ejercicio13(Scanner sc){
        
    }
    
}
