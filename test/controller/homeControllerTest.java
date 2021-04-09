/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import javax.servlet.http.HttpServletRequest;
import models.Cliente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author fille
 */
public class homeControllerTest {
    
    public homeControllerTest() {
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
     * Test of home method, of class homeController.
     */
    @Test
    public void testHome() {
        System.out.println("home");
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.home();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarCliente method, of class homeController.
     */
    @Test
    public void testMostrarCliente() {
        System.out.println("mostrarCliente");
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.mostrarCliente();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cargarCliente method, of class homeController.
     */
    @Test
    public void testCargarCliente() {
        System.out.println("cargarCliente");
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.cargarCliente();
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of agregarCliente method, of class homeController.
     */
    @Test
    public void testAgregarCliente() {
        System.out.println("agregarCliente");
        Cliente cli = null;
        homeController instance = new homeController();
        ModelAndView expResult = null;
        //ModelAndView result = instance.agregarCliente(cli);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actCliente method, of class homeController.
     */
    @Test
    public void testActCliente_HttpServletRequest() {
        System.out.println("actCliente");
        HttpServletRequest request = null;
        homeController instance = new homeController();
        ModelAndView expResult = null;
        //ModelAndView result = instance.actCliente(request);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actCliente method, of class homeController.
     */
    @Test
    public void testActCliente_Cliente() {
        System.out.println("actCliente");
        Cliente cli = null;
        homeController instance = new homeController();
        ModelAndView expResult = null;
        //ModelAndView result = instance.actCliente(cli);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of borrarCliente method, of class homeController.
     */
    @Test
    public void testBorrarCliente() {
        System.out.println("borrarCliente");
        HttpServletRequest request = null;
        homeController instance = new homeController();
        ModelAndView expResult = null;
        //ModelAndView result = instance.borrarCliente(request);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listarclientexNombre method, of class homeController.
     */
    @Test
    public void testListarclientexNombre_0args() {
        System.out.println("listarclientexNombre");
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.listarclientexNombre();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listarclientexNombre method, of class homeController.
     */
    @Test
    public void testListarclientexNombre_3args() {
        System.out.println("listarclientexNombre");
        Cliente cli = null;
        BindingResult result_2 = null;
        SessionStatus status = null;
        homeController instance = new homeController();
        ModelAndView expResult = null;
        //ModelAndView result = instance.listarclientexNombre(cli, result_2, status);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
