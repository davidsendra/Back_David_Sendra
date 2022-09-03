package com.portfolio.dsendra.Controller;

import com.portfolio.dsendra.Dto.dtohys_redes;
import com.portfolio.dsendra.Entity.hys_redes;
import com.portfolio.dsendra.Security.Controller.Mensaje;
import com.portfolio.dsendra.Service.Shys_redes;
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
@RequestMapping("/porc_redes") // porcentual redes
@CrossOrigin(origins = "https://frontdavidsendra-55ecc.firebaseapp.com")
public class Chys_redes {
    @Autowired
    Shys_redes shys_redes; // otra variable con todo con minuscula 
    
    @GetMapping("/lista_porcentual")  //"/lista_porcentual"
    public ResponseEntity<List<hys_redes>> list(){
        List<hys_redes> list = shys_redes.list();
        return  new ResponseEntity (list , HttpStatus.OK);
    } 
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<hys_redes> getById(@PathVariable("id") int id){
        if(!shys_redes.existsById(id))
            return new ResponseEntity(new Mensaje("no esta"), HttpStatus.NOT_FOUND);
        hys_redes hys_redes1 = shys_redes.getOne(id).get(); //crea otra var
        return new ResponseEntity(hys_redes1, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!shys_redes .existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        shys_redes .delete(id);
        return new ResponseEntity(new Mensaje("a sido eliminado"), HttpStatus.OK);
    }  
    
     @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtohys_redes dtoredes){      // creao una variable
        
            
        hys_redes hys_redes1 = new hys_redes(dtoredes.getPorcentualE());
        shys_redes.save(hys_redes1);
                     

        
        return new ResponseEntity(new Mensaje("porcentual agregado"), HttpStatus.OK);
    }
    
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtohys_redes dtoredes){
        //Validamos si existe el ID
        if(!shys_redes .existsById(id))
            return new ResponseEntity(new Mensaje("El ID no exite"), HttpStatus.BAD_REQUEST);
        
        
        hys_redes hys_redes1 = shys_redes .getOne(id).get();
        hys_redes1.setPorcentualE(dtoredes.getPorcentualE());
        
        
        shys_redes .save(hys_redes1);
        return new ResponseEntity(new Mensaje("Porcentual actualizado"), HttpStatus.OK);
             
    }
    
    
    
    
    
    
    
    
}
