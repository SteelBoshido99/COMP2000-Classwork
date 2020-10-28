package Polymorphism;

public class MoveableClass {

    public void move() {
//begin of modifiable zone................T/94899aa1-c1ad-408e-90d4-b95afe0ab2e3
        System.out.println("Moving...");
//end of modifiable zone..................E/94899aa1-c1ad-408e-90d4-b95afe0ab2e3
    }

    public void move(int speedX, int speedY) {
//begin of modifiable zone................T/1c0664a8-f039-40e1-ad9e-32964c7f2549
        System.out.println("Moving x: " + speedX + " y: " + speedY);
//end of modifiable zone..................E/1c0664a8-f039-40e1-ad9e-32964c7f2549
    }

}
