package org.example;

public class PCFactory implements ComputerAbstractFactory {

    private String RAM;
    private String HDD;
    private String CPU;

    public PCFactory(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    @Override
    public Computer createComputer() {
        return new PC(RAM, HDD, CPU);
    }
}
