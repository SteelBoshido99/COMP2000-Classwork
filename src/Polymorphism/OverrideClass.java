package Polymorphism;

public class OverrideClass extends MoveableClass {

    public void move() {
//begin of modifiable zone(JavaCode)......C/b76f709a-6c7e-4304-aa7d-d8ff2734a2ab
        super.move();
        System.out.println("Overriding move...");
//end of modifiable zone(JavaCode)........E/b76f709a-6c7e-4304-aa7d-d8ff2734a2ab
    }

}
