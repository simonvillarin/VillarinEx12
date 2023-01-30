package org.ssglobal.training.codes.itemC;
import java.util.Map.Entry;
import java.util.Set;

public class TestEnrollment {

	public static void main(String[] args) {
		Enrollment enrollment = new Enrollment();
        Student s1 = new Student("Simon", "biology", 2018);
        Student s2 = new Student("Simon", "comsci", 2018);
        Student s3 = new Student("Simon", "engineering", 2018);
        Student s4 = new Student("James", "comsci", 2019);
        Student s5 = new Student("John", "biology", 2020);
        Student s6 = new Student("Stewie", "engineering", 2021);
        Student s7 = new Student("Mark", "comSci", 2022);
        
        enrollment.addStudent(s1);
        enrollment.addStudent(s2);
        enrollment.addStudent(s3);
        enrollment.addStudent(s4);
        enrollment.addStudent(s5);
        enrollment.addStudent(s6);
        enrollment.addStudent(s7);
        
        for (Entry<String, Set<Student>> student: enrollment.getMajor().entrySet()) {
            System.out.println("%s = %s".formatted(student.getKey(), student.getValue()));
        }
        
        System.out.println("Electives: %s".formatted(enrollment.getElectives()));
        System.out.println("Biology: %s".formatted(enrollment.getBio()));
        System.out.println("Comsci: %s".formatted(enrollment.getBio()));
        System.out.println("Engineering: %s".formatted(enrollment.getBio()));
	}

}
