package models;

import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;

class Laboratorio {
    public static final String PROP_IDLABORATORIO = "PROP_IDLABORATORIO";
    public static final String PROP_NOMBRE = "PROP_NOMBRE";
    public static final String PROP_CLAVE = "PROP_CLAVE";
    public static final String PROP_IDENCARGADO = "PROP_IDENCARGADO";


    private BigDecimal idLaboratorio;
    private String nombre;
    private String clave;
    private String idencargado;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    public Laboratorio() {
    }

    public Laboratorio(BigDecimal idLaboratorio, String nombre, String clave, String idencargado) {
        this.idLaboratorio = idLaboratorio;
        this.nombre = nombre;
        this.clave = clave;
        this.idencargado = idencargado;
    }

    
    /**
     * @return the idLaboratorio
     */
    public BigDecimal getIdLaboratorio() {
        return idLaboratorio;
    }

    /**
     * @param idLaboratorio the idLaboratorio to set
     */
    public void setIdLaboratorio(BigDecimal idLaboratorio) {
        java.math.BigDecimal oldIdLaboratorio = this.idLaboratorio;
        this.idLaboratorio = idLaboratorio;
        propertyChangeSupport.firePropertyChange(PROP_IDLABORATORIO, oldIdLaboratorio, idLaboratorio);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        java.lang.String oldNombre = this.nombre;
        this.nombre = nombre;
        propertyChangeSupport.firePropertyChange(PROP_NOMBRE, oldNombre, nombre);
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        java.lang.String oldClave = this.clave;
        this.clave = clave;
        propertyChangeSupport.firePropertyChange(PROP_CLAVE, oldClave, clave);
    }

    /**
     * @return the idencargado
     */
    public String getIdencargado() {
        return idencargado;
    }

    /**
     * @param idencargado the idencargado to set
     */
    public void setIdencargado(String idencargado) {
        java.lang.String oldIdencargado = this.idencargado;
        this.idencargado = idencargado;
        propertyChangeSupport.firePropertyChange(PROP_IDENCARGADO, oldIdencargado, idencargado);
    }

}
