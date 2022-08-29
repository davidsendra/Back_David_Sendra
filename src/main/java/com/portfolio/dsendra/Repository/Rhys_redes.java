package com.portfolio.dsendra.Repository;
import com.portfolio.dsendra.Entity.hys_redes;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rhys_redes extends JpaRepository<hys_redes , Integer>{
    public Optional<hys_redes> findByPorcentualE (int porcentualE);
    public boolean existsByPorcentualE (int porcentualE);
    
}
