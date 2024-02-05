
package ejemplos.excepciones1;

/**
 *
 * @author cic
 */
public class ExcepcionPersonalizada extends Exception{

    
    @Override
    public String toString() {
        return "toString redefinido "+super.toString(); 
    }

    @Override
    public String getMessage() {
        return "getMessage redefinido "+super.getMessage();
    }
    
}
