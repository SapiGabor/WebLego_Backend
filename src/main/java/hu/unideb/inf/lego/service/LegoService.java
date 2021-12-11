package hu.unideb.inf.lego.service;

import hu.unideb.inf.lego.exception.LegoNotFoundException;
import hu.unideb.inf.lego.model.Lego;
import hu.unideb.inf.lego.repository.LegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class LegoService {
    private final LegoRepository legoRepository;
    @Autowired
    public LegoService(LegoRepository legoRepository){
        this.legoRepository = legoRepository;
    }
    public Lego addLego(Lego lego){
        return legoRepository.save(lego);
    }

    public List<Lego> findAllLegos(){
        return legoRepository.findAll();
    }

    public Lego updateLego(Lego lego){
        return legoRepository.save(lego);
    }

    public void deleteLego(Integer id){
        legoRepository.deleteLegoById(id);
    }

    public Lego findLegoById(Integer id){
        return legoRepository.findLegoById(id)
                .orElseThrow(() -> new LegoNotFoundException("Lego by id " + id + "was not found."));
    }
}
