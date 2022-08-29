package com.portfolio.dsendra.Service;
import com.portfolio.dsendra.Entity.hys_github;
import com.portfolio.dsendra.Repository.Rhys_github;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Shys_github {
    @Autowired
    Rhys_github rhys_github ;  //aqui creamo la variable rhys_github
    
    public List<hys_github> list(){
        return rhys_github.findAll();
    }
    
    public Optional<hys_github> getOne(int id){
        return rhys_github.findById (id);
    }
    
    public Optional<hys_github> getByPorcentualE(int porcentualE){
        return rhys_github.findByPorcentualE(porcentualE);
    }
    public void save (hys_github github){  // aqui creo variable github
        rhys_github.save (github);
    }
    
    public void delete (int id){  // aqui creo variable github
        rhys_github.deleteById (id);
    }
    
   public boolean existsById(int id){
         return rhys_github.existsById(id);
     }
     
     public boolean existsByPorcentualE(int porcentualE){  // nombreE
         return rhys_github.existsByPorcentualE(porcentualE);   // nombreE
     }
}
    
