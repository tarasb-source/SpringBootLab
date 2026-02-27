package tarasb.springframework.springfsintro.repositories;

import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tarasb.springframework.springfsintro.entities.Greeting;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Integer> {
}
