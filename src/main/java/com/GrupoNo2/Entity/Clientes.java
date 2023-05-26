/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GrupoNo2.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Clientes")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idClie;
    private String nombre;
    private String apellido;
    private String gmail;
    private String numtelefono;
    private String fechaNac;
    private String fechaPedido;
    private boolean tipoPlan_a;
    private boolean tipoPlan_b;
    private boolean tipoPlan_c;
    private int numPedido;

    public Integer getIdClie() {
        return idClie;
    }

    public void setIdClie(Integer idClie) {
        this.idClie = idClie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getNumtelefono() {
        return numtelefono;
    }

    public void setNumtelefono(String numtelefono) {
        this.numtelefono = numtelefono;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public boolean isTipoPlan_a() {
        return tipoPlan_a;
    }

    public void setTipoPlan_a(boolean tipoPlan_a) {
        this.tipoPlan_a = tipoPlan_a;
    }

    public boolean isTipoPlan_b() {
        return tipoPlan_b;
    }

    public void setTipoPlan_b(boolean tipoPlan_b) {
        this.tipoPlan_b = tipoPlan_b;
    }

    public boolean isTipoPlan_c() {
        return tipoPlan_c;
    }

    public void setTipoPlan_c(boolean tipoPlan_c) {
        this.tipoPlan_c = tipoPlan_c;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }
    
    
    

}
