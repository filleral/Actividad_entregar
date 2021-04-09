/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fille
 */
public class productoTest {
    
    /**
     *
     */
    public productoTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of calcularcosto method, of class producto.
     */
    @Test
    public void testCalcularcosto() {
        System.out.println("calcularcosto");
        int cantidad = 0;
        int costo = 0;
        producto instance = new producto();
        int expResult = 0;
        int result = instance.calcularcosto(cantidad, costo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of descuento method, of class producto.
     */
    @Test
    public void testDescuento() {
        System.out.println("descuento");
        int valor = 0;
        int desc = 0;
        producto instance = new producto();
        int expResult = 0;
        int result = instance.descuento(valor, desc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
