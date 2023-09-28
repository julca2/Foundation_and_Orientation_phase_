package PetrolStation;

public class Station {
   private int gasAmount;

    public int getGasAmount() {
        return gasAmount;
    }

    public void setGasAmount(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public void refill (Car myCar ){
        this.gasAmount = gasAmount - myCar.getCapacity();
        System.out.println("Refilling");
        myCar.setGasAmount(myCar.getCapacity());

    }
}
