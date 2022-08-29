package com.portfolio.dsendra.Service;
import com.portfolio.dsendra.Entity.hys_tjava;
import com.portfolio.dsendra.Repository.Rhys_tjava;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Shys_tjava {
    @Autowired
    Rhys_tjava rhys_tjava ;  //aqui creamo la variable rhys_tjava
    
    public List<hys_tjava> list(){
        return rhys_tjava.findAll();
    }
    
    public Optional<hys_tjava> getOne(int id){
        return rhys_tjava.findById (id);
    }
    
    public Optional<hys_tjava> getByPorcentualE(int porcentualE){
        return rhys_tjava.findByPorcentualE(porcentualE);
    }
    public void save (hys_tjava tjava){  // aqui creo variable tjava
        rhys_tjava.save (tjava);
    }
    
    public void delete (int id){  // aqui creo variable tjava
        rhys_tjava.deleteById (id);
    }
    
   public boolean existsById(int id){
         return rhys_tjava.existsById(id);
     }
     
     public boolean existsByPorcentualE(int porcentualE){  // nombreE
         return rhys_tjava.existsByPorcentualE(porcentualE);   // nombreE
     }
}
    
