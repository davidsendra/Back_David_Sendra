package com.portfolio.dsendra.Service;
import com.portfolio.dsendra.Entity.hys_actitud;
import com.portfolio.dsendra.Repository.Rhys_actitud;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Shys_actitud {
    @Autowired
    Rhys_actitud rhys_actitud ;  //aqui creamo la variable rhys_actitud
    
    public List<hys_actitud> list(){
        return rhys_actitud.findAll();
    }
    
    public Optional<hys_actitud> getOne(int id){
        return rhys_actitud.findById (id);
    }
    
    public Optional<hys_actitud> getByPorcentualE(int porcentualE){
        return rhys_actitud.findByPorcentualE(porcentualE);
    }
    public void save (hys_actitud actitud){  // aqui creo variable actitud
        rhys_actitud.save (actitud);
    }
    
    public void delete (int id){  // aqui creo variable actitud
        rhys_actitud.deleteById (id);
    }
    
   public boolean existsById(int id){
         return rhys_actitud.existsById(id);
     }
     
     public boolean existsByPorcentualE(int porcentualE){  // nombreE
         return rhys_actitud.existsByPorcentualE(porcentualE);   // nombreE
     }
}
    
