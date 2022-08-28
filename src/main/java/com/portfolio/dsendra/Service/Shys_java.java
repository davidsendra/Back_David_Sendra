package com.portfolio.dsendra.Service;
import com.portfolio.dsendra.Entity.hys_java;
import com.portfolio.dsendra.Repository.Rhys_java;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Shys_java {
    @Autowired
    Rhys_java rhys_java ;  //aqui creamo la variable rhys_java
    
    public List<hys_java> list(){
        return rhys_java.findAll();
    }
    
    public Optional<hys_java> getOne(int id){
        return rhys_java.findById (id);
    }
    
    public Optional<hys_java> getByPorcentualE(int porcentualE){
        return rhys_java.findByPorcentualE(porcentualE);
    }
    public void save (hys_java java){  // aqui creo variable java
        rhys_java.save (java);
    }
    
    public void delete (int id){  // aqui creo variable java
        rhys_java.deleteById (id);
    }
    
   public boolean existsById(int id){
         return rhys_java.existsById(id);
     }
     
     public boolean existsByPorcentualE(int porcentualE){  // nombreE
         return rhys_java.existsByPorcentualE(porcentualE);   // nombreE
     }
}
    
