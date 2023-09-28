package GardenApplication;

public abstract class Plants extends Garden{
    String color;
    int plantsWaterAmount;

    boolean needsWater;


    public Plants(String color, int plantsWaterAmount) {
        this.color = color;
        this.plantsWaterAmount = plantsWaterAmount;
    }

    public int getWatered (int waterAmountNeeded){
        return waterAmountNeeded;
    }


    public boolean itNeedsWater() {
        return needsWater;
    }

    public void setPlantsWaterAmount(int plantsWaterAmount) {
        this.plantsWaterAmount = plantsWaterAmount;
    }
}
