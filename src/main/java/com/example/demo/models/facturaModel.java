package com.example.demo.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "factura")
public class facturaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_factura",unique = true, nullable = false)
    private Long num_factura;

    public Long getNum_factura() {
        return this.num_factura;
    }

    public void setNum_factura(Long num_factura) {
        this.num_factura = num_factura;
    }

    @ManyToOne
    @JoinColumn(name= "id_cliente")
    private clienteModel cliente;
    private String fecha;

    public clienteModel getCliente() {
        return this.cliente;
    }

    public void setCliente(clienteModel cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @OneToMany(mappedBy = "factura")
    private Set<detalleModel> detalle= new HashSet<>();

    public Set<detalleModel> getDetalle(){
        return detalle;
    }
}
