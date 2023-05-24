/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GrupoNo2.repo;

import com.GrupoNo2.Entity.codQR;
import java.time.LocalDateTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductosRepo extends JpaRepository<codQR, Integer> {

    @Modifying
    @Query("DELETE FROM codQR p WHERE p.fechaVencimiento < :fechaActual")
    void eliminarRegistrosPorFechaVencida(@Param("fechaActual") LocalDateTime fechaActual);
}
