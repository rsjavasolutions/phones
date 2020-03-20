package rs.java.phonecrud.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import rs.java.phonecrud.model.Phone;
import rs.java.phonecrud.repository.PhoneRepository;

import java.math.BigDecimal;
import java.time.LocalDate;

@Component
public class PhoneData implements CommandLineRunner {

    private PhoneRepository phoneRepository;

    @Autowired
    public PhoneData(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Phone phone1 = new Phone();
        phone1.setId(1);
        phone1.setBrand("Iphone");
        phone1.setModel("11");
        phone1.setPrice(new BigDecimal("3890.99"));
        phone1.setProduction(LocalDate.of(2020,1,20));
        phone1.isNew(true);

        Phone phone2 = new Phone();
        phone2.setId(2);
        phone2.setBrand("Samsung");
        phone2.setModel("S10");
        phone2.setPrice(new BigDecimal("4000.01"));
        phone2.setProduction(LocalDate.of(2019,10,20));
        phone2.isNew(false);

        phoneRepository.save(phone1);
        phoneRepository.save(phone2);
    }
}
