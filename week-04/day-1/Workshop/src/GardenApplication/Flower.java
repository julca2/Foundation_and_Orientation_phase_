package GardenApplication;

public class Flower extends Plants {

    int newFlowerWaterAmount;

    public Flower(String color, int plantsWaterAmount) {
        super(color, plantsWaterAmount);
    }

    @Override
    public int getWatered(int waterAmountNeeded) {
        //super.getWatered(dividedAmount);
        newFlowerWaterAmount = this.plantsWaterAmount + (waterAmountNeeded * 75 / 100);
        setPlantsWaterAmount(newFlowerWaterAmount);
        return newFlowerWaterAmount;
    }


    public boolean itNeedsWater() {
        System.out.println(newFlowerWaterAmount);
        if (plantsWaterAmount <= 5) {
            System.out.println("The " + color + " Flower needs water");
            needsWater = true;
        } else {
            System.out.println("The " + color + " Flower doesn't need water");
            needsWater = false;
        }
        return needsWater;
    }
}
