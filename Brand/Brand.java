package Brand;

public class Brand {
    public String name, color;
    public int year, horsePower;

    public String getName(){
        return name;
    }
    
    public int getyear(){
        return year;
    }
    
    public String getcolor(){
        return color;
    }

    public int gethorsePower(){
        return horsePower;
    }
    
    public void speak(){
        System.out.println("Unit of Auto class  - speak() Method");
    
    }
    public void speak(String Name){
        System.out.println("Unit of Auto class  - speak() Method");
        System.out.println("Brand: "+ Name);
    
}
}
