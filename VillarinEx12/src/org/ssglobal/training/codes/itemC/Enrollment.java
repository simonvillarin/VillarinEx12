package org.ssglobal.training.codes.itemC;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Enrollment {

	private Set<Student> biology = new HashSet<>();
	private Set<Student> comsci = new HashSet<>();
	private Set<Student> engineering = new HashSet<>();
	
	public void addStudent(Student student) {
        if (student.getSubject().equalsIgnoreCase("biology")) {
            biology.add(student);
        } else if (student.getSubject().equalsIgnoreCase("comSci")) {
            comsci.add(student);
        } else if (student.getSubject().equalsIgnoreCase("engineering")) {
            engineering.add(student);
        }
    }
	
	public Map<String, Set<Student>> getMajor() {
		Set<Student> biology = new HashSet<>(this.biology);
		Set<Student> comsci = new HashSet<>(this.comsci);
		Set<Student> engineering = new HashSet<>(this.engineering);
		
		for (Student student: this.biology) {
			if (!this.comsci.contains(student) || !this.engineering.contains(student)) {
				biology.add(student);
			}
		}
		
		for (Student student: this.comsci) {
			if (!this.biology.contains(student) || !this.engineering.contains(student)) {
				comsci.add(student);
			}
		}
		
		for (Student student: this.engineering) {
			if (!this.biology.contains(student) || !this.comsci.contains(student)) {
				engineering.add(student);
			}
		}
		
		Map<String, Set<Student>> majors = new HashMap<>();
		majors.put("Biology Only", biology);
		majors.put("ComSci Only", comsci);
		majors.put("Engineering Only", engineering);		
        return majors;
    }

    public Set<Student> getElectives() {
        Set<Student> electives = new HashSet<>();
        
        for (Student student: this.biology) {
			if (this.comsci.contains(student) && this.engineering.contains(student)) {
				electives.add(student);
			}
		}
		
		for (Student student: this.comsci) {
			if (this.biology.contains(student) && this.engineering.contains(student)) {
				electives.add(student);
			}
		}
		
		for (Student student: this.engineering) {
			if (this.biology.contains(student) && this.comsci.contains(student)) {
				electives.add(student);
			}
		}       
        return electives;
    }

    public Set<Student> getComSci() {
        return comsci;
    }

    public Set<Student> getBio() {
        return biology;
    }

    public Set<Student> getEngineering() {
        return engineering;
    }
}
