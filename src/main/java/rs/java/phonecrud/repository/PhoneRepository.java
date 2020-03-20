package rs.java.phonecrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rs.java.phonecrud.model.Phone;

import java.util.List;
import java.util.Optional;

@Repository
public interface PhoneRepository extends CrudRepository<Phone, Integer> {


    //Iterable<Employee> findByJob(String job)
    Iterable<Phone> findByModel(String model);

}
