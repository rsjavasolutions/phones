package rs.java.phonecrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.java.phonecrud.repository.PhoneRepository;

@RestController
@RequestMapping("/api")
public class PhoneController {

    private PhoneRepository phoneRepository;

    @Autowired
    public PhoneController(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    

}
