package GreenFoxOrganization;

public class Student extends Person{
    private String previousOrganization;
    private int skippedDays;

    public void getGoal (){
        System.out.println("Be a junior software developer.");
    }
    public void introduce(){
        super.introduce();
        System.out.println(" from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public int skipDays( int numberOfDays) {
        skippedDays = this.skippedDays+numberOfDays;
        return skippedDays;
    }
    public Student (String name, int age, String gender, String previousOrganization) {
    super (name, age, gender);
    this.previousOrganization = previousOrganization;
    }

    public Student () {
        super();
        this.previousOrganization = "The school of Life";
    }

}
