import Vehicle.Vehicle;
import java.util.ArrayList; 
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args){
        Vehicle car = new Vehicle();
        ArrayList<String> gear = new ArrayList<String>();
            gear.add("");
            gear.add("Drive");
            gear.add("Neutral");
            gear.add("Reverse");
            
            ArrayList<String> Functions = new ArrayList<String>();
            Functions.add("Engine Start/Stop with Status");
            Functions.add("Gear with Status");
            Functions.add("Gas and Travel Distance");
            Functions.add("fuelLeft and fuelNeeded with Status");
            Functions.add("Steering with Status");
            Functions.add("Headlight with Status");
            Functions.add("Wiper with Status");
            Functions.add("Blinker with Status");
          
          System.out.println("This car is: " + car.model + " year " + car.year);
          
            System.out.println("\n This are the Functions: " + Functions);
          
          System.out.println("\n:Engine Start/Stop Function with Status:\n");
        car.startEngine();
          System.out.println("Status of Engine: " + car.engineStatus());
          
          System.out.println("\n:Gear selector function with Status:\n");
          System.out.println("Gear: 1 = Drive, 2 = Neutral, 3 = Reverse \n");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
          System.out.println("Enter what gear: ");
             car.gear = myObj.nextInt();  // Read user input
              car.gear();
        
          System.out.println("Status of Gear: " + gear.get(car.gear) + "\n");
          
          System.out.println("\n:Speed Function with Speed Limit:\n");
          Scanner myObj4 = new Scanner(System.in);
            System.out.println("Enter your Current Speed in KM/H: ");
              car.speed = myObj4.nextInt();
                car.speed();
          
          System.out.println("\n:Distance travel and Fuel Status Function:\n");
          System.out.println("note: Your car has 50 liters tank and average km/l of depending to your speed\n");
        Scanner newObj = new Scanner(System.in);  // Create a Scanner object
          System.out.println("Enter the Travel Distance in km: ");
            car.travelDistance = newObj.nextInt();  // Read user input
        
        System.out.println("Fuel needed when you travel "+ car.travelDistance+ "km at the speed of: " + car.speed +": " + car.fuelNeeded() + "liters");
        System.out.println("Fuel left when you travel "+ car.travelDistance+ "km at the speed of: "  + car.speed +": " + car.fuelLeft() + "liters\n");
        System.out.println("Status of Gas: " + car.gasStatus());
        System.out.println("\n:Refill function System:\n");
        car.refillGas();
        System.out.println("\n");
        
        System.out.println("\n:Steering 1 = Left, 2 = Right Function with Status:\n");
        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
          System.out.println("Steer: 1 = Left, 2 = Right :: ");
             car.steer = myObj2.nextInt();  // Read user input
              car.steer();
              car.steerStatus();
          
          
          System.out.println("\n:Headlight 1 = On, 2 = OFF Function with Status:\n");
        Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
          System.out.println("Headlight: 1 = On, 2 = OFF :: ");
             car.light = myObj3.nextInt();  // Read user input
              car.light();
              car.lightStatus();
            
          System.out.println("\n:Wiper On/Off Function with Status:\n");
        car.wiperOff();
        System.out.println("Wiper Status: " + car.wiperStatus());
        
          System.out.println("\n:Blinker On/Off Function with Status:\n");
        car.leftBlinkerOn();
        System.out.println("Blinker Status: " + car.lblinkerStatus() + "\n");
        
        car.leftBlinkerOff();
        System.out.println("Blinker Status: " + car.lblinkerStatus() + "\n");
        
        car.shutEngine();
        System.out.println("Status of Engine: " + car.engineStatus());
        System.out.println("\n\n");
    }
}

