package Vehicle;

public class Vehicle {
    //attributes
    public String model = "Toyota GT86", headLight, on, off, wiper, blinker, left, right;
    public int speed, light, steer, horsePower, year = 2021, gas, gear, gearStatus;
    public int fuelLeft = gas;
    public double travelDistance, milage;
    public boolean engineStatus, gasStatus, lightStatus, wiperStatus, lblinkerStatus, rblinkerStatus, steerStatus; // true or false
    
    //Engine Start/Stop
    public void startEngine(){
        engineStatus = true;
        System.out.println("Engine is Starting!!!");
    }
    public void shutEngine(){
        engineStatus = false;
        System.out.println("Engine is Stopping!!!");
    }
    //Engine Statusa
    public boolean engineStatus(){
        return this.engineStatus;
    }
    // drive, neutral, reverse
    public void gear(){
    if(this.gear == 1) {
            System.out.println("You're on Drive");
        }else if(this.gear == 2){
            System.out.println("You're on Neutral");
        }else if(this.gear == 3){
            System.out.println("You're on reverse");
        }
    }
    //Gas and travelDistance
    public void travelDistance(){
        System.out.println(travelDistance);
    }
    // travelDistance, once na achieved travelDistance
    public double fuelNeeded(){
        return travelDistance / milage;
    }
    // add ka dito nung depending sa current speed ng user magbabawas sa fuel left function
    
    public double fuelLeft(){
            return 50 - fuelNeeded();
    }
    //Gas status
    public boolean gasStatus(){
        //if statement
        if(fuelLeft() >= 2 ) {
            System.out.println("You have enough fuel");
            return true;
        }else{
            System.out.println("You don't have enough fuel");
            return false;
        }
    }
    public void refillGas(){
        if(fuelLeft() >= 2 ){
            System.out.println("You don't have to refill");
        }else if(fuelLeft() < 2){
            System.out.println("You refilled with gas , back to full tank");
            gas++;
        }
    }
    
    // steering (Left or Right) ; Steer Status
    
    public void steer(){
    if(steer == 1){
        System.out.println("Steering to the left");
        steerStatus = true;
    }else if (steer == 2){
        System.out.println("Steering to the Right");
        steerStatus = false;
    }
    }
    public boolean steerStatus(){
        //if statement
        if(steer == 1 ) {
            System.out.println("Steer Status of the car: To the Left");
            return true;
        }else{
            System.out.println("Steer Status of the car: To the Right");
            return false;
        }
    }
    // headlight ON and OFF ; headlight Status
    public void light(){
        if(light == 1){
                System.out.println("Your Headlight is On.");
        }else if(light == 2){
                System.out.println("Your Headlight is Off.");
        }
    }
    public boolean lightStatus(){
        //if statement
        if(light == 1 ) {
            System.out.println("Headlight Status of the car: ON");
            return true;
        }else{
            System.out.println("Headlight Status of the car: OFF");
            return false;
        }
    }
    
    public void speed(){
        if(speed <= 100 ){
            milage = 8.4;
            System.out.println("You're behind the Speed Limit");
        }else if(speed > 100){
            milage = 4.7;
            System.out.println("You're breaking the Speed Limit");
        }
    }
    
    
    // wiper on and off
    public void wiperOn(){
        wiperStatus = true;
            System.out.println("Your Wiper is On.");
        }
    public void wiperOff(){
        wiperStatus = false;
            System.out.println("Your Wiper is Off.");
        }
    
    // wiperStatus
    public boolean wiperStatus(){
        return wiperStatus;
        }
    
    // Left blinker and Right blinker 
    public void leftBlinkerOn(){
        lblinkerStatus = true;
            System.out.println("Your Left Blinker is ON");
    }
    public void leftBlinkerOff(){
        lblinkerStatus = false;
            System.out.println("Your Left Blinker is OFF");
    }
    public boolean lblinkerStatus(){
        return lblinkerStatus;
    }
    
    public void rightBlinkerOn(){
        rblinkerStatus = true;
            System.out.println("Your Right Blinker is On");
    }
    public void rightBlinkerOff(){
        rblinkerStatus = false;
            System.out.println("Your Right Blinker is Off");
    }
    public boolean rblinkerStatus(){
        return rblinkerStatus;
    }
}

