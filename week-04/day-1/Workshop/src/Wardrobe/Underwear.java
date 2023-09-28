package Wardrobe;

public class Underwear extends Cloth{

    public Underwear(String type, String color) {
        super(type, color, 100);
    }
    public Underwear(String type, String color, int condition) {
        super(type, color, condition);
    }

    @Override
    public boolean needsToBeWashed() {
        if (daysWorn == 1) {
            washingNeeded = true;
            System.out.println("Needs to be washed.");
        } else
            washingNeeded = false;
        return washingNeeded;
    }

    @Override
    public boolean needsToBeRepaired() {
        return super.needsToBeRepaired();
    }

    @Override
    public String toString() {
        return "Underwear{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", condition=" + condition +
                ", daysWorn=" + daysWorn +
                ", washingNeeded=" + washingNeeded +
                ", repairNeeded=" + repairNeeded +
                "} " + super.toString();
    }
}
