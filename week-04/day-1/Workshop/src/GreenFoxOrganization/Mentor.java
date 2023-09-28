package GreenFoxOrganization;

public class Mentor extends Person implements Cloneable{
    private String level;

    @Override
    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println(" " + level + " mentor");
    }
    public Mentor () {
        super();
        this.level = "intermediate";
    }

    public Mentor (String name, int age, String gender, String level) {
        super (name, age, gender);
        this.level = level;
    }

}
