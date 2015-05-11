package models;

import java.beans.PropertyChangeSupport;

public class Prestamo {

    public static final String PROP_IDPRESTAMO = "PROP_IDPRESTAMO";
    public static final String PROP_DESCRIPCION = "PROP_DESCRIPCION";
    public static final String PROP_USUARIO = "PROP_USUARIO";

    private Integer idPrestamo;
    private String descripcion;
    private Usuario usuario;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);

    public Prestamo() {
    }

    public Prestamo(Integer idPrestamo, String descripcion, Usuario usuario) {
        this.idPrestamo = idPrestamo;
        this.descripcion = descripcion;
        this.usuario = usuario;
    }

    /**
     * @return the idPrestamo
     */
    public Integer getIdPrestamo() {
        return idPrestamo;
    }

    /**
     * @param idPrestamo the idPrestamo to set
     */
    public void setIdPrestamo(Integer idPrestamo) {
        java.lang.Integer oldIdPrestamo = this.idPrestamo;
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
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        models.Usuario oldUsuario = this.usuario;
        this.usuario = usuario;
        propertyChangeSupport.firePropertyChange(PROP_USUARIO, oldUsuario, usuario);
    }
}
