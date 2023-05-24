/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GrupoNo2.service;

import com.GrupoNo2.Entity.codQR;
import com.GrupoNo2.repo.ProductosRepo;
import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class codQRService {

    @Autowired
    private ProductosRepo codQrRepo;

    //Guardar
    public codQR IngresarProd(codQR emp) {
        return codQrRepo.save(emp);
    }

    //Actualizar
    public codQR actualizarProd(codQR emp) {
        return codQrRepo.save(emp);
    }
    //Borrar por id

    public void eliminarId(Integer id) {
        codQrRepo.deleteById(id);
    }
 
    //Buscar ID  
    public Optional<codQR> buscarId(Integer id) {
        return codQrRepo.findById(id);
    }

    public void eliminarRegistrosVencidos() {
        LocalDateTime fechaActual = LocalDateTime.now();
        codQrRepo.eliminarRegistrosPorFechaVencida(fechaActual);
    }

}
