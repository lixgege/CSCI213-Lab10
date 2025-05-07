//
// Car.java
// @author Gege Li
// Date: 5/7/25
//
 
 public class Car extends Vehicle {
 	 
 	 // class instance variables
 	 private int doors;
 	 private int passengers;
 	 
 	 // this is the constructor of the class
 	 public Car(String aMake, String aModel, String aPlate, int numDoors, int numPassengers){
 	 	 super(aMake, aModel, aPlate);
 	 	 this.doors = numDoors;
 	 	 this.passengers = numPassengers;
 	 }
 	 
 	 // this is the getter for the doors
 	 public int getDoors(){
 	 	 return this.doors;
 	 }
 	 
 	 // this is the getter for the passengers
 	 public int getPassengers(){
 	 	 return this.passengers;
 	 }
 	 
 	 // this is the toString method for the class
 	 @Override
 	 public String toString(){
 	 	 String stringCar = String.format("%d-door %s %s with license %s.", this.doors,
 	 	 	 								super.getMake(), super.getModel(), super.getPlate());
 	 	 return stringCar;
 	 }
 	 
 	 // this is the equals method for the class
 	 public boolean equals(Object obj){
 	 	 if (!(obj instanceof Car)){
 	 	 	 return false;
 	 	 }
 	 	 Car other = (Car) obj;
 	 	 if (this.doors == other.getDoors()){
 	 	 	 if (this.passengers == other.getPassengers()){
 	 	 	 	 return super.equals(other);
 	 	 	 }
 	 	 }
 	 	 
 	 	 return false;
 	 }
 	 
 	 // this is a copy method for the class
 	 public Car copy(){
 	 	 Car aCopy = new Car(super.getMake(), super.getModel(), super.getPlate(),
 	 	 	 				  this.doors, this.passengers);
 	 	 return aCopy;
 	 }
 	 
 	 
 	 public static void main(String[] args){
 	 	 Car c1 = new Car("Kia", "Soul", "TPR-3392", 4, 5);
 	 	 System.out.print(c1);
 	 }
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 }