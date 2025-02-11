package AIDrivenResumeScreeningSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ScreeningSystem screeningSystem = new ScreeningSystem();

        // Create resumes
        Resume<SoftwareEngineer> resume1 = new Resume<>("Alice", new SoftwareEngineer());
        resume1.addSkill("Java");
        resume1.addSkill("Spring");

        Resume<DataScientist> resume2 = new Resume<>("Bob", new DataScientist());
        resume2.addSkill("Python");
        resume2.addSkill("Machine Learning");

        Resume<SoftwareEngineer> resume3 = new Resume<>("Charlie", new SoftwareEngineer());
        resume3.addSkill("C++");
        resume3.addSkill("Algorithms");

        Resume<ProductManager> resume4 = new Resume<>("David", new ProductManager());
        resume4.addSkill("Product Strategy");
        resume4.addSkill("Market Analysis");

        List<Resume<? extends JobRole>> allResumes = new ArrayList<>();
        allResumes.add(resume1);
        allResumes.add(resume2);
        allResumes.add(resume3);
        allResumes.add(resume4);

        // Screen resumes for Software Engineers
        List<Resume<SoftwareEngineer>> softwareEngineerResumes = screeningSystem.screenResumes(allResumes, SoftwareEngineer.class);
        System.out.println("\nSoftware Engineer Resumes:");
        for (Resume<SoftwareEngineer> resume: softwareEngineerResumes) {
            System.out.println(resume);
        }

        // Screen resumes for Data Scientists
        List<Resume<DataScientist>> dataScientistResumes = screeningSystem.screenResumes(allResumes, DataScientist.class);
        System.out.println("\nData Scientist Resumes:");
        for (Resume<DataScientist> resume: dataScientistResumes) {
            System.out.println(resume);
        }

        // General processing of all resumes (wildcard method)
        screeningSystem.processResumes(allResumes);
    }
}