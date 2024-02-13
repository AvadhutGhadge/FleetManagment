package com.example.demo.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "Car",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"number_plate"})})
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Car_ID")
    private Long carId;

    @Column(name = "CarType_ID")
    private Long carTypeId;

    @Column(name = "Car_Name")
    private String carName;

    @Column(name = "Number_Plate", unique = true, length = 50)
    private String numberPlate;

    @Column(name = "Fuel_Type", length = 50)
    private String fuelType;

    @Column(name = "Capacity")
    private int capacity;

    @Column(name = "Mileage")
    private double mileage;

    @Column(name = "Hub_ID")
    private Long hubId;

    @Enumerated(EnumType.STRING)
    @Column(name = "Is_Available", length = 1)
    private AvailabilityStatus isAvailable;

    @Column(name = "Maintenance_Due_Date")
    private Date maintenanceDueDate;

    public enum AvailabilityStatus {
        Y, N
    }

    // Constructors

    public Car() {
    }

    public Car(Long carTypeId, String carName, String numberPlate, String fuelType,
                     int capacity, double mileage, Long hubId, AvailabilityStatus isAvailable,
                     Date maintenanceDueDate) {
        this.carTypeId = carTypeId;
        this.carName = carName;
        this.numberPlate = numberPlate;
        this.fuelType = fuelType;
        this.capacity = capacity;
        this.mileage = mileage;
        this.hubId = hubId;
        this.isAvailable = isAvailable;
        this.maintenanceDueDate = maintenanceDueDate;
    }

    // Getters and setters

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Long getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(Long carTypeId) {
        this.carTypeId = carTypeId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public Long getHubId() {
        return hubId;
    }

    public void setHubId(Long hubId) {
        this.hubId = hubId;
    }

    public AvailabilityStatus getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(AvailabilityStatus isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Date getMaintenanceDueDate() {
        return maintenanceDueDate;
    }

    public void setMaintenanceDueDate(Date maintenanceDueDate) {
        this.maintenanceDueDate = maintenanceDueDate;
    }
}
