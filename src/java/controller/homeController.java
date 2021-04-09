package controller;

import dao.ClienteDao;
import dao.ConectarDB;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import models.Cliente;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * @since 20 de marzo del 2021
 * @author fille
 */
@Controller
public class homeController {
    private JdbcTemplate jdbcTemplate;

    /**
     *@since 4 de abril del 2021
     * @author fille
     */
    public homeController() {
        ConectarDB con = new ConectarDB();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }

    /**
     * @param int numero: este valor sirve para calcular el valor del producto
     * @return: retorna una vista
     * @since 4 de abril del 2021
     * @author fille
     */
    @RequestMapping(value="formCliente.htm", method=RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView();
        Cliente cliente = new Cliente();        
        mav.addObject("cliente",cliente);
        mav.setViewName("views/formCliente");
        return mav;
    }

    /**
     *@since 4 de abril del 2021
     * @author fille
     * @return
     */
    @RequestMapping(value="formCliente.htm", method=RequestMethod.POST)
    public ModelAndView mostrarCliente(){
        ModelAndView mav = new ModelAndView();
        String sql = "select * from cliente";
        
        List datos = this.jdbcTemplate.queryForList(sql);

        mav.addObject("cliente",datos);
        mav.setViewName("views/mostrarCliente");
        return mav;
    }
//------------------ metodo para agregar los datos del cliente ------------------    

    /**
     *@since 4 de abril del 2021
     * @author fille
     * @return
     */
        @RequestMapping(value="agregarCliente.htm", method=RequestMethod.GET)
    public ModelAndView cargarCliente(){
        ModelAndView mav = new ModelAndView();
//        Cliente cliente = new Cliente();   
         mav.addObject("cliente", new Cliente());
        mav.setViewName("views/agregarCliente");
        return mav;
    }

    /**
     *@since 4 de abril del 2021
     * @author fille
     * @param cli
     * @return
     */
    @RequestMapping(value="agregarCliente.htm", method=RequestMethod.POST)
    public ModelAndView agregarCliente( Cliente cli){
        ModelAndView mav = new ModelAndView();
        String sql = "insert into cliente (nombre,direccion,correo,telefono,salario) values (?,?,?,?,?) ";
        this.jdbcTemplate.update(
                sql,cli.getNombre(), cli.getDireccion(), cli.getCorreo(), cli.getTelefono(), cli.getSalario());
        mav.setViewName("redirect:/formCliente.htm");
        return mav;
    }
    
 //------------------- metodo para actualiar los datos del cliente --------------

    /**
     *@since 4 de abril del 2021
     * @author fille
     * @param request
     * @return
     */
        @RequestMapping(value="actCliente.htm", method=RequestMethod.GET)
    public ModelAndView actCliente(HttpServletRequest request){
        ModelAndView mav = new ModelAndView();
        int id = Integer.parseInt(request.getParameter("id"));
        String sql = "select * from cliente where id = ? ";
        List datos = this.jdbcTemplate.queryForList(sql,id);
        mav.addObject("cli", datos);
        mav.setViewName("views/actCliente");
        return mav;
    }

    /**
     *@since 4 de abril del 2021
     * @author fille
     * @param cli
     * @return
     */
    @RequestMapping(value="actCliente.htm", method=RequestMethod.POST)
    public ModelAndView actCliente( Cliente cli ){
     ModelAndView mav = new ModelAndView();
        String sql = "UPDATE cliente SET nombre = ?, direccion = ? , correo = ? , telefono = ? , salario = ? ";
        this.jdbcTemplate.update(
                sql,cli.getNombre(), cli.getDireccion(), cli.getCorreo(), 
                    cli.getTelefono(), cli.getSalario());
        mav.setViewName("redirect:/formCliente.htm");
        return mav;
    }
//------------ metodo para eliminar un campo de la tabla +---------------------

    /**
     *@since 4 de abril del 2021
     * @author fille
     * @param request
     * @return
     */
        @RequestMapping("borrarCliente.htm")
    public ModelAndView borrarCliente(HttpServletRequest request ){
     ModelAndView mav = new ModelAndView();
     int id = Integer.parseInt(request.getParameter("id"));
        String sql = "delete from cliente where id = ? ";
        this.jdbcTemplate.update(sql,id);
        mav.setViewName("redirect:/formCliente.htm");
        return mav;
    }

    /**
     *@since 4 de abril del 2021
     * @author fille
     * @return
     */
    @RequestMapping(value="consultar_cliente.htm", method=RequestMethod.GET)
    public ModelAndView listarclientexNombre(){
        ModelAndView mav = new ModelAndView();
        Cliente cliente = new Cliente();   
        mav.addObject("cliente", new Cliente());
        mav.setViewName("views/consultar_cliente");
        return mav;
    }

    /**
     *@since 4 de abril del 2021
     * @author fille
     * @param cli
     * @param result
     * @param status
     * @return
     */
    @RequestMapping(value="consultar_cliente.htm", method=RequestMethod.POST)
    public ModelAndView listarclientexNombre(
            @ModelAttribute ("cliente")Cliente cli,
            BindingResult result,
            SessionStatus status){
        ModelAndView mav = new ModelAndView();
        ClienteDao traDao = new ClienteDao();
        String nom = cli.getNombre();
        System.out.println("nombre:"+nom);
        mav.addObject("cliente",traDao.consultarClienteByNombre(nom));
        mav.setViewName("views/listarcliente");
        return mav;
    }
}
