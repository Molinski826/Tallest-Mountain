package co.grandcircus;

public class Mesa implements iFormation {
    private int height;
    private String name;
    private double area;

    public Mesa(int height, String name, double area) {
        this.height = height;
        this.name = name;
        this.area = area;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String getInfo() {
        return "Mesa: " + name + ", Height: " + height + " feet, Area: " + area + " square feet";
    }
}
