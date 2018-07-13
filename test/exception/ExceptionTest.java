/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class ExceptionTest {
    
    
    @Test
    public void declenchErreur(){
        Integer a=1;
        Integer b=null;
        
        int c = a + b;
    }
    
    @Test
    private void test(){
        declenchErreur();
    }
    
}
