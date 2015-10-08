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
public class Clases {

    String cadena = "";
    
    public int Pregunta1(String cadena, char c){
    
        int veces = 0;
        char[] caracteres = cadena.toCharArray();
        for (int i = 0; i <= caracteres.length - 1; i++) {
            if (c == caracteres[i]) {
                veces++;
            }
        }
        return veces;      
    }
    
    public String Pretunga2(String cad ){
              
        cadena = cad.replaceAll("S","X");
        return cadena;
        
    }
    
    public String Pregunta3(String cad){
        
        cadena = cad.replaceAll(" ","");
        return cadena;
    }
    
    
    public String Pregunta4(String cad){
    
        cadena = cad.replaceAll(" ", "*");      
        return cadena;
    }
    
    public int Pregunta5(String cad){
    
        String[] Vocales = {"a","e","i","o","u"};
        cadena = "";
        Integer contador=0;
        
        for (int i = 0; i <= cad.length()-1; i++) {
        
            for (int j = 0; j < 5; j++) {
                
                if (cad.substring(i, i+1).equals(Vocales[j])) {
                    contador++;
                } 
            }
        }
        return contador;
    }
      
    
    public String Pregunta6b(String cad){
        
        String[] partes = cad.split(" ");
        String part1 = partes[0];
        String part2 = partes[1];
        
        return part2+ " " +part1;
    }   
    
    public String Pregunta8(String cad){

            for (int i=cad.length()-1; i>=0; i--){
            
                cadena += cad.charAt(i);
            }
    		
        return cadena;
    } 
    
    public String Pregunta9(Integer num1, Integer num2, Integer num3){
    
        cadena = num1.toString()+num2.toString()+num3.toString();
    
        return cadena;
    }
    
    public String Pregunta7(String cad){
    
        //if((cad.length()%2) == 0 ) {
        
        int index = cad.length()/2;   
        cadena = cad.substring(index, index+1);    
          
       // }
        return cadena;
    }
    
}
