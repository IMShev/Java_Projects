package Task6;

public class Laptop {
    private String model;
    private int screenSize;
    private String cpu;
    private int ram;
    private int ssd;
    private String os;
    private String color;

    public String getModel() {
        return model;
    }

    public int getScreenSizer() {
        return screenSize;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public Laptop(String model, int screenSize, String cpu, int ram, int ssd, String os, String color) {
        this.model = model;
        this.screenSize = screenSize;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s  %d'  %s  %dGB  %dGB  %s  %s  \n", model, screenSize, cpu, ram, ssd, os, color);
    }

}
