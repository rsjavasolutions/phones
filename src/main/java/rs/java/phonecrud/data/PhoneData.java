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

        Phone phone = new Phone();
        phone.setId(1);
        phone.setBrand("Iphone");
        phone.setModel("11");
        phone.setPrice(new BigDecimal("3890.99"));
        phone.setProduction(LocalDate.of(2020,1,20));
        phone.isNew(true);
    }
}
