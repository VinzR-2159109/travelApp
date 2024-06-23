package be.vinz.travelapp.service;

import be.vinz.travelapp.exception.ResourceNotFoundException;
import be.vinz.travelapp.model.Day;
import be.vinz.travelapp.repository.DayRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DayService {
    @Autowired
    private DayRepo dayRepository;

    public List<Day> getAllDays() {
        List<Day> days =  (List<Day>) dayRepository.findAll();
        if (days.isEmpty()) {
            throw new ResourceNotFoundException("No days found");
        } else{
            return days;
        }
    }

    public Day getDayById(Long id) {
        return dayRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No days found with id: " + id));
    }

    public Day saveDay(Day day) {
        return dayRepository.save(day);
    }

    public void deleteDay(Long id) {
        dayRepository.deleteById(id);
    }
}
