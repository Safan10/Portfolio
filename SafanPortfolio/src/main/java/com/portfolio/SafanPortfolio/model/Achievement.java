package com.portfolio.SafanPortfolio.model;



public class Achievement {
    private String title;
    private String category;
    private String year;
    private String description;
    private String imageUrl;
    private String certificateUrl;

    // Constructors
    public Achievement() {}

    public Achievement(String title, String category, String year, String description,
                       String imageUrl, String certificateUrl) {
        this.title = title;
        this.category = category;
        this.year = year;
        this.description = description;
        this.imageUrl = imageUrl;
        this.certificateUrl = certificateUrl;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getYear() { return year; }
    public void setYear(String year) { this.year = year; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getCertificateUrl() { return certificateUrl; }
    public void setCertificateUrl(String certificateUrl) { this.certificateUrl = certificateUrl; }
}