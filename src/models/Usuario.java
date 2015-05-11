package models;

import java.beans.PropertyChangeSupport;

class Usuario {

    public static final String PROP_IDUSUARIO = "PROP_IDUSUARIO";
    public static final String PROP_NOMBRE = "PROP_NOMBRE";
    public static final String PROP_AMATERNO = "PROP_AMATERNO";
    public static final String PROP_APATERNO = "PROP_APATERNO";
    public static final String PROP_DIRECCION = "PROP_DIRECCION";
    public static final String PROP_TELEFONO = "PROP_TELEFONO";

    private Integer idUsuario;
    private String nombre;
    private String aMaterno;
    private String aPaterno;
    private String direccion;
    private String telefono;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    public Usuario() {
    }

    public Usuario(Integer idUsuario, String nombre, String aMaterno, String aPaterno, String direccion, String telefono) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.aMaterno = aMaterno;
        this.aPaterno = aPaterno;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     * @return the idUsuario
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(Integer idUsuario) {
        java.lang.Integer oldIdUsuario = this.idUsuario;
        this.idUsuario = idUsuario;
        propertyChangeSupport.firePropertyChange(PROP_IDUSUARIO, oldIdUsuario, idUsuario);
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
     * @return the aMaterno
     */
    public String getaMaterno() {
        return aMaterno;
    }

    /**
     * @param aMaterno the aMaterno to set
     */
    public void setaMaterno(String aMaterno) {
        java.lang.String oldaMaterno = this.aMaterno;
        this.aMaterno = aMaterno;
        propertyChangeSupport.firePropertyChange(PROP_AMATERNO, oldaMaterno, aMaterno);
    }

    /**
     * @return the aPaterno
     */
    public String getaPaterno() {
        return aPaterno;
    }

    /**
     * @param aPaterno the aPaterno to set
     */
    public void setaPaterno(String aPaterno) {
        java.lang.String oldaPaterno = this.aPaterno;
        this.aPaterno = aPaterno;
        propertyChangeSupport.firePropertyChange(PROP_APATERNO, oldaPaterno, aPaterno);
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        java.lang.String oldDireccion = this.direccion;
        this.direccion = direccion;
        propertyChangeSupport.firePropertyChange(PROP_DIRECCION, oldDireccion, direccion);
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        java.lang.String oldTelefono = this.telefono;
        this.telefono = telefono;
        propertyChangeSupport.firePropertyChange(PROP_TELEFONO, oldTelefono, telefono);
    }
}
