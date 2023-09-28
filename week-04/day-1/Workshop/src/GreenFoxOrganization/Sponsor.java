package GreenFoxOrganization;

public class Sponsor extends Person {
    private String company;
    private int hiredStudents;

    @Override
    public void introduce() {
        super.introduce();
        System.out.println(" who represents a company " + company + " and hired " + hiredStudents + " students so far." );
    }
    public int hire () {
        hiredStudents++;
        return hiredStudents;
    }

    @Override
    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

    public Sponsor (String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
    }

    public Sponsor (){
        super();
        this.company = "Google";
       this.hiredStudents = 0;
    }


}
