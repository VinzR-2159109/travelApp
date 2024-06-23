package be.vinz.travelapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


import java.util.Date;
import java.util.List;

@Entity
public class Day {
    //DataMembers
    @Id private Long id;
    private String name;
    private Date date;
    @OneToMany @JoinColumn(name = "day_id")private List<Activity> activities;

    //Getters&Setters
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public List<Activity> getActivities() {
        return activities;
    }
    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }
}
