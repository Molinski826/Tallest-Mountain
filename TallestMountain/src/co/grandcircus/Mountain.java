package co.grandcircus;

public class Mountain implements iFormation {
    private int height;
    private String name;

    public Mountain(int height, String name) {
        this.height = height;
        this.name = name;
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

    @Override
    public String getInfo() {
        return "Mountain: " + name + ", Height: " + height + " meters";
    }
}
