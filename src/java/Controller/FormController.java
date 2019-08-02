/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.Persona;
import Models.PersonaValidar;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author Lucas
 */

@Controller
@RequestMapping("form.htm")
public class FormController 
{

    private PersonaValidar personaValidar;

    public FormController() 
    {
        this.personaValidar = new PersonaValidar();
    }
    
    
    @RequestMapping(method= RequestMethod.GET) // Este metodo es para renderizar la vista, si no no funca. 
    public ModelAndView form()
    {
        //return new ModelAndView("formulario1","command",new Persona("Lucas",27,"lucas.galetti1991@gmail.com")); Envia al formulario el objeto con datos, y se cargan automaticamente
        //return new ModelAndView("formulario1","command",new Persona());
        ModelAndView mav = new ModelAndView();
        mav.setViewName("formulario1");
        mav.addObject("persona", new Persona());
        return mav;
    
    }
    
    @RequestMapping(method = RequestMethod.POST) //Esto significa que estoy obteniendo los datos del formulario y ahora le agrego le metodo de vaidacion
    public ModelAndView form(@ModelAttribute("persona") Persona p,BindingResult result, SessionStatus status)
    {
        this.personaValidar.validate(p, result);
        
        if(result.hasErrors())
        {
            //Volvemos al formulario por que los datos ingresados por el usuario son incorrectos
           // return new ModelAndView("formulario1","command",new Persona());
            ModelAndView mav = new ModelAndView();
            mav.setViewName("formulario1");
            mav.addObject("persona", new Persona());
            return mav;
        }else
        {
            //Aca entro si el usuario ingreso todo Ok.
             ModelAndView mav = new ModelAndView();
             mav.setViewName("exito");
             mav.addObject("nombre", p.getNombre());
             mav.addObject("correo", p.getCorreo());
             mav.addObject("edad",p.getEdad());
             mav.addObject("paises", status);
             
             return mav;
        }
            
    }
    /*public String form(Persona per,ModelMap model)
    {
        model.addAttribute("nombre",per.getNombre());
        model.addAttribute("correo",per.getCorreo());
        model.addAttribute("edad",per.getEdad());
        
        return "exito";
    }Metodo viejo, el primero que hicimos para verlo*/
    
   
    
    //Metodo para ponerle datos al Select
    @ModelAttribute("lstPaises")
    public Map<String,String> lstPaises()
    {
        Map<String,String> lstPaises = new LinkedHashMap<>();
        lstPaises.put("1", "Argentina");
        lstPaises.put("2", "Chile");
        lstPaises.put("3", "Perú");
        lstPaises.put("4", "Ecuador");
        lstPaises.put("5", "Bolivia");
        lstPaises.put("6", "México");
        
        return lstPaises;
    }
    
}
