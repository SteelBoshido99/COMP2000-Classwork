package Aggrigation;


public class MotorBike {
    public Engine engine;

    public Colour colour;

    public MotorBike() {
//begin of modifiable zone................T/18cb9005-84bf-4898-88a0-6da80ade6933
System.out.println(" ** Creating Motor Bike **");

engine = new Engine();
        System.out.println("Creating Engine: " + engine);

//end of modifiable zone..................E/18cb9005-84bf-4898-88a0-6da80ade6933
//begin of modifiable zone(JavaCode)......C/afea88ca-dcc2-4d9b-902f-b7717ec9bcc4

//end of modifiable zone(JavaCode)........E/afea88ca-dcc2-4d9b-902f-b7717ec9bcc4
    }

    public Colour getColour() {
        return this.colour;
    }

    public void setColour(Colour value){
        this.colour = value;
    }
}
