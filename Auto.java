import Brand.Brand;
public class Auto{
    public static void main(String[] args){
        Brand BMW = new Brand();
        Brand Aston = new Brand();
        Brand Audi = new Brand();
        Brand Merc = new Brand();

        BMW.name = "M4";
        BMW.year = 2022;
        BMW.color = "White";
        BMW.horsePower = 543;
        Aston.name = "Vantage";
        Aston.year = 2023;
        Aston.color = "F1 Green";
        Aston.horsePower = 528;
        Audi.name = "Rs6";
        Audi.year = 2021;
        Audi.color = "Black";
        Audi.horsePower = 591;
        Merc.name = "Gtr";
        Merc.year = 2018;
        Merc.color = "GreenHell";
        Merc.horsePower = 585;
        
        System.out.println("\n");
        System.out.println(BMW.name);
        System.out.println(Aston.name);
        System.out.println(Audi.name);
        System.out.println(Merc.name );
        
        System.out.println("\n");
        //void without param
        BMW.speak();
        Aston.speak();
        Audi.speak();
        Merc.speak();
        
        System.out.println("\n");
        //void with param
        BMW.speak(BMW.name);
        Aston.speak(Aston.name);
        Audi.speak(Audi.name);
        Merc.speak(Merc.name);
        
        System.out.println("\n");
        System.out.println(" The First car is BMW: " + BMW.getName()); 
        System.out.println(" The First car is Year: " + BMW.year); 
        System.out.println(" The First car is Color: " + BMW.getcolor());
        System.out.println(" The First car HorsePower is: " + BMW.gethorsePower());  
        
        System.out.println("\n");
        System.out.println(" The Second car is Aston: " + Aston.getName()); 
        System.out.println(" The Second car is Year: " + Aston.year); 
        System.out.println(" The Second car is Color: " + Aston.getcolor());
        System.out.println(" The Second car HorsePower is: " + Aston.gethorsePower());  
        
        System.out.println("\n");
        System.out.println(" The Third car is Audi: " + Audi.getName()); 
        System.out.println(" The Third car is Year: " + Audi.year); 
        System.out.println(" The Third car is Color: " + Audi.getcolor());
        System.out.println(" The Third car HorsePower is: " + Audi.gethorsePower());
        
        System.out.println("\n");
        System.out.println(" The Fourth car is Merc: " + Merc.getName()); 
        System.out.println(" The Fourth car is Year: " + Merc.year); 
        System.out.println(" The Fourth car is Color: " + Merc.getcolor());
        System.out.println(" The Fourth car HorsePower is: " + Merc.gethorsePower());
    
    }
}