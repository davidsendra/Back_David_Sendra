package com.portfolio.dsendra.Repository;
import com.portfolio.dsendra.Entity.hys_actitud;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rhys_actitud extends JpaRepository<hys_actitud , Integer>{
    public Optional<hys_actitud> findByPorcentualE (int porcentualE);
    public boolean existsByPorcentualE (int porcentualE);
    
}
