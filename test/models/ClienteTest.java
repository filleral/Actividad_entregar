/* esto se utiliza para las pruebas de las clases 
 * 
 * 
 *
 */

package models;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *@since 20 de marzo del 2021
 * @author fille
 */
public class ClienteTest {
    
    /**
     * @since 4 de abril del 2021
     * @author fille
     */
    public ClienteTest() {
    }
    
    /**
     *@since 4 de abril del 2021
     * @author fille
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *@since 4 de abril del 2021
     * @author fille
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *@since 4 de abril del 2021
     * @author fille
     */
    @Before
    public void setUp() {
    }
    
    /**
     *@since 4 de abril del 2021
     * @author fille
     */
    @After
    public void tearDown() {
    }

    /**
     * @since 4 de abril del 2021
     * @author fille
     */
    @Test
    public void testGetSalario() {
        System.out.println("getSalario");
        Cliente instance = new Cliente();
        double expResult = 0.0;
        double result = instance.getSalario();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * @since 4 de abril del 2021
     * @author fille
     * Test of setSalario method, of class Cliente.
     */
    @Test
    public void testSetSalario() {
        System.out.println("setSalario");
        double salario = 0.0;
        Cliente instance = new Cliente();
        instance.setSalario(salario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * @since 4 de abril del 2021
     * @author fille
     * Test of getNombre method, of class Cliente.
     */
    @Ignore
    public void testGetNombre() {
        System.out.println("getNombre");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * @since 4 de abril del 2021
     * @author fille
     * Test of setNombre method, of class Cliente.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Cliente instance = new Cliente();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * @since 4 de abril del 2021
     * @author fille
     * Test of getDireccion method, of class Cliente.
     */
    @Ignore
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * @since 4 de abril del 2021
     * @author fille
     * Test of setDireccion method, of class Cliente.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        Cliente instance = new Cliente();
        instance.setDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * @since 4 de abril del 2021
     * @author fille
     * Test of getCorreo method, of class Cliente.
     */
    @Ignore
    public void testGetCorreo() {
        System.out.println("getCorreo");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getCorreo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * @since 4 de abril del 2021
     * @author fille
     * Test of setCorreo method, of class Cliente.
     */
    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "";
        Cliente instance = new Cliente();
        instance.setCorreo(correo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * @since 4 de abril del 2021
     * @author fille
     * Test of getTelefono method, of class Cliente.
     * @ignore
     * 
     */
    @Ignore
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * @since 4 de abril del 2021
     * @author fille
     * Test of setTelefono method, of class Cliente.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String telefono = "";
        Cliente instance = new Cliente();
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * @since 4 de abril del 2021
     * @author fille
     * Test of getId method, of class Cliente.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Cliente instance = new Cliente();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * @since 4 de abril del 2021
     * @author fille
     * Test of setId method, of class Cliente.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Cliente instance = new Cliente();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
