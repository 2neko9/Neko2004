package Genre;

public class Genre {
    public String title, singer;
    public int year;

    public String getTitle(){
        return title;
    }
    
    public int getyear(){
        return year;
    }
    public  String getsinger(){
        return singer;

        }
    public void speak(){
        System.out.println("Speaking from Genre class: ");
    }
    public void speak(String name){
        System.out.println("Speaking from Genre class: ");
        System.out.println("Title: " + name);
    }
}