package models;

import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class PrestamoMaterial extends BaseModel{

    public static final String PROP_IDMATERIAL = "PROP_IDMATERIAL";
    public static final String PROP_IDPRESTAMO = "PROP_IDPRESTAMO";
    public static final String PROP_FECHAPRESTAMO = "PROP_FECHAPRESTAMO";

    private BigDecimal idPrestamo;
    private BigDecimal idMaterial;
    private Timestamp fechaPrestamo;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    /**
     * @return the idMaterial
     */
    public BigDecimal getIdMaterial() {
        return idMaterial;
    }

    /**
     * @param idMaterial the idMaterial to set
     */
    public void setIdMaterial(BigDecimal idMaterial) {
        java.math.BigDecimal oldIdMaterial = this.idMaterial;
        this.idMaterial = idMaterial;
        propertyChangeSupport.firePropertyChange(PROP_IDMATERIAL, oldIdMaterial, idMaterial);
    }

    /**
     * @return the idPrestamo
     */
    public BigDecimal getIdPrestamo() {
        return idPrestamo;
    }

    /**
     * @param idPrestamo the idPrestamo to set
     */
    public void setIdPrestamo(BigDecimal idPrestamo) {
        java.math.BigDecimal oldIdPrestamo = this.idPrestamo;
        this.idPrestamo = idPrestamo;
        propertyChangeSupport.firePropertyChange(PROP_IDPRESTAMO, oldIdPrestamo, idPrestamo);
    }

    /**
     * @return the fechaPrestamo
     */
    public Timestamp getFechaPrestamo() {
        return fechaPrestamo;
    }

    /**
     * @param fechaPrestamo the fechaPrestamo to set
     */
    public void setFechaPrestamo(Timestamp fechaPrestamo) {
        java.sql.Timestamp oldFechaPrestamo = this.fechaPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        propertyChangeSupport.firePropertyChange(PROP_FECHAPRESTAMO, oldFechaPrestamo, fechaPrestamo);
    }

}
