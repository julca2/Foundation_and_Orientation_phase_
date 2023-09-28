package Wardrobe;

public class Overwear extends Cloth {
    public Overwear(String type, String color, int condition) {
        super(type, color, condition);
    }

    @Override
    public boolean needsToBeWashed() {
        if (daysWorn >= 5 ) {
            washingNeeded = true;
            System.out.println("Needs to be washed.");
        }else {
            washingNeeded = false;
        }
        return washingNeeded;
    }

    @Override
    public boolean needsToBeRepaired() {
        if (this.condition < 5 && this.condition > 1 ) {
            repairNeeded = true;
            System.out.println("Needs to be repaired.");
        } else {
            repairNeeded = false;
        }
        return repairNeeded;
    }

    @Override
    public String toString() {
        return "Overwear{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", condition=" + condition +
                ", daysWorn=" + daysWorn +
                ", washingNeeded=" + washingNeeded +
                ", repairNeeded=" + repairNeeded +
                "} " + super.toString();
    }
}
