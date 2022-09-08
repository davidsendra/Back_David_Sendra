package com.portfolio.dsendra.Controller;

import com.portfolio.dsendra.Dto.dtohys_tjava;
import com.portfolio.dsendra.Entity.hys_tjava;
import com.portfolio.dsendra.Security.Controller.Mensaje;
import com.portfolio.dsendra.Service.Shys_tjava;
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
@RequestMapping("/porc_tjava") // porcentual tjava
@CrossOrigin(origins = "https://frontdavidsendra-f4f40.firebaseapp.com")
public class Chys_tjava {
    @Autowired
    Shys_tjava shys_tjava; // otra variable con todo con minuscula 
    
    @GetMapping("/lista_porcentual")  //"/lista_porcentual"
    public ResponseEntity<List<hys_tjava>> list(){
        List<hys_tjava> list = shys_tjava.list();
        return  new ResponseEntity (list , HttpStatus.OK);
    } 
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<hys_tjava> getById(@PathVariable("id") int id){
        if(!shys_tjava.existsById(id))
            return new ResponseEntity(new Mensaje("no esta"), HttpStatus.NOT_FOUND);
        hys_tjava hys_tjava1 = shys_tjava.getOne(id).get(); //crea otra var
        return new ResponseEntity(hys_tjava1, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!shys_tjava .existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        shys_tjava .delete(id);
        return new ResponseEntity(new Mensaje("a sido eliminado"), HttpStatus.OK);
    }  
    
     @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtohys_tjava dtotjava){      // creao una variable
        
            
        hys_tjava hys_tjava1 = new hys_tjava(dtotjava.getPorcentualE());
        shys_tjava.save(hys_tjava1);
                     

        
        return new ResponseEntity(new Mensaje("porcentual agregado"), HttpStatus.OK);
    }
    
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtohys_tjava dtotjava){
        //Validamos si existe el ID
        if(!shys_tjava .existsById(id))
            return new ResponseEntity(new Mensaje("El ID no exite"), HttpStatus.BAD_REQUEST);
        
        
        hys_tjava hys_tjava1 = shys_tjava .getOne(id).get();
        hys_tjava1.setPorcentualE(dtotjava.getPorcentualE());
        
        
        shys_tjava .save(hys_tjava1);
        return new ResponseEntity(new Mensaje("Porcentual actualizado"), HttpStatus.OK);
             
    }
    
    
    
    
    
    
    
    
}
