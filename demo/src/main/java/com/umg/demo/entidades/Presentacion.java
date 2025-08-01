package com.umg.demo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Presentacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPresentacion;
    
    private Integer idProducto;
    private String nombrePresentacion;
    private String peso;
    private String tipoMolido;
    private BigDecimal precio;
    private Integer cantidadEnInventario;
    private LocalDateTime fechaCreacion;
    private Boolean existencias;
    
    public Presentacion() {}
    
    public Presentacion(Integer idPresentacion, Integer idProducto, String nombrePresentacion, String peso, String tipoMolido, BigDecimal precio, Integer cantidadEnInventario, LocalDateTime fechaCreacion, Boolean existencias) {
        this.idPresentacion = idPresentacion;
        this.idProducto = idProducto;
        this.nombrePresentacion = nombrePresentacion;
        this.peso = peso;
        this.tipoMolido = tipoMolido;
        this.precio = precio;
        this.cantidadEnInventario = cantidadEnInventario;
        this.fechaCreacion = fechaCreacion;
        this.existencias = existencias;
    }
    
    public Integer getIdPresentacion() {
        return idPresentacion;
    }
    
    public void setIdPresentacion(Integer idPresentacion) {
        this.idPresentacion = idPresentacion;
    }
    
    public Integer getIdProducto() {
        return idProducto;
    }
    
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
    
    public String getNombrePresentacion() {
        return nombrePresentacion;
    }
    
    public void setNombrePresentacion(String nombrePresentacion) {
        this.nombrePresentacion = nombrePresentacion;
    }
    
    public String getPeso() {
        return peso;
    }
    
    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    public String getTipoMolido() {
        return tipoMolido;
    }
    
    public void setTipoMolido(String tipoMolido) {
        this.tipoMolido = tipoMolido;
    }
    
    public BigDecimal getPrecio() {
        return precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    
    public Integer getCantidadEnInventario() {
        return cantidadEnInventario;
    }
    
    public void setCantidadEnInventario(Integer cantidadEnInventario) {
        this.cantidadEnInventario = cantidadEnInventario;
    }
    
    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }
    
    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    public Boolean getExistencias() {
        return existencias;
    }
    
    public void setExistencias(Boolean existencias) {
        this.existencias = existencias;
    }
}