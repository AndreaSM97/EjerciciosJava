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
    } //HECHO
    public static void ejercicio2(Scanner sc){
        //Los veinte primeros múltiplos de 5
        
        for(int i=1;i<=20;i++){
        System.out.println(i*5);    
        }
    } //HECHO
    public static void ejercicio3(Scanner sc){
        //LA MEDIA DE 15 NUMEROS ESCRITOS POR TECLADO
        int media;
        int suma = 0;
        int num;
        
        for(int i=1;i<=15;i++){
        System.out.println("Dime un número: ");
        num= sc.nextInt();
            suma=suma+num;
        }
                System.out.println("La suma es: ");
                System.out.println(suma);
                media=suma/15;
                System.out.println("La media es: " + media);
    } //HECHO
    public static void ejercicio4(Scanner sc){
        //Media entre n numeros introducidos por teclado
        int media;
        int suma = 0;
        int num;
        int numeros = 0;
          
        System.out.println("Dime cuantos números vas a meter: ");
        numeros= sc.nextInt();
        for(int i=1;i<=numeros;i++){
        System.out.println("Dime un número: ");
        num= sc.nextInt();
            suma=suma+num;
        }
                System.out.println("La suma es: ");
                System.out.println(suma);
                media=suma/numeros;
                System.out.println("La media es: " + media);
    } //HECHO
    public static void ejercicio5(Scanner sc){
        //Dar una cantidad de horas, min y seg y que nos de todo en min
        int hora;
        int min;
        int seg;
        int tiempo;
        
        System.out.println("Dime las horas: ");
        hora= sc.nextInt();
        System.out.println("Dime los minutos: ");
        min= sc.nextInt();
        System.out.println("Dime los segundos: ");
        seg= sc.nextInt();
        
       hora=hora*3600;
       min=min*60;
       tiempo=hora+min+seg;
       System.out.println(tiempo+ " segundos");
    } //HECHO
    public static void ejercicio6(Scanner sc){
        //CONVERTIR SEGUNDOS EN HORAS,MIN Y SEG
        int seg;
        int horas;
        int minutos;
        
        
        System.out.println("Dime los segundos: ");
        seg= sc.nextInt();
        
        horas=seg/3600;
        minutos=seg/60;
        
        System.out.println("Son " +horas +" horas," +minutos +" minutos," +seg +" segundos");
    } //HECHO
    public static void ejercicio7(Scanner sc){
        //10 NUMEROS Y QUE ME DIGA CUAL MAYOR Y CUAL MENOR
        int num = 0;
        int mayor = 0;
        int menor = 0;
        
        
        for (int i=0;i<10;i++){
            System.out.println("Dime un numero: ");
            num= sc.nextInt();
            if (menor!=0&&mayor!=0){
            if(num>mayor){
              mayor=num;  
            }if (num<menor){
                menor=num;
            } }else {
                mayor=num;
                menor=num;
            }
        } 
        
        System.out.println("El número mayor es: " +mayor);
        System.out.println("El número menor es: " +menor);
    } //HECHO
    public static void ejercicio8(Scanner sc){
        //Pedir número y que nos de su factorial
        int num;
        int resultado = 1;
        System.out.println("Dime un número: ");
        num= sc.nextInt();
        for (int i=num;i>0;i--) {
            resultado=resultado *i;
        } System.out.println("El factorial de " +num +" es " +resultado);
    } //HECHO
    public static void ejercicio9(Scanner sc){
        //3 numeros y que los imprima de mayor a menor
        int a = 0, b = 0, c = 0;
        int mayor = 0;
        int menor = 0;
        int medio = 0;
        
        System.out.println("Dime el primer número: ");
        a=sc.nextInt();
        System.out.println("Dime el segundo número: ");
        b=sc.nextInt();
        System.out.println("Dime el tercer número: ");
        c=sc.nextInt();
        
        if(a>b&&a>c){
            mayor=a;
        }else if(b>a&&b>c){
            mayor=b;
        } else {
            mayor=c;
        }
        if(a<b&&a<c){
            menor=a;
        } else if(b<a&&b<c){
            menor=b;
        } else {
            menor=c;
            
        }  medio=(a+b+c)-(mayor+menor);
               
                
        System.out.println("");
        System.out.println("El resultado es: ");
        System.out.println(mayor+ " " +medio+ " " +menor);
    } //HECHO
    public static void ejercicio10(Scanner sc){
        //PEDIR NOTA Y SACARLA EN LETRA POR PANTALLA
        int num;
        System.out.println("Dime un número del 1 al 10: ");
        num= sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
            case 10:
                System.out.println("Diez");
                break;
            default:
                System.out.println("Numero erroneo.");
                break;
                
        }
        
    } //HECHO
    public static void ejercicio11(Scanner sc){
        //NOTA NÚMERICA Y DE EL EQUIVALENTE
        int num = 0;
        System.out.println("Dime la nota: ");
        num=sc.nextInt();
        if (num<5){
            System.out.println("Suspenso");
        } else if(num==5){
            System.out.println("Suficiente");
        }else if(num==6){
            System.out.println("Bien");
        } else if(num==7||num==8){
            System.out.println("Notable");
        }else if(num==9||num==10){
            System.out.println("Sobresaliente");
        }
    } //HECHO
    public static void ejercicio12(Scanner sc){
        //NUMERO DE ALUMNOS, NOTA Y SAQUE LA MEDIA Y DIGA APROBADOS Y SUSPENSOS
        int alumnos;
        int nota = 0;
        int media;
        int aprobado = 0;
        int suspenso = 0;
        int suma = 0;
        
        System.out.println("Dime cuantos alumnos hay: ");
        alumnos=sc.nextInt();
        
        for(int i=0;i<alumnos;i++){
            System.out.println("Dime la nota: ");
            nota=sc.nextInt();
            suma=suma+nota;
            if(nota<5){
               suspenso++;
            } 
            else{
                  aprobado++;
            suma=suma+nota;
            }
        }
        media=suma/alumnos;
        System.out.println("La media es: " +media);
        System.out.println("El numero de aprobados es: " +aprobado);
        System.out.println("El numero de suspensos es: " +suspenso);
        
    } //HECHO
    public static void ejercicio13(Scanner sc){
       //IMPRIMIR NUMEROS PRIMOS ENTRE 1 Y N, SIENDO N METIDO POR EL USUARIO
       int num;
       int contador=2;
       boolean esprimo=false;
       
       //ME DICE SI UN NUMERO ES PRIMO O NO ES PRIMO
        System.out.println("Dime el número: ");
        num=sc.nextInt();
        if(num%contador != 0 && contador<num){
            contador++;
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
            
        }
        for(int i=num;i>=contador;i++){
            
        }
       }
        
    }
    

