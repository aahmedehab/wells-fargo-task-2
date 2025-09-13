package com.wellsfargo.counselor.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "purchase_date", nullable = false)
    private LocalDateTime purchaseDate;

    @Column(name = "purchase_price", nullable = false)
    private Integer purchasePrice;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "portfolio_id", nullable = false)
    private Long portfolioId;

    public Security(String name, String category, LocalDateTime purchaseDate, Integer purchasePrice, Integer quantity, Long portfolioId) {
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.portfolioId = portfolioId;
    }

    public Long getSecurityId() { return securityId; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public LocalDateTime getPurchaseDate() { return purchaseDate; }
    public Integer getPurchasePrice() { return purchasePrice; }
    public Integer getQuantity() { return quantity; }
    public Long getPortfolioId() { return portfolioId; }

    public void setName(String name) { this.name = name; }
    public void setCategory(String category) { this.category = category; }
    public void setPurchaseDate(LocalDateTime purchaseDate) { this.purchaseDate = purchaseDate; }
    public void setPurchasePrice(Integer purchasePrice) { this.purchasePrice = purchasePrice; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
    public void setPortfolioId(Long portfolioId) { this.portfolioId = portfolioId; }
}