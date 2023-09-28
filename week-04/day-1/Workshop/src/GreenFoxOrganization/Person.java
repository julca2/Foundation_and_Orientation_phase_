package GreenFoxOrganization;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person () {
        this.name = "Jana Doe";
        this.age = 30;
        this.gender = "female";
    }

    public void getGoal(){
        System.out.println("My goal is: Live for the moment.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void introduce () {
        System.out.print("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() );
    }
}

