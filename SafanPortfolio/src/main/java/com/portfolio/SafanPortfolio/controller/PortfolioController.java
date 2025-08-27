package com.portfolio.SafanPortfolio.controller;



import com.portfolio.SafanPortfolio.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.portfolio.SafanPortfolio.service.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "SAFAN UR RAHMAN");
        model.addAttribute("title", "Java Developer");
        model.addAttribute("email", "rahsafan007@gmail.com");
        model.addAttribute("linkedin", "https://www.linkedin.com/in/safan-ur-rahman-89b3a0224/");
        model.addAttribute("github", "https://github.com/Safan10");
        model.addAttribute("profileImage", "/Users/safanurrahman/Downloads/SafanPortfolio/src/main/resources/static/css/image/myprofile.jpeg");
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("currentPage", "about");
       // model.addAttribute("profileImage", "/images/profile.jpg");

        // About summary
        model.addAttribute("aboutSummary", "Java Backend Developer with hands-on experience in Spring, Spring Boot, Java, and SQL, currently working at Tata Consultancy Services (TCS). Skilled in designing and developing scalable backend applications, building RESTful APIs, and optimizing database performance. Passionate about delivering clean, maintainable code and exploring cloud and DevOps practices to strengthen system reliability and scalability.");

        // Skills data
        model.addAttribute("skills", Arrays.asList(
                "Java", "Spring", "Spring Boot", "Spring MVC", "Spring JPA",
                "Spring Security", "Hibernate", "REST API", "SQL", "MySQL",
                "MongoDB", "Python", "Django", "HTML/CSS", "JavaScript",
                "ReactJS", "C", "Git", "GitHub", "Maven", "Docker",
                "Linux", "Postman", "VS Code", "Eclipse", "IntelliJ"
        ));

        // Skills categorized
        Map<String, List<String>> categorizedSkills = new LinkedHashMap<>();
        categorizedSkills.put("Languages", Arrays.asList("Java", "Python", "SQL", "C", "HTML/CSS", "JavaScript"));
        categorizedSkills.put("Frameworks & Technologies", Arrays.asList("Spring", "Spring Boot", "Spring MVC", "Spring JPA", "Spring Security", "Hibernate", "REST API", "Django", "ReactJS"));
        categorizedSkills.put("Databases", Arrays.asList("MySQL", "MongoDB"));
        categorizedSkills.put("Developer Tools", Arrays.asList("Git", "GitHub", "Maven", "Docker", "Linux", "Postman", "VS Code", "Eclipse", "IntelliJ"));

        model.addAttribute("categorizedSkills", categorizedSkills);
        model.addAttribute("email", "rahsafan007@gmail.com");
        model.addAttribute("linkedin", "https://www.linkedin.com/in/safan-ur-rahman-89b3a0224/");
        model.addAttribute("github", "https://github.com/Safan10");

        return "about";
    }

    @GetMapping("/experience")
    public String experience(Model model) {
        model.addAttribute("currentPage", "experience");
        model.addAttribute("profileImage", "/images/profile.jpg");

        // Experience data
        List<Experience> experiences = Arrays.asList(
                new Experience(
                        "Tata Consultancy Services (TCS)",
                        "Assistant System Engineer",
                        "Sept 2024 – Present",
                        "Gurugram, Haryana, India",
                        Arrays.asList(
                                "Involved in end-to-end development and maintenance of the TCS BaNCS application for client UniCredit, ensuring high-quality deliverables",
                                "Implementing backend business logic using Java, Spring Framework, and Oracle database technologies, aligned with core BaNCS product architecture",
                                "Collaborating with cross-functional teams to ensure timely delivery of modules and enhancements",
                                "Directly interacting with client stakeholders to understand requirements, resolve issues, and deliver enhancements"
                        ),
                        Arrays.asList("Java", "Spring Framework", "Oracle Database", "TCS BaNCS", "REST APIs"),
                        "/image/tcslogo.jpg" // Optional: add TCS logo
                )
        );

        model.addAttribute("experiences", experiences);
        model.addAttribute("email", "rahsafan007@gmail.com");
        model.addAttribute("linkedin", "https://www.linkedin.com/in/safan-ur-rahman-89b3a0224/");
        model.addAttribute("github", "https://github.com/Safan10");

        return "experience";
    }

    @GetMapping("/projects")
    public String projects(Model model) {
        model.addAttribute("currentPage", "projects");
        model.addAttribute("profileImage", "/images/profile.jpg");

        // Projects data
        List<Project> projects = Arrays.asList(
                new Project(
                        "Tune Tales",
                        "Multimodal Recommendation System",
                        "August 2023",
                        "TuneTales is a multimodal recommendation system powered by machine learning. It provides personalized book and music suggestions based on user inputs in text, voice, or facial expressions. Key features include sentiment analysis, facial recognition, and YouTube integration for music recommendations.",
                        Arrays.asList("Python", "MySQL", "YouTube API", "Django", "Machine Learning", "HTML", "CSS", "JavaScript", "Sentiment Analysis", "Facial Recognition"),
                        "https://github.com/yourusername/tune-tales", // GitHub URL
                        "#", // Live demo URL (replace with actual)
                        "/images/projects/tune-tales.jpg" // Project image
                ),
                new Project(
                        "JobApp",
                        "Job Application Tracking Platform",
                        "May 2025",
                        "Building a full-stack job application tracking platform to manage job postings, applications, and statuses. Backend developed using Spring Boot with PostgreSQL for robust data persistence. Implemented features like CRUD operations, filtering, and search for job listings and applicant records.",
                        Arrays.asList("Spring Boot", "PostgreSQL", "Maven", "Java", "REST API", "CRUD Operations", "Filtering", "Search"),
                        "https://github.com/yourusername/jobapp", // GitHub URL
                        "#", // Live demo URL
                        "/images/projects/jobapp.jpg" // Project image
                ),
                new Project(
                        "Portfolio Website",
                        "Spring MVC Portfolio",
                        "Present",
                        "A professional portfolio website built with Spring MVC and Thymeleaf. Features responsive design, dynamic content rendering, and modern UI/UX. Demonstrates backend development skills with Spring Boot while showcasing projects, experience, and technical expertise.",
                        Arrays.asList("Spring MVC", "Spring Boot", "Thymeleaf", "Java", "HTML5", "CSS3", "JavaScript", "Responsive Design", "REST API"),
                        "https://github.com/yourname/portfolio", // GitHub URL
                        "http://localhost:8080", // Live demo URL
                        "/images/projects/portfolio.jpg" // Project image
                )
        );

        model.addAttribute("projects", projects);
        model.addAttribute("email", "rahsafan007@gmail.com");
        model.addAttribute("linkedin", "https://www.linkedin.com/in/safan-ur-rahman-89b3a0224/");
        model.addAttribute("github", "https://github.com/Safan10");
        return "projects";
    }
    private final EducationService educationService;

    public PortfolioController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping("/education")
    public String education(Model model) {
        // Get education data from service
        List<Education> educations = educationService.getAllEducation();

        // Add to model for Thymeleaf
        model.addAttribute("educations", educations);
        model.addAttribute("currentPage", "education");
        model.addAttribute("profileImage", "/images/profile.jpg");
        model.addAttribute("email", "rahsafan007@gmail.com");
        model.addAttribute("linkedin", "https://www.linkedin.com/in/safan-ur-rahman-89b3a0224/");
        model.addAttribute("github", "https://github.com/Safan10");
        return "education";
    }

    @GetMapping("/certificates")
    public String certificates(Model model) {
        model.addAttribute("currentPage", "certificates");
        model.addAttribute("profileImage", "/images/profile.jpg");

        // Certifications data
        List<Certificate> certifications = Arrays.asList(
                new Certificate(
                        "HackerRank Java (Basic)",
                        "HackerRank",
                        "Java Programming",
                        "2023",
                        "https://www.hackerrank.com/certificates/d4b5a2031e65",
                        "/image/java-basic.jpg",
                        "Basic Java programming skills certification"
                ),
                new Certificate(
                        "HackerRank SQL (Basic)",
                        "HackerRank",
                        "SQL Database",
                        "2023",
                        "https://www.hackerrank.com/certificates/c052ac7c1e00",
                        "/image/sql-basic.jpg",
                        "Basic SQL querying and database skills certification"
                ),
                new Certificate(
                        "HackerRank Problem Solving (Basic)",
                        "HackerRank",
                        "Problem Solving",
                        "2023",
                        "https://www.hackerrank.com/certificates/f4b35fd3e142",
                        "/image/problem-solving.jpg",
                        "Basic problem solving and algorithms certification"
                )
        );

        // Achievements data
        List<Achievement> achievements = Arrays.asList(
                new Achievement(
                        "Certificate of Excellence - Semester 5",
                        "Academic Excellence",
                        "2022",
                        "Awarded for outstanding academic performance in Semester 5",
                        "/image/certification-placeholder.jpg",
                        "#"
                ),
                new Achievement(
                        "Certificate of Excellence - Semester 6",
                        "Academic Excellence",
                        "2023",
                        "Awarded for outstanding academic performance in Semester 6",
                        "/image/certification-placeholder.jpg",
                        "#"
                ),
                new Achievement(
                        "Certificate of Excellence - Semester 7",
                        "Academic Excellence",
                        "2023",
                        "Awarded for outstanding academic performance in Semester 7",
                        "/image/certification-placeholder.jpg",
                        "#"
                )
        );

        model.addAttribute("certifications", certifications);
        model.addAttribute("achievements", achievements);
        model.addAttribute("email", "rahsafan007@gmail.com");
        model.addAttribute("linkedin", "https://www.linkedin.com/in/safan-ur-rahman-89b3a0224/");
        model.addAttribute("github", "https://github.com/Safan10");
        return "certificates";
    }


    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("currentPage", "contact");
        model.addAttribute("profileImage", "/images/profile.jpg");

        // Contact information
        model.addAttribute("email", "rahsafan007@gmail.com");
        model.addAttribute("phone", "+91 8340752392");
        model.addAttribute("linkedin", "https://linkedin.com/in/yourprofile");
        model.addAttribute("github", "https://github.com/yourusername");
        model.addAttribute("location", "Gurugram, Haryana, India");
        model.addAttribute("email", "rahsafan007@gmail.com");
        model.addAttribute("linkedin", "https://www.linkedin.com/in/safan-ur-rahman-89b3a0224/");
        model.addAttribute("github", "https://github.com/Safan10");
        return "contact";
    }

    @PostMapping("/contact")
    public String handleContactForm(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String subject,
            @RequestParam String message,
            Model model) {

        // Here you would typically:
        // 1. Send an email using JavaMailSender
        // 2. Save to database
        // 3. Or integrate with a service like SendGrid

        System.out.println("Contact form submission:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);

        // Add success message
        model.addAttribute("successMessage", "Thank you for your message! I'll get back to you soon.");
        model.addAttribute("currentPage", "contact");
        model.addAttribute("profileImage", "/images/profile.jpg");
        model.addAttribute("email", "rahsafan007@gmail.com");
        model.addAttribute("phone", "+91 8340752392");
        model.addAttribute("linkedin", "https://www.linkedin.com/in/safan-ur-rahman-89b3a0224/");
        model.addAttribute("github", "https://github.com/Safan10");
        model.addAttribute("location", "Gurugram, Haryana, India");
        model.addAttribute("email", "rahsafan007@gmail.com");
        model.addAttribute("linkedin", "https://www.linkmv edin.com/in/safan-ur-rahman-89b3a0224/");
        model.addAttribute("github", "https://github.com/Safan10");
        return "contact";
    }
}