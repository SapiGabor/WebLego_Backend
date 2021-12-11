package hu.unideb.inf.lego.resource;


import hu.unideb.inf.lego.model.Lego;
import hu.unideb.inf.lego.service.LegoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lego")
public class LegoResource {
    private final LegoService legoService;

    public LegoResource(LegoService legoService) {
        this.legoService = legoService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Lego>> getAllLegos() {
        List<Lego> legos = legoService.findAllLegos();
        return new ResponseEntity<>(legos, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Lego> getLegoById(@PathVariable("id") Integer id) {
        Lego lego = legoService.findLegoById(id);
        return new ResponseEntity<>(lego, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Lego> addLego(@RequestBody Lego lego) {
        Lego newLego = legoService.addLego(lego);
        return new ResponseEntity<>(newLego, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Lego> updateLego(@RequestBody Lego lego) {
        Lego updatedLego = legoService.updateLego(lego);
        return new ResponseEntity<>(updatedLego, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteLego(@PathVariable("id") Integer id) {
        legoService.deleteLego(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}