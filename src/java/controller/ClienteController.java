/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import models.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @version 1.0
 * @author Filleral
 * @since 10 marzo 2021
 *
 */
@Controller
public class ClienteController {

    /**
     *
     * @return
     */
    @RequestMapping(value = "formCliente.htm", method = RequestMethod.GET)
    public ModelAndView home(){
    ModelAndView mov = new ModelAndView();
    Cliente cliente = new Cliente();
    mov.addObject("cliente",cliente);
   
    mov.setViewName("views/formCliente");
    return mov;
        
    } 
    
    /**
     *
     * @return
     */
    @RequestMapping(value = "formCliente.htm", method = RequestMethod.POST)
    public ModelAndView mostrarCliente(){
    ModelAndView mav = new ModelAndView();
    Cliente cliente = new Cliente();
    mav.setViewName("views/formCliente");
    mav.addObject("cliente",cliente);
   
    mav.setViewName("views/mostrarCliente");
    return mav;
        
    } 
}