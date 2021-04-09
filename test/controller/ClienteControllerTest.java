/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author fille
 */
public class ClienteControllerTest {
    
    public ClienteControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of home method, of class ClienteController.
     */
    @Test
    public void testHome() {
        System.out.println("home");
        ClienteController instance = new ClienteController();
        ModelAndView expResult = null;
        ModelAndView result = instance.home();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarCliente method, of class ClienteController.
     */
    @Test
    public void testMostrarCliente() {
        System.out.println("mostrarCliente");
        ClienteController instance = new ClienteController();
        ModelAndView expResult = null;
        ModelAndView result = instance.mostrarCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
