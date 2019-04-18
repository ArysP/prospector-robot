import kareltherobot.*;

public class Prospector extends Robot
{

 // the constructor . . .
 public Prospector(int street, int avenue, Direction direction, int beepers)
 {
  super(street, avenue, direction, beepers);
 } // end of constructor

 public void turnRight()
 {
  turnLeft();
  turnLeft();
  turnLeft();
 } // end of turnRight

 // fill this in
 public void findNextDirection() {
   if (anyBeepersInBeeperBag()) {
     pickBeeper();
   } else {
     faceSouth();
     }
 } // end of findNextDirection . . .

 // fill this in
 public void faceNorth() {
   if (facingSouth()) {
     turnLeft();
     turnLeft();
   } 
   if (facingWest()) {
     turnRight();
   }
   if (facingEast()) {
     turnLeft();
   }
   else {
     facingNorth();
   }
} // end-faceNorth

 // fill this in
 public void faceSouth() {
   if (facingNorth()) {
     turnLeft();
     turnLeft();
   } 
   if (facingWest()) {
     turnLeft();
   }
   if (facingEast()) {
     turnRight();
   }
   else {
     facingSouth();
   }
}
 }// end faceSouth

 // end of class
