package com.portfolio.SafanPortfolio.service;



import com.portfolio.SafanPortfolio.model.Education;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class EducationService {

    public List<Education> getAllEducation() {
        // This could come from database, for now using sample data
        return Arrays.asList(
                new Education(
                        "Future Institute of Engineering and Management",
                        "B.TECH",
                        "Computer Science - Data Science",
                        LocalDate.of(2020, 10, 1),
                        LocalDate.of(2024, 6, 30),
                        " CGPA : 9.16",
                        "Btech in Computer Science specialized with data science along with software development, problem solving and algorithms. Completed Tunetales project on machine learning.",
                        "Kolkata, West Bengal",
                        "image/fiem.jpg"
                ),
                new Education(
                        "DAV Kapildev Public School",
                        "12th",
                        "CBSE",
                        LocalDate.of(2018, 4, 1),
                        LocalDate.of(2019, 5, 31),
                        "71.6%",
                        "",
                        "Ranchi, Jharkhand",
                        "/image/school.jpg"
                ),
        new Education(
                "St Anthony's School",
                "10th",
                "ICSE",
                LocalDate.of(2016, 4, 1),
                LocalDate.of(2017, 5, 31),
                "77.17%",
                "",
                "Ranchi, Jharkhand",
                "/image/school.jpg"

        )
        );
    }
}