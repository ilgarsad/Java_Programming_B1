package day33_a_static;

public class C14_TrafficLight {

    private String color;

    public C14_TrafficLight(String color){
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        switch (color.toLowerCase()){
            case "red":
            case "yellow":
            case "green":
                this.color = color;
        }
    }
}