package com.portfolio.dsendra.Repository;
import com.portfolio.dsendra.Entity.hys_tjava;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rhys_tjava extends JpaRepository<hys_tjava , Integer>{
    public Optional<hys_tjava> findByPorcentualE (int porcentualE);
    public boolean existsByPorcentualE (int porcentualE);
    
}
