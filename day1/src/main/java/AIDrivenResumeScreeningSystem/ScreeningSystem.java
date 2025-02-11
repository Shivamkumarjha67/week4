package AIDrivenResumeScreeningSystem;

import java.util.ArrayList;
import java.util.List;

// AI-Driven Screening System
class ScreeningSystem {
    // Generic method to screen resumes for a specific job role
    public <T extends JobRole> List<Resume<T>> screenResumes(List<Resume<? extends JobRole>> resumes, Class<T> jobRoleType) {
        List<Resume<T>> screenedResumes = new ArrayList<>();

        for (Resume<? extends JobRole> resume: resumes) {
            if (jobRoleType.isInstance(resume.getJobRole())) { // Check if resume's job role matches
                screenedResumes.add((Resume<T>) resume); // Safe cast because of the type check
            }
        }
        return screenedResumes;
    }

    // Wildcard method to process resumes for any job role (more general processing)
    public void processResumes(List<Resume<? extends JobRole>> resumes) {
        System.out.println("\nProcessing Resumes (General):");
        for (Resume<? extends JobRole> resume: resumes) {
            System.out.println(resume); // Basic processing: just print the resume
            // Add more general processing logic here (e.g., keyword extraction, etc.)
        }
    }
}