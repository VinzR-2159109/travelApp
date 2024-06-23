package be.vinz.travelapp.repository;

import be.vinz.travelapp.model.Day;
import org.springframework.data.repository.CrudRepository;

public interface DayRepo extends CrudRepository<Day, Long> {
}
