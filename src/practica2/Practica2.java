/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Practica2 {


    public static void main(String[] args) {
        // TODO code application logic here
    
        int opcion = 0;
        
        String Cadena = "";
        char Caracter = ' ';
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite opcion");//sout
        opcion = teclado.nextInt();
        
        switch (opcion) {
            case 1:
                teclado = new Scanner(System.in);
                System.out.println("Digite la cadena");//sout
                Cadena = teclado.nextLine();
                
                teclado = new Scanner(System.in);
                System.out.println("Digite el caracter a buscar");//sout   
                Caracter = teclado.next().charAt(0);

                Clases pre1 = new Clases();

                int veces = pre1.Pregunta1(Cadena, Caracter);
                System.out.println("la cadena tiene el numero " + veces);
                
                break;
            case 2:
                teclado = new Scanner(System.in);
                System.out.println("Digite la cadena con S ");//sout
                Cadena = teclado.nextLine();

                Clases pre2 = new Clases();
                String sustitucion = pre2.Pretunga2(Cadena);
                System.out.println("Resultado " + sustitucion);
                
                break;
            
            case 3:
                teclado = new Scanner(System.in);
                System.out.println("Digite la cadena");//sout
                Cadena = teclado.nextLine();
                
                Clases pre3 = new Clases();
                pre3.Pregunta3(Cadena);
                System.out.println("Cadena sin Espacion " + pre3.Pregunta3(Cadena));
                
                break;
                
            case 4:
                teclado = new Scanner(System.in);
                System.out.println("Digite la cadena");//sout
                Cadena = teclado.nextLine();
                
                Clases pre4 = new Clases();
                System.out.println("Cadena con Asteriscos: "+ pre4.Pregunta4(Cadena));
                
                break;
                
            case 5:  
                
                teclado = new Scanner(System.in);
                System.out.println("Digite la cadena");//sout
                Cadena = teclado.nextLine();
                Clases pre5 = new Clases();
                
                System.out.println("la cadena contiene "+pre5.Pregunta5(Cadena));
                break;
                         
            case 6:
                teclado = new Scanner(System.in);
                System.out.println("Digite la cadena");//sout
                Cadena = teclado.nextLine();
                Clases pre6 = new Clases();
                
                // palabras al revez
                //System.out.println("Las palabras al reves: "+pre6.Pregunta6(Cadena));
                              
                System.out.println("palabras al revez " + pre6.Pregunta6b(Cadena));
                
                break;
                
            case 7:
                
                teclado = new Scanner(System.in);
                System.out.println("Digite la cadena");//sout
                Cadena = teclado.nextLine();
                Clases pre7 = new Clases();
                             
                System.out.println("la letra que se encuentra en el centro de la palabra es " + pre7.Pregunta7(Cadena));
                
                break;
                      
            case 8:
                teclado = new Scanner(System.in);
                System.out.println("Digite la cadena");//sout
                Cadena = teclado.nextLine();
                Clases pre8 = new Clases();
                          
                System.out.println("palabras al revez " + pre8.Pregunta8(Cadena)); 
                
                break;
                
            case 9:
             
                Integer num1 =0;
                Integer num2 =0;
                Integer num3 =0;
                
                teclado = new Scanner(System.in);
                System.out.println("Digite el primer numero");//sout
                num1 = teclado.nextInt();
                
                teclado = new Scanner(System.in);
                System.out.println("Digite el Segundo numero");//sout
                num2 = teclado.nextInt();
                
                teclado = new Scanner(System.in);
                System.out.println("Digite el Tercero numero");//sout
                num3 = teclado.nextInt();

                Clases pre9 = new Clases();
                          
                System.out.println("palabras al revez " + pre9.Pregunta9(num1,num2,num3));
                
                break;
                
            case 10:
                
                break;
                
       
            default:
                throw new AssertionError();
        }
        
        

    }
        
}
