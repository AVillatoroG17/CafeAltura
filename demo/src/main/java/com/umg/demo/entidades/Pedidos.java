package com.umg.demo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Pedidos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPedido;
    
    private Integer idCliente;
    private LocalDateTime fechaPedido;
    private String estadoPedido;
    private BigDecimal totalPedido;
    private String direccionEnvio;
    private String notasPedido;
    private LocalDateTime fechaActualizacion;
    
    public Pedidos() {}
    
    public Pedidos(Integer idPedido, Integer idCliente, LocalDateTime fechaPedido, String estadoPedido, BigDecimal totalPedido, String direccionEnvio, String notasPedido, LocalDateTime fechaActualizacion) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.fechaPedido = fechaPedido;
        this.estadoPedido = estadoPedido;
        this.totalPedido = totalPedido;
        this.direccionEnvio = direccionEnvio;
        this.notasPedido = notasPedido;
        this.fechaActualizacion = fechaActualizacion;
    }
    

    public Integer getIdPedido() {
        return idPedido;
    }
    
    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }
    
    public Integer getIdCliente() {
        return idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    
    public LocalDateTime getFechaPedido() {
        return fechaPedido;
    }
    
    public void setFechaPedido(LocalDateTime fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
    
    public String getEstadoPedido() {
        return estadoPedido;
    }
    
    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
    
    public BigDecimal getTotalPedido() {
        return totalPedido;
    }
    
    public void setTotalPedido(BigDecimal totalPedido) {
        this.totalPedido = totalPedido;
    }
    
    public String getDireccionEnvio() {
        return direccionEnvio;
    }
    
    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }
    
    public String getNotasPedido() {
        return notasPedido;
    }
    
    public void setNotasPedido(String notasPedido) {
        this.notasPedido = notasPedido;
    }
    
    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }
    
    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}