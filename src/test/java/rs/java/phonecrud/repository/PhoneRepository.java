package rs.java.phonecrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.java.phonecrud.model.Phone;

public interface PhoneRepository extends JpaRepository <Phone, Integer> {
}
