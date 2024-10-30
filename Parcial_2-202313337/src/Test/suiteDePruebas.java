package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Parcial.Parcial;


//EL SUITE DE PREUBAS 

/*hacemos 4 test
* 1. cuando el discriminante es 0
* 2. cuando a = 0
* 3. cuando el discriminante es negativo (-)
* 4. cuando el discriminante es positivo (+)
* 
*/

public class suiteDePruebas {
	
	private Parcial parcial;
	
	//para que inicie limpio y sin datos 
	
	@BeforeEach
    public void setUp() {
		
        this.parcial = new Parcial();
    }
	
	//1. cuando el discriminante es 0
	
	@Test
	public void testCalcularDiscriminante0() throws Exception {
        
        double[] raices = parcial.calcularRaices(1, -4, 4); 
        
        assertEquals(2.0, raices[0]);
        
        assertEquals(2.0, raices[1]);
    }

	//2. cuando a = 0
	@Test
    public void testCalcularAIgualACero() {
        
        Exception exception = assertThrows(Exception.class, () -> {
        	
            parcial.calcularRaices(0, 4, 2);
            
        });
        
        assertEquals("no se puede resolver porque a = 0 y no seria cuadratica", exception.getMessage());
    }
	
	
	//3. cuando el discriminante es negativo (-)
	

	@Test
    public void testCalcularDiscriminanteNegativo() {
       
        Exception exception = assertThrows(Exception.class, () -> {
        	
            parcial.calcularRaices(1, 2, 5); 
        });
        assertEquals("no se puede resolver porque su discriminante es negativo", exception.getMessage());
    }
	
	//4.  cuando el discriminante es positivo (+)
	
	@Test
	 public void testCalcularDiscriminantePositvo() throws Exception {
		 
		 
	        double[] raices = parcial.calcularRaices(1, -5, 6); 
	        
	        assertEquals(3.0, raices[0]);
	        
	        assertEquals(2.0, raices[1]);
	    }
}
