/**
 * 
 */
package com.pedido.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author pablo
 *
 */
@Controller
public class PedidoController {

	@RequestMapping(value="/pedido", method = RequestMethod.GET)
	public ModelAndView loadSetting()
	{
		//String message = "Agrego este mensaje";
		ModelAndView mav = new ModelAndView("pedidoBack");
		//mav.addObject("greeting", message);
		return mav;
	}
	
	/*
    @RequestMapping("/pedido")
    public String hello(Model model) {
         
        model.addAttribute("greeting", "Hello Spring MVC");
         
        return "pedido";
         
    }*/
}
