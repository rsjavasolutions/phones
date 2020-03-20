package rs.java.phonecrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.java.phonecrud.model.Phone;
import rs.java.phonecrud.repository.PhoneRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class PhoneController {

    private PhoneRepository phoneRepository;

    @Autowired
    public PhoneController(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @GetMapping("phones")
    public Iterable<Phone> allPhones() {
        return phoneRepository.findAll();
    }

    @GetMapping("phones/{id}")
    public Optional<Phone> getPhoneById(@PathVariable Integer id) {
        return phoneRepository.findById(id);
    }

    @GetMapping("phones/models")
    public Iterable<Phone> getAllPhonesOfModel(@RequestParam (required = false) String model) {
        if (model != null) {
            return phoneRepository.findByModel(model);
        } else {
            return phoneRepository.findAll();
        }
    }

    @PostMapping("phones")
    public Phone addPhone (@RequestBody Phone phone){
        return phoneRepository.save(phone);
    }

    @DeleteMapping ("phones/{id}")
    public ResponseEntity<Phone> deletePhone(@PathVariable Integer id){
        Optional<Phone> optionalPhone = phoneRepository.findById(id);
        if (optionalPhone.isPresent()){
            phoneRepository.delete(optionalPhone.get());
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("phones/{id}")
    public ResponseEntity<Phone> updatePhone(@PathVariable Integer id, @RequestBody Phone phone){
        Optional<Phone> optionalPhone = phoneRepository.findById(id);
        if (optionalPhone.isPresent()){
            optionalPhone = Optional.of(phone);
            phoneRepository.save(optionalPhone.get());
            return new ResponseEntity<>(HttpStatus.OK);
        } else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
