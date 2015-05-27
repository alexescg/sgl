package models;

import java.beans.PropertyChangeSupport;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class Prestamo extends BaseModel{
    public static final String PROP_IDPRESTAMO = "PROP_IDPRESTAMO";
    public static final String PROP_DESCRIPCION = "PROP_DESCRIPCION";
    public static final String PROP_USUARIO = "PROP_USUARIO";
    public static final String PROP_FECHA = "PROP_FECHA";


    private BigDecimal idPrestamo;
    private String descripcion;
    private BigDecimal usuario;
    private Timestamp fecha;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        java.lang.String oldDescripcion = this.descripcion;
        this.descripcion = descripcion;
        propertyChangeSupport.firePropertyChange(PROP_DESCRIPCION, oldDescripcion, descripcion);
    }

    /**
     * @return the usuario
     */
    public BigDecimal getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(BigDecimal usuario) {
        java.math.BigDecimal oldUsuario = this.usuario;
        this.usuario = usuario;
        propertyChangeSupport.firePropertyChange(PROP_USUARIO, oldUsuario, usuario);
    }

    /**
     * @return the fecha
     */
    public Timestamp getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Timestamp fecha) {
        java.sql.Timestamp oldFecha = this.fecha;
        this.fecha = fecha;
        propertyChangeSupport.firePropertyChange(PROP_FECHA, oldFecha, fecha);
    }
     
}
