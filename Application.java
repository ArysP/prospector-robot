import kareltherobot.*;

public class Application implements Directions {

 public static void main(String [] args) {

     Prospector Paul = new Prospector(1, 1, East, 0);
     Prospector Pauline = new Prospector(2, 2, West, 0);

Paul.findNextDirection();
Pauline.findNextDirection();
 } // end-main

 static {
    World.setDelay(50);
    World.readWorld("ifbeepers.kwld");
    World.setVisible(true);
    World.showSpeedControl(true);
} // end-static

} // end-class


