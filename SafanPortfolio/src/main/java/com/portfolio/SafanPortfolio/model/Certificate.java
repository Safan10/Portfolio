package com.portfolio.SafanPortfolio.model;





public class Certificate {
    private String title;
    private String issuer;
    private String category;
    private String year;
    private String certificateUrl;
    private String imageUrl;
    int a;
    private String description;

    // Constructors
    public Certificate() {}

    public Certificate(String title, String issuer, String category, String year,
                       String certificateUrl, String imageUrl, String description) {
        this.title = title;
        this.issuer = issuer;
        this.category = category;
        this.year = year;
        this.certificateUrl = certificateUrl;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getIssuer() { return issuer; }
    public void setIssuer(String issuer) { this.issuer = issuer; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getYear() { return year; }
    public void setYear(String year) { this.year = year; }

    public String getCertificateUrl() { return certificateUrl; }
    public void setCertificateUrl(String certificateUrl) { this.certificateUrl = certificateUrl; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}