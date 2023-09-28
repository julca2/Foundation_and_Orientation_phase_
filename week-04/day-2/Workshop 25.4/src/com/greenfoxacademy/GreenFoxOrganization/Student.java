package com.greenfoxacademy.GreenFoxOrganization;

public class Student extends Person implements Cloneable {
    private String previousOrganization;
    private int skippedDays;

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void introduce() {
        super.introduce();
        System.out.println(" from " + previousOrganization + " who skipped " + skippedDays + " days from the course alredy.");
    }

    public int skipDays(int numberOfDays) {
        skippedDays = this.skippedDays + numberOfDays;
        return skippedDays;
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
    }

    public Student() {
        super();
        this.previousOrganization = "The school of Life";
    }

    protected Student clone() {
        Student studenty = new Student(this.getName(), this.getAge(), this.getGender(), this.previousOrganization);
        return studenty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "previousOrganization='" + previousOrganization + '\'' +
                "} " + super.toString();
    }
}
