package com.portfolio.SafanPortfolio.model;

import java.util.List;

public class Experience {
    private String company;
    private String position;
    private String duration;
    private String location;
    private List<String> responsibilities;
    private List<String> technologies;
    private String logoUrl;

    // Constructors
    public Experience() {}

    public Experience(String company, String position, String duration, String location,
                      List<String> responsibilities, List<String> technologies, String logoUrl) {
        this.company = company;
        this.position = position;
        this.duration = duration;
        this.location = location;
        this.responsibilities = responsibilities;
        this.technologies = technologies;
        this.logoUrl = logoUrl;
    }

    // Getters and Setters
    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public List<String> getResponsibilities() { return responsibilities; }
    public void setResponsibilities(List<String> responsibilities) { this.responsibilities = responsibilities; }

    public List<String> getTechnologies() { return technologies; }
    public void setTechnologies(List<String> technologies) { this.technologies = technologies; }

    public String getLogoUrl() { return logoUrl; }
    public void setLogoUrl(String logoUrl) { this.logoUrl = logoUrl; }
}