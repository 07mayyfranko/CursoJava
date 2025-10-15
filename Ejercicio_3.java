
package secuenciales;

/**
 *
 * @author Maylin Samara Franco Ruiz
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //salario base
        double Salario=2000000;
        
        //descuentos
        double saludMagica=Salario*0.04;
        double proteccionDePension=Salario*0.05;
        
        //Calculo del salario neto
        double salarioNeto= Salario - saludMagica - proteccionDePension;
        
        
        
        
        
        System.out.print (" Tu saldo final es de: " + salarioNeto + " monedas de oro. ¡Preparate para tu proxima aventura! ");
        
        
                
    }
    
}
