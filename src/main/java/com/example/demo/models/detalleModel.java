package com.example.demo.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "detalle")
public class detalleModel {
    @Id
    @Column(name="num_detalle", unique = true, nullable = false)
    private Integer num_detalle;

    public Integer getNum_detalle() {
        return this.num_detalle;
    }

    public void setNum_detalle(Integer num_detalle) {
        this.num_detalle = num_detalle;
    }

    @ManyToOne
    @JoinColumn(name="id_factura")
    private facturaModel factura;

    public facturaModel getFactura() {
        return this.factura;
    }

    public void setFactura(facturaModel factura) {
        this.factura = factura;
    }

    @ManyToOne
    @JoinColumn(name="id_producto")
    private productoModel id_producto;
    private Integer cantidad;
    private Double precio;

    public productoModel getId_producto() {
        return this.id_producto;
    }

    public void setId_producto(productoModel id_producto) {
        this.id_producto = id_producto;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
}
