package com.portfolio.dsendra.Service;
import com.portfolio.dsendra.Entity.hys_jscript;
import com.portfolio.dsendra.Repository.Rhys_jscript;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Shys_jscript {
    @Autowired
    Rhys_jscript rhys_jscript ;  //aqui creamo la variable rhys_jscript
    
    public List<hys_jscript> list(){
        return rhys_jscript.findAll();
    }
    
    public Optional<hys_jscript> getOne(int id){
        return rhys_jscript.findById (id);
    }
    
    public Optional<hys_jscript> getByPorcentualE(int porcentualE){
        return rhys_jscript.findByPorcentualE(porcentualE);
    }
    public void save (hys_jscript jscript){  // aqui creo variable jscript
        rhys_jscript.save (jscript);
    }
    
    public void delete (int id){  // aqui creo variable jscript
        rhys_jscript.deleteById (id);
    }
    
   public boolean existsById(int id){
         return rhys_jscript.existsById(id);
     }
     
     public boolean existsByPorcentualE(int porcentualE){  // nombreE
         return rhys_jscript.existsByPorcentualE(porcentualE);   // nombreE
     }
}
    
