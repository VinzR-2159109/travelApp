package be.vinz.travelapp.repository;

import be.vinz.travelapp.model.Activity;
import org.springframework.data.repository.CrudRepository;

public interface ActivityRepo extends CrudRepository<Activity, Long> {
}
