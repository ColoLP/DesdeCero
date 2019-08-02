
package Models;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class PersonaValidar implements Validator 
{
    // Esta herramienta ayuda a tener un validador customizado sobre las clases. 
    @Override
    public boolean supports(Class<?> type) {
        
        //Es conveniente crear una clase Validator por cada clase. 
        //Plantilla: return TuClase.class.isAssignableFrom(type);
        return Persona.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) 
    {
        Persona pers = (Persona) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre","required.nombre","El campo nombre es obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "edad","required.edad","El campo edad es obligatorio");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "correo","required.correo","El campo correo es obligatorio");
        
        
    }
    
}
