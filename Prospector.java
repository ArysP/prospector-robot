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
   faceSouth();


 } // end of findNextDirection . . .

 // fill this in
 public void faceNorth() {

    } // end-faceNorth

 // fill this in
 public void faceSouth() {
   if (facingSouth());{
   return
   } else {
     turnLeft());
}
 }// end faceSouth

} // end of class
