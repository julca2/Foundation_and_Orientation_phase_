package Wardrobe;

public abstract class Cloth {
    String type;
    String color;
    int condition;

    int daysWorn = 0;

    boolean washingNeeded;

    boolean repairNeeded;

    static int initialCondition;

    public Cloth(String type, String color, int condition) {
        this.type = type;
        this.color = color;
        this.condition = condition;
        initialCondition = condition;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
        
    }

    public boolean needsToBeWashed (){
        return needsToBeWashed();
    }

    public boolean needsToBeRepaired (){
        return needsToBeRepaired();
    }

    public void wear(){
        daysWorn++;
    }

    public void wash (){
        daysWorn = 0;
        condition--;
    }

    public void repair (){
        setCondition(initialCondition);
    }

    public void getInfo () {
        System.out.println(color + " " + type + " worn for " + daysWorn + " days, has " + condition + " wash cycles left");
    }
}
