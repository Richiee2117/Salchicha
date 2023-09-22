/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.sachicha.negocio;

/*
 * Realiza la suma de dos valores
 * @param a Es el valor 1
 * @param b Es el valor 2
 * @return Resultado de la suma de 2 valores
 */
public class Operacion {
    
   public static int sumar (int a, int b ){
      //int resultado = a+b;
       
       return a+b;
   
   }
        public boolean esPalindromo (String frase){
        
        frase = frase.toLowerCase().replace("í","i").replace(" ", "").replace(",","").replace("!","").replace("¡","").replace("ó","o").replace("á","a").replace("í","i");
       
        char [] letras = frase.toCharArray();
        
        String reversa = "";
        for (int a = letras.length-1;a>=0;a--){
            reversa += letras[a];
        }
      return frase.equals(reversa);
              
    }
    
}
