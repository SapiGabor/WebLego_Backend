package hu.unideb.inf.lego.repository;


import hu.unideb.inf.lego.model.Lego;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LegoRepository extends JpaRepository<Lego, Integer>{
    Optional<Lego> findLegoById(Integer id);
    void deleteLegoById(Integer id);
}
