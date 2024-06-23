package be.vinz.travelapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Activity {
    //DataMembers
    @Id private Long id;

    private String name;
    private String description;

    private Double latitude;
    private Double longitude;

    private Double price;

    //Getters&Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
}
