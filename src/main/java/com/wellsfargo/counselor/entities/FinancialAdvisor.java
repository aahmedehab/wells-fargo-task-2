package com.wellsfargo.counselor.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "office_location", nullable = false)
    private String officeLocation;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    public FinancialAdvisor(String firstName, String lastName, String email, String phone, String officeLocation, LocalDateTime createdAt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.officeLocation = officeLocation;
        this.createdAt = createdAt;
    }

    public Long getAdvisorId() { return advisorId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getOfficeLocation() { return officeLocation; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setOfficeLocation(String officeLocation) { this.officeLocation = officeLocation; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}