package Parcial;

//CLASE PARCIAL

public class Parcial {
	
	// es double[] porque hay que retorna 2 raices
	
	public double[] calcularRaices(int a, int b, int c) throws Exception {
		
        // a no puede ser 0 porque nos cumpliria con la ecuacion que nos piden
		
        if (a == 0) {
        	
            throw new Exception("no se puede resolver porque a = 0 y no seria cuadratica");
        }

        //es la forma de hallar el discriminante con su formula 
        
        int discriminante = b * b - 4 * a * c;

        // el discriminante no puede ser negativo entonces:
        
        if (discriminante < 0) {
        	
            throw new Exception("no se puede resolver porque su discriminante es negativo");
        }

        // nos piden las dos raíces de los dos casos tanto positivo como negativo
        
        double raiz1 = (-b + Math.sqrt(discriminante)) / (2.0 * a); 
        
        double raiz2 = (-b - Math.sqrt(discriminante)) / (2.0 * a);

        //las dos raices
        
        return new double[] { raiz1, raiz2 };
    }
}
