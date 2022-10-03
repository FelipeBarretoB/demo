package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.clienteModel;
import com.example.demo.models.detalleModel;
import com.example.demo.models.facturaModel;
import com.example.demo.models.productoModel;
import com.example.demo.repositories.clienteRepository;
import com.example.demo.repositories.detalleRepository;
import com.example.demo.repositories.facturaRepository;
import com.example.demo.repositories.productoRepository;

public class Services {
    clienteRepository clienteRepositorio;
    facturaRepository facturaRepository;
    productoRepository productoRepository;
    detalleRepository detalleRepository;

    public ArrayList<clienteModel> obtenerC(){
        return (ArrayList<clienteModel>) clienteRepositorio.findAll();
    }

    public clienteModel guardarC(clienteModel usuario){
        return clienteRepositorio.save(usuario);
    }

    public Optional<clienteModel> obtenerCId(long id){
        return clienteRepositorio.findById(id);
    }


    public ArrayList<facturaModel> obtenerF(){
        return (ArrayList<facturaModel>) facturaRepository.findAll();
    }

    public facturaModel guardarF(facturaModel usuario){
        return facturaRepository.save(usuario);
    }

    public Optional<facturaModel> obtenerFId(long id){
        return facturaRepository.findById(id);
    }
    


    public ArrayList<productoModel> obtenerP(){
        return (ArrayList<productoModel>) productoRepository.findAll();
    }

    public productoModel guardarP(productoModel usuario){
        return productoRepository.save(usuario);
    }

    public Optional<productoModel> obtenerPId(Integer id){
        return productoRepository.findById(id);
    }


    public ArrayList<detalleModel> obtenerD(){
        return (ArrayList<detalleModel>) detalleRepository.findAll();
    }

    public detalleModel guardarD(detalleModel usuario){
        return detalleRepository.save(usuario);
    }

    public Optional<detalleModel> obtenerDId(Integer id){
        return detalleRepository.findById(id);
    }

    public String valorFactura(Long id){
        clienteModel cliente = obtenerCId(id).get();
        String valor="";
        if(cliente==null){
            valor= "no se encontro un cliente con esta id";
        }else if( ((detalleModel) ((facturaModel) cliente.getFacturas()).getDetalle()).getCantidad()>5 && ((detalleModel) ((facturaModel) cliente.getFacturas()).getDetalle()).getPrecio() >1000000.0){
           double precio = ((detalleModel) ((facturaModel) cliente.getFacturas()).getDetalle()).getPrecio();
           precio = precio - precio*0.1;
           valor ="El nuevo precio es "+precio;
        }
        return valor;
    }

}
