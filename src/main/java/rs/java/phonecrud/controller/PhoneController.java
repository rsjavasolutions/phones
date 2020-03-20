package rs.java.phonecrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.java.phonecrud.model.Phone;
import rs.java.phonecrud.repository.PhoneRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PhoneController {

    private PhoneRepository phoneRepository;

    @Autowired
    public PhoneController(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @GetMapping("/phones")
    public List<Phone> allPhones(){
        return phoneRepository.findAll();
    }

}
