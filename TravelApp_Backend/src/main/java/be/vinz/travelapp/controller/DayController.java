package be.vinz.travelapp.controller;

import be.vinz.travelapp.model.Day;
import be.vinz.travelapp.service.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("api/days")
public class DayController {
    @Autowired
    DayService dayService;

    @GetMapping()
    public ResponseEntity<List<Day>> getAllDays() {
        List<Day> days = dayService.getAllDays();
        System.out.println(days);
        return ResponseEntity.ok(days);
    }

    @PostMapping
    public ResponseEntity<Void> createDay(@RequestBody Day day) throws URISyntaxException {
        Day createdDay = dayService.saveDay(day);
        URI location = new URI("/api/days/" + createdDay.getId());
        return ResponseEntity.created(location).build();
    }
}
