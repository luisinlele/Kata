/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katafig1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daw104
 */
public class FizzBuzzTest {
    
    public FizzBuzzTest() {
    }

    @Test
    public void testFizzBuzzDeUnoDevuelveUno() {
        FizzBuzz fb = new FizzBuzz();
        int result = fb.getFizzBuzz(1);
        assertEquals(1, result);
        
    }
    
}
