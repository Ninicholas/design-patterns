package estructurales.facade;

public class testFacade {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        System.out.println("----------------------------------");
        homeTheater.watchMovie();
        System.out.println("----------------------------------");
        homeTheater.endMovie();
        System.out.println("----------------------------------");
    }
}
