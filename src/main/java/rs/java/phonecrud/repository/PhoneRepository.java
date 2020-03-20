package rs.java.phonecrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.java.phonecrud.model.Phone;

@Repository
public interface PhoneRepository extends JpaRepository <Phone, Integer> {
}
