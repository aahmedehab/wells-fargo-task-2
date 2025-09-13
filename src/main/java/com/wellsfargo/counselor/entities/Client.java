package com.wellsfargo.counselor.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @Column(name = "advisor_id", nullable = false)
    private Long advisorId;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "dob", nullable = false)
    private LocalDateTime dob;

    public Client(Long advisorId, String lastName, String email, String phone, String address, LocalDateTime dob) {
        this.advisorId = advisorId;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.dob = dob;
    }

    public Long getClientId() { return clientId; }
    public Long getAdvisorId() { return advisorId; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    public LocalDateTime getDob() { return dob; }

    public void setAdvisorId(Long advisorId) { this.advisorId = advisorId; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setAddress(String address) { this.address = address; }
    public void setDob(LocalDateTime dob) { this.dob = dob; }
}