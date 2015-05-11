package models;

import java.beans.PropertyChangeSupport;
import java.util.Date;

public class PrestamoMaterial {

    public static final String PROP_IDMATERIAL = "PROP_IDMATERIAL";
    public static final String PROP_IDPRESTAMO = "PROP_IDPRESTAMO";
    public static final String PROP_FECHAPRESTAMO = "PROP_FECHAPRESTAMO";

    private Material idMaterial;
    private Prestamo idPrestamo;
    private Date fechaPrestamo;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    public PrestamoMaterial() {
    }

    public PrestamoMaterial(Material idMaterial, Prestamo idPrestamo, Date fechaPrestamo) {
        this.idMaterial = idMaterial;
        this.idPrestamo = idPrestamo;
        this.fechaPrestamo = fechaPrestamo;
    }

    /**
     * @return the idMaterial
     */
    public Material getIdMaterial() {
        return idMaterial;
    }

    /**
     * @param idMaterial the idMaterial to set
     */
    public void setIdMaterial(Material idMaterial) {
        models.Material oldIdMaterial = this.idMaterial;
        this.idMaterial = idMaterial;
        propertyChangeSupport.firePropertyChange(PROP_IDMATERIAL, oldIdMaterial, idMaterial);
    }

    /**
     * @return the idPrestamo
     */
    public Prestamo getIdPrestamo() {
        return idPrestamo;
    }

    /**
     * @param idPrestamo the idPrestamo to set
     */
    public void setIdPrestamo(Prestamo idPrestamo) {
        models.Prestamo oldIdPrestamo = this.idPrestamo;
        this.idPrestamo = idPrestamo;
        propertyChangeSupport.firePropertyChange(PROP_IDPRESTAMO, oldIdPrestamo, idPrestamo);
    }

    /**
     * @return the fechaPrestamo
     */
    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    /**
     * @param fechaPrestamo the fechaPrestamo to set
     */
    public void setFechaPrestamo(Date fechaPrestamo) {
        java.util.Date oldFechaPrestamo = this.fechaPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        propertyChangeSupport.firePropertyChange(PROP_FECHAPRESTAMO, oldFechaPrestamo, fechaPrestamo);
    }

}
