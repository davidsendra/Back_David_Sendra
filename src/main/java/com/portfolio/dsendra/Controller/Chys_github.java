package com.portfolio.dsendra.Controller;

import com.portfolio.dsendra.Dto.dtohys_github;
import com.portfolio.dsendra.Entity.hys_github;
import com.portfolio.dsendra.Security.Controller.Mensaje;
import com.portfolio.dsendra.Service.Shys_github;
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
@RequestMapping("/porc_github") // porcentual github
@CrossOrigin(origins = "http://localhost:4200")
public class Chys_github {
    @Autowired
    Shys_github shys_github; // otra variable con todo con minuscula 
    
    @GetMapping("/lista_porcentual")  //"/lista_porcentual"
    public ResponseEntity<List<hys_github>> list(){
        List<hys_github> list = shys_github.list();
        return  new ResponseEntity (list , HttpStatus.OK);
    } 
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<hys_github> getById(@PathVariable("id") int id){
        if(!shys_github.existsById(id))
            return new ResponseEntity(new Mensaje("no esta"), HttpStatus.NOT_FOUND);
        hys_github hys_github1 = shys_github.getOne(id).get(); //crea otra var
        return new ResponseEntity(hys_github1, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!shys_github .existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        shys_github .delete(id);
        return new ResponseEntity(new Mensaje("a sido eliminado"), HttpStatus.OK);
    }  
    
     @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtohys_github dtogithub){      // creao una variable
        
            
        hys_github hys_github1 = new hys_github(dtogithub.getPorcentualE());
        shys_github.save(hys_github1);
                     

        
        return new ResponseEntity(new Mensaje("porcentual agregado"), HttpStatus.OK);
    }
    
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtohys_github dtogithub){
        //Validamos si existe el ID
        if(!shys_github .existsById(id))
            return new ResponseEntity(new Mensaje("El ID no exite"), HttpStatus.BAD_REQUEST);
        
        
        hys_github hys_github1 = shys_github .getOne(id).get();
        hys_github1.setPorcentualE(dtogithub.getPorcentualE());
        
        
        shys_github .save(hys_github1);
        return new ResponseEntity(new Mensaje("Porcentual actualizado"), HttpStatus.OK);
             
    }
    
    
    
    
    
    
    
    
}
