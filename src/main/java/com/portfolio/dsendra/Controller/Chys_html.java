package com.portfolio.dsendra.Controller;

import com.portfolio.dsendra.Dto.dtohys_html;
import com.portfolio.dsendra.Entity.hys_html;
import com.portfolio.dsendra.Security.Controller.Mensaje;
import com.portfolio.dsendra.Service.Shys_html;
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
@RequestMapping("/porc_html") // porcentual html
@CrossOrigin(origins = "https://frontdavidsendra-55ecc.firebaseapp.com")
public class Chys_html {
    @Autowired
    Shys_html shys_html; // otra variable con todo con minuscula 
    
    @GetMapping("/lista_porcentual")  //"/lista_porcentual"
    public ResponseEntity<List<hys_html>> list(){
        List<hys_html> list = shys_html.list();
        return  new ResponseEntity (list , HttpStatus.OK);
    } 
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<hys_html> getById(@PathVariable("id") int id){
        if(!shys_html.existsById(id))
            return new ResponseEntity(new Mensaje("no esta"), HttpStatus.NOT_FOUND);
        hys_html hys_html1 = shys_html.getOne(id).get(); //crea otra var
        return new ResponseEntity(hys_html1, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!shys_html .existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        shys_html .delete(id);
        return new ResponseEntity(new Mensaje("a sido eliminado"), HttpStatus.OK);
    }  
    
     @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtohys_html dtohtml){      // creao una variable
        
            
        hys_html hys_html1 = new hys_html(dtohtml.getPorcentualE());
        shys_html.save(hys_html1);
                     

        
        return new ResponseEntity(new Mensaje("porcentual agregado"), HttpStatus.OK);
    }
    
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtohys_html dtohtml){
        //Validamos si existe el ID
        if(!shys_html .existsById(id))
            return new ResponseEntity(new Mensaje("El ID no exite"), HttpStatus.BAD_REQUEST);
        
        
        hys_html hys_html1 = shys_html .getOne(id).get();
        hys_html1.setPorcentualE(dtohtml.getPorcentualE());
        
        
        shys_html .save(hys_html1);
        return new ResponseEntity(new Mensaje("Porcentual actualizado"), HttpStatus.OK);
             
    }
    
    
    
    
    
    
    
    
}
