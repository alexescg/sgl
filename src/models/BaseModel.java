package models;

/**
 *
 * @author Alejandro Escobedo
 */
public class BaseModel {
    public static final String VACIO = "";
    
    /**
     * Metodo para checar si algun valor es numerico.
     *
     * @param str
     * @return
     */
    public static Boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str.trim());
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    /**
     * Metodo para revisar que una cadena no sea nula ni este vacia.
     *
     * @param str
     * @return
     */
    public static Boolean isValidString(String str) {
        return str != null && !str.isEmpty() && !str.trim().isEmpty();
    }

}