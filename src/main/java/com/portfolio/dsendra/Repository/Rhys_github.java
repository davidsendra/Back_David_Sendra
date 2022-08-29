package com.portfolio.dsendra.Repository;
import com.portfolio.dsendra.Entity.hys_github;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rhys_github extends JpaRepository<hys_github , Integer>{
    public Optional<hys_github> findByPorcentualE (int porcentualE);
    public boolean existsByPorcentualE (int porcentualE);
    
}
