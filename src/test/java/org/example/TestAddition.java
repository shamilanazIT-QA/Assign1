package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestAddition {
    addition addnew = new addition();


    @Test
    void main() {
        assertEquals(4 ,addnew.add(2, 2));

    }
    @Test
    void division(){
        assertEquals(1, addnew.divide(2,2));
    }
    @Test
    void divideByZero(){
        assertThrows(ArithmeticException.class,()-> addnew.divide(2,0));
    }

}