package com.maciej.packages.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Package {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Double width;
    private Double height;
    private String description;

    public Package() {}

    public Package(String name, Double width, Double height, String description) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Package aPackage = (Package) o;
        return Objects.equals(id, aPackage.id) &&
                Objects.equals(name, aPackage.name) &&
                Objects.equals(width, aPackage.width) &&
                Objects.equals(height, aPackage.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, width, height);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public Double getwidth() {
        return width;
    }

    public void setwidth(Double width) {
        this.width = width;
    }

    public Double getheight() {
        return height;
    }

    public void setheight(Double height) {
        this.height = height;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Package{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
