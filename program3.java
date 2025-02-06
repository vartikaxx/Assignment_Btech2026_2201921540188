class TrafficLight{
    String colour;
    int duration;

    TrafficLight(String colour, int duration){
        this.colour = colour;
        this.duration = duration;
    }

    public void changeColour(String c){
        colour = c;
    }

    public boolean isGreen(){
        return colour.equals("green");
    }

    public boolean isRed(){
        return colour.equals("red");
    }
}

public class program3 {
    public static void main(String[] args) {
        TrafficLight tl = new TrafficLight("red", 30);
        
        System.out.println("The light is Red?" + tl.isRed());
        System.out.println("The light is Green?" + tl.isGreen());

        tl.changeColour("green");

        System.out.println("The light is Red?" + tl.isRed());
        System.out.println("The light is Green?" + tl.isGreen());
    }
}
