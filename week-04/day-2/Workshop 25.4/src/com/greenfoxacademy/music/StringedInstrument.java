package com.greenfoxacademy.music;

public class StringedInstrument extends Instrument{
    protected int numberOfStrings;


    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void play(){
        System.out.print(getName() + ", a " + numberOfStrings + "-stringed instrument that goes " );
        sound();
    }

    public void sound(){
    }

}

