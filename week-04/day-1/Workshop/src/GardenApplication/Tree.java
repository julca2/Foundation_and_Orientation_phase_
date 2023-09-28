package GardenApplication;

public class Tree extends Plants{

    int newTreeWaterAmount;


    public Tree(String color, int plantsWaterAmount) {
        super(color, plantsWaterAmount);
    }

    @Override
    public int getWatered(int waterAmountNeeded) {
        super.getWatered(dividedAmount);
        newTreeWaterAmount = plantsWaterAmount + (waterAmountNeeded*40/100);
        setPlantsWaterAmount(newTreeWaterAmount);
        return newTreeWaterAmount;
        }


    @Override
    public boolean itNeedsWater() {
        System.out.println(newTreeWaterAmount);
        if (plantsWaterAmount <= 10) {
            System.out.println("The " + color + " Tree needs water");
            needsWater = true;
        } else {
            System.out.println("The " + color + " Tree doesn't need water");
            needsWater = false;
        }
        return needsWater;
    }
}

