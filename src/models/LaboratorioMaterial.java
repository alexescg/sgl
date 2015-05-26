/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;

/**
 *
 * @author ALO
 */
public class LaboratorioMaterial {
    public static final String PROP_IDLABORATORIO = "PROP_IDLABORATORIO";
    public static final String PROP_IDMATERIAL = "PROP_IDMATERIAL";
    
    private BigDecimal idlaboratorio;
    private BigDecimal idmaterial;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    public LaboratorioMaterial() {
    }

    public LaboratorioMaterial(BigDecimal idlaboratorio, BigDecimal idmaterial) {
        this.idlaboratorio = idlaboratorio;
        this.idmaterial = idmaterial;
    }

    /**
     * @return the idlaboratorio
     */
    public BigDecimal getIdlaboratorio() {
        return idlaboratorio;
    }

    /**
     * @param idlaboratorio the idlaboratorio to set
     */
    public void setIdlaboratorio(BigDecimal idlaboratorio) {
        java.math.BigDecimal oldIdlaboratorio = this.idlaboratorio;
        this.idlaboratorio = idlaboratorio;
        propertyChangeSupport.firePropertyChange(PROP_IDLABORATORIO, oldIdlaboratorio, idlaboratorio);
    }

    /**
     * @return the idmaterial
     */
    public BigDecimal getIdmaterial() {
        return idmaterial;
    }

    /**
     * @param idmaterial the idmaterial to set
     */
    public void setIdmaterial(BigDecimal idmaterial) {
        java.math.BigDecimal oldIdmaterial = this.idmaterial;
        this.idmaterial = idmaterial;
        propertyChangeSupport.firePropertyChange(PROP_IDMATERIAL, oldIdmaterial, idmaterial);
    }
    
    
    
}
