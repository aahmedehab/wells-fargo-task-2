package com.wellsfargo.counselor.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @Column(name = "client_id", nullable = false)
    private Long clientId;

    @Column(name = "created_date", nullable = false)
    private LocalDateTime createdDate;

    public Portfolio(Long clientId, LocalDateTime createdDate) {
        this.clientId = clientId;
        this.createdDate = createdDate;
    }

    public Long getPortfolioId() { return portfolioId; }
    public Long getClientId() { return clientId; }
    public LocalDateTime getCreatedDate() { return createdDate; }

    public void setClientId(Long clientId) { this.clientId = clientId; }
    public void setCreatedDate(LocalDateTime createdDate) { this.createdDate = createdDate; }
}