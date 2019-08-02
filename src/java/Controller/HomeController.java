/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/* Estas son las importacione que hay que hacer de base */
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Lucas
 */
@Controller //Se le informa al framework que esta clase es un controllador
public class HomeController 
{
    
    @RequestMapping("home.htm") // Aca se pone la respuesta
    public ModelAndView home(HttpServletRequest request)
    {
        ModelAndView mav = new ModelAndView();
        int id = (request.getParameter("id")!= null) ? Integer.parseInt( request.getParameter("id")):0;
        int id2 = (request.getParameter("id2") != null) ? Integer.parseInt(request.getParameter("id2")): 0;
        
        int id3 = id + id2;
        int id4 = id - id2;

        mav.addObject("id", id3);
        mav.addObject("id2", id4);
        
        mav.setViewName("home"); //Solo el nombre, sin el .jsp
    
        
        return mav;

    }
    
    @RequestMapping("nosotros.htm") // Aca se pone la respuesta
    public ModelAndView nosotros()
    {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("nosotros"); //Solo el nombre, sin el .jsp
        return mav;
    }
}
