/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katafig1;

/**
 *
 * @author daw104
 */
public class FizzBuzz {
    
    public String getFizzBuzz(int n){
        String resultado = String.valueOf(n);
        String textoNumero = resultado;
        if (textoNumero.contains("3"))
        {
            resultado = "Fizz";
        } 
        if (n%3==0)
        {
            resultado = "Fizz";
        }
         if (n%5==0)
        {
            resultado = "Buzz";
        }
        if (n%3==0 && n%5==0)
        {
            resultado = "FizzBuzz";
        }
         return resultado;
    
    }
    }
    
    
