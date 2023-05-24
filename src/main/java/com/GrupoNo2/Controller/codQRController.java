/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GrupoNo2.Controller;
import com.GrupoNo2.Entity.codQR;
import com.GrupoNo2.service.codQRService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 *
 * @author Axel
 */
@RestController
@RequestMapping("/api/codqr")
public class codQRController {
     
    @Autowired
    private codQRService codQRSer;
    
    @PostMapping
    public codQR insertar(@RequestBody codQR empo){
    return codQRSer.IngresarProd(empo);
    }
    
    @GetMapping
    public Optional<codQR> ListarID(@RequestParam Integer idPro){
    return codQRSer.buscarId(idPro);
    }
    
    @DeleteMapping
    public void eliminar(@RequestParam Integer idPro){
    codQRSer.eliminarId(idPro);
    }
    
    @PutMapping
    public codQR actualizar(@RequestBody codQR empo){
    return codQRSer.actualizarProd(empo);
    }
    
     @DeleteMapping("/vencidos")
    public ResponseEntity<String> eliminarRegistrosVencidos() {
        codQRSer.eliminarRegistrosVencidos();
        return ResponseEntity.ok("Registros vencidos eliminados");
    }
    
}
