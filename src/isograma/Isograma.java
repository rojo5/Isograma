/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isograma;

/**
 *
 * @author rojo5
 */
public class Isograma {
    static String palabra="pilar";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(comprueba(palabra));
    }
   
    
   static public boolean comprueba(String palabra){
        char [] letra = palabra.toCharArray();
        int chivato=0;
        
        for(int i = 0; i< palabra.length();i++){
            for(int u =0;u<palabra.length();u++){
                if(letra[i] == letra[u]){
                    chivato++;
                }
            }
        }
        
        if(chivato == palabra.length()){
            return true;
        }
        return false;
    }
}
