package models;

import java.beans.PropertyChangeSupport;

public class Material {

    public static final String PROP_IDMATERIAL = "PROP_IDMATERIAL";
    public static final String PROP_NOMBRE = "PROP_NOMBRE";
    public static final String PROP_CANTIDAD = "PROP_CANTIDAD";
    public static final String PROP_LABORATORIO = "PROP_LABORATORIO";

    private Integer idMaterial;
    private String nombre;
    private Integer cantidad;
    private Laboratorio laboratorio;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    public Material() {
    }

    public Material(Integer idMaterial, String nombre, Integer cantidad, Laboratorio laboratorio) {
        this.idMaterial = idMaterial;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.laboratorio = laboratorio;
    }

    /**
     * @return the idMaterial
     */
    public Integer getIdMaterial() {
        return idMaterial;
    }

    /**
     * @param idMaterial the idMaterial to set
     */
    public void setIdMaterial(Integer idMaterial) {
        java.lang.Integer oldIdMaterial = this.idMaterial;
        this.idMaterial = idMaterial;
        propertyChangeSupport.firePropertyChange(PROP_IDMATERIAL, oldIdMaterial, idMaterial);
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
     * @return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        java.lang.Integer oldCantidad = this.cantidad;
        this.cantidad = cantidad;
        propertyChangeSupport.firePropertyChange(PROP_CANTIDAD, oldCantidad, cantidad);
    }

    /**
     * @return the laboratorio
     */
    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    /**
     * @param laboratorio the laboratorio to set
     */
    public void setLaboratorio(Laboratorio laboratorio) {
        models.Laboratorio oldLaboratorio = this.laboratorio;
        this.laboratorio = laboratorio;
        propertyChangeSupport.firePropertyChange(PROP_LABORATORIO, oldLaboratorio, laboratorio);
    }

}
