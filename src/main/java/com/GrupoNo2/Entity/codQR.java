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
@Table(name = "codQR")
public class codQR {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPro;
    private int codQR;
    private int fechaVenciQR;

    public int getFechaVenciQR() {
        return fechaVenciQR;
    }

    public void setFechaVenciQR(int fechaVenciQR) {
        this.fechaVenciQR = fechaVenciQR;
    }

    public Integer getIdPro() {
        return idPro;
    }

    public void setIdPro(Integer idPro) {
        this.idPro = idPro;
    }

    public int getCodQR() {
        return codQR;
    }

    public void setCodQR(int codQR) {
        this.codQR = codQR;
    }

}
