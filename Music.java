import Genre.Genre;
public class Music{
    public static void main(String[] args){
        Genre Opm = new Genre();
        Genre Pop = new Genre();
        Genre Rock = new Genre();
        
        Opm.title = "ikaw";
        Pop.title = "Hey";
        Rock.title = "Without me";
        Opm.year = 2004;
        Pop.year = 2002;
        Rock.year = 2003;
        Opm.singer = "Xiao";
        Pop.singer = "Xing";
        Rock.singer = "Xeng";

        // title
        System.out.println("This is the Opm title: " + Opm.getTitle());
        System.out.println("This is the Pop title: " + Pop.getTitle());
        System.out.println("This is the Rock title: " + Rock.getTitle() + "\n");
        
        //singer
        System.out.println("This is the Opm singer: " + Opm.getsinger());
        System.out.println("This is the Pop singer: " + Pop.getsinger());
        System.out.println("This is the Rock singer: " + Rock.getsinger() + "\n");

        //year
        System.out.println("This is the Opm year: " + Opm.getyear());
        System.out.println("This is the Pop year: " + Pop.getyear());
        System.out.println("This is the Rock year: " + Rock.getyear() + "\n");
        
        //With parameter
        Opm.speak();
        Pop.speak();
        Rock.speak();
        
        System.out.println("\n");
        
        //Without parameter
        Opm.speak(Opm.title);
        Pop.speak(Pop.title);
        Rock.speak(Rock.title);
        
    }
}
