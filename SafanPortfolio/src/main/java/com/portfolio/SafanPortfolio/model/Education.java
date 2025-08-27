package com.portfolio.SafanPortfolio.model;



import java.time.LocalDate;

public class Education {
    private String institution;
    private String degree;
    private String fieldOfStudy;
    private LocalDate startDate;
    private LocalDate endDate;
    private String grade;
    private String description;
    private String location;
    private String logoUrl;

    // Constructors
    public Education() {}

    public Education(String institution, String degree, String fieldOfStudy,
                     LocalDate startDate, LocalDate endDate, String grade,
                     String description, String location, String logoUrl) {
        this.institution = institution;
        this.degree = degree;
        this.fieldOfStudy = fieldOfStudy;
        this.startDate = startDate;
        this.endDate = endDate;
        this.grade = grade;
        this.description = description;
        this.location = location;
        this.logoUrl = logoUrl;
    }

    // Getters and Setters
    public String getInstitution() { return institution; }
    public void setInstitution(String institution) { this.institution = institution; }

    public String getDegree() { return degree; }
    public void setDegree(String degree) { this.degree = degree; }

    public String getFieldOfStudy() { return fieldOfStudy; }
    public void setFieldOfStudy(String fieldOfStudy) { this.fieldOfStudy = fieldOfStudy; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getLogoUrl() { return logoUrl; }
    public void setLogoUrl(String logoUrl) { this.logoUrl = logoUrl; }

    // Helper method to format date range
    public String getFormattedDateRange() {
        if (endDate != null) {
            return startDate.getYear() + " - " + endDate.getYear();
        } else {
            return startDate.getYear() + " - Present";
        }
    }
}