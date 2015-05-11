package models;

import java.beans.PropertyChangeSupport;

class Laboratorio {

    public static final String PROP_IDLABORATORIO = "PROP_IDLABORATORIO";
    public static final String PROP_NOMBRE = "PROP_NOMBRE";
    public static final String PROP_CLAVE = "PROP_CLAVE";
    public static final String PROP_UBICACION = "PROP_UBICACION";

    private Integer idLaboratorio;
    private String nombre;
    private String clave;
    private String ubicacion;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    public Laboratorio() {
    }
    public Laboratorio(Integer idLaboratorio, String nombre, String clave, String ubicacion) {
        this.idLaboratorio = idLaboratorio;
        this.nombre = nombre;
        this.clave = clave;
        this.ubicacion = ubicacion;
    }


    /**
     * @return the idLaboratorio
     */
    public Integer getIdLaboratorio() {
        return idLaboratorio;
    }

    /**
     * @param idLaboratorio the idLaboratorio to set
     */
    public void setIdLaboratorio(Integer idLaboratorio) {
        java.lang.Integer oldIdLaboratorio = this.idLaboratorio;
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
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        java.lang.String oldUbicacion = this.ubicacion;
        this.ubicacion = ubicacion;
        propertyChangeSupport.firePropertyChange(PROP_UBICACION, oldUbicacion, ubicacion);
    }

}
