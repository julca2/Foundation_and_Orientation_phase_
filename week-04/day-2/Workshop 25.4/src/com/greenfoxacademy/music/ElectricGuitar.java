package com.greenfoxacademy.music;

public class ElectricGuitar extends StringedInstrument {


    public ElectricGuitar() {
        name = "Electric guitar";
        this.name = name;
        this.numberOfStrings = 6;
    }
    public ElectricGuitar(int numberOfStrings) {
        name = "Electric guitar";
        this.name = name;
        this.numberOfStrings = numberOfStrings;
    }



    @Override
    public void setName(String name) {
        super.setName("Electric Guitar");
    }
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Twang");
    }

}
