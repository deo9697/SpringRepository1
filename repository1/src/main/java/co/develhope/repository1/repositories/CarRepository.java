package co.develhope.repository1.repositories;

import co.develhope.repository1.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car , Integer> {
}
