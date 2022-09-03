package com.portfolio.dsendra.Controller;

import com.portfolio.dsendra.Dto.dtohys_actitud;
import com.portfolio.dsendra.Entity.hys_actitud;
import com.portfolio.dsendra.Security.Controller.Mensaje;
import com.portfolio.dsendra.Service.Shys_actitud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/porc_actitud") // porcentual actitud
@CrossOrigin(origins = "https://frontdavidsendra-55ecc.firebaseapp.com")
public class Chys_actitud {
    @Autowired
    Shys_actitud shys_actitud; // otra variable con todo con minuscula 
    
    @GetMapping("/lista_porcentual")  //"/lista_porcentual"
    public ResponseEntity<List<hys_actitud>> list(){
        List<hys_actitud> list = shys_actitud.list();
        return  new ResponseEntity (list , HttpStatus.OK);
    } 
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<hys_actitud> getById(@PathVariable("id") int id){
        if(!shys_actitud.existsById(id))
            return new ResponseEntity(new Mensaje("no esta"), HttpStatus.NOT_FOUND);
        hys_actitud hys_actitud1 = shys_actitud.getOne(id).get(); //crea otra var
        return new ResponseEntity(hys_actitud1, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!shys_actitud .existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        shys_actitud .delete(id);
        return new ResponseEntity(new Mensaje("a sido eliminado"), HttpStatus.OK);
    }  
    
     @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtohys_actitud dtoactitud){      // creao una variable
        
            
        hys_actitud hys_actitud1 = new hys_actitud(dtoactitud.getPorcentualE());
        shys_actitud.save(hys_actitud1);
                     

        
        return new ResponseEntity(new Mensaje("porcentual agregado"), HttpStatus.OK);
    }
    
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtohys_actitud dtoactitud){
        //Validamos si existe el ID
        if(!shys_actitud .existsById(id))
            return new ResponseEntity(new Mensaje("El ID no exite"), HttpStatus.BAD_REQUEST);
        
        
        hys_actitud hys_actitud1 = shys_actitud .getOne(id).get();
        hys_actitud1.setPorcentualE(dtoactitud.getPorcentualE());
        
        
        shys_actitud .save(hys_actitud1);
        return new ResponseEntity(new Mensaje("Porcentual actualizado"), HttpStatus.OK);
             
    }
    
    
    
    
    
    
    
    
}
