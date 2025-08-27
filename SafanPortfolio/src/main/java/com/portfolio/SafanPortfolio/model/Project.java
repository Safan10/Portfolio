package com.portfolio.SafanPortfolio.model;

import java.util.List;

public class Project {
    private String title;
    private String subtitle;
    private String date;
    private String description;
    private List<String> technologies;
    private String githubUrl;
    private String liveUrl;
    private String imageUrl;

    // Constructors
    public Project() {}

    public Project(String title, String subtitle, String date, String description,
                   List<String> technologies, String githubUrl, String liveUrl, String imageUrl) {
        this.title = title;
        this.subtitle = subtitle;
        this.date = date;
        this.description = description;
        this.technologies = technologies;
        this.githubUrl = githubUrl;
        this.liveUrl = liveUrl;
        this.imageUrl = imageUrl;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getSubtitle() { return subtitle; }
    public void setSubtitle(String subtitle) { this.subtitle = subtitle; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public List<String> getTechnologies() { return technologies; }
    public void setTechnologies(List<String> technologies) { this.technologies = technologies; }

    public String getGithubUrl() { return githubUrl; }
    public void setGithubUrl(String githubUrl) { this.githubUrl = githubUrl; }

    public String getLiveUrl() { return liveUrl; }
    public void setLiveUrl(String liveUrl) { this.liveUrl = liveUrl; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}