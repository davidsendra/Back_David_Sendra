package com.portfolio.dsendra.Controller;

import com.portfolio.dsendra.Dto.dtohys_jscript;
import com.portfolio.dsendra.Entity.hys_jscript;
import com.portfolio.dsendra.Security.Controller.Mensaje;
import com.portfolio.dsendra.Service.Shys_jscript;
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
@RequestMapping("/porc_jscript") // porcentual jscript
@CrossOrigin(origins = "https://frontdavidsendra-f4f40.firebaseapp.com")
public class Chys_jscript {
    @Autowired
    Shys_jscript shys_jscript; 
    
    @GetMapping("/lista_porcentual")  //"/lista_porcentual"
    public ResponseEntity<List<hys_jscript>> list(){
        List<hys_jscript> list = shys_jscript.list();
        return  new ResponseEntity (list , HttpStatus.OK);
    } 
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<hys_jscript> getById(@PathVariable("id") int id){
        if(!shys_jscript.existsById(id))
            return new ResponseEntity(new Mensaje("no esta"), HttpStatus.NOT_FOUND);
        hys_jscript hys_jscript1 = shys_jscript.getOne(id).get(); //crea otra var
        return new ResponseEntity(hys_jscript1, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!shys_jscript .existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        shys_jscript .delete(id);
        return new ResponseEntity(new Mensaje("a sido eliminado"), HttpStatus.OK);
    }  
    
     @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtohys_jscript dtojscript){      // creao una variable
        
            
        hys_jscript hys_jscript1 = new hys_jscript(dtojscript.getPorcentualE());
        shys_jscript.save(hys_jscript1);
                     

        
        return new ResponseEntity(new Mensaje("porcentual agregado"), HttpStatus.OK);
    }
    
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtohys_jscript dtojscript){
        //Validamos si existe el ID
        if(!shys_jscript .existsById(id))
            return new ResponseEntity(new Mensaje("El ID no exite"), HttpStatus.BAD_REQUEST);
        
        
        hys_jscript hys_jscript1 = shys_jscript .getOne(id).get();
        hys_jscript1.setPorcentualE(dtojscript.getPorcentualE());
        
        
        shys_jscript .save(hys_jscript1);
        return new ResponseEntity(new Mensaje("Porcentual actualizado"), HttpStatus.OK);
             
    }
    
    
    
    
    
    
    
    
}
