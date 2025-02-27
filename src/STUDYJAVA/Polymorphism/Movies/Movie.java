package STUDYJAVA.Polymorphism.Movies;
public class Movie {
    private String titleMovie;

    public Movie(String titleMovie) {
        this.titleMovie = titleMovie;
    }

    public void watchTheMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(titleMovie + " is a " + instanceType + " Film");
    }

    public static Movie getMovie(String type, String titleMovie){
        return switch (type.toUpperCase().charAt(0)){
            case 'D' -> new Drama(titleMovie);
            case 'S' -> new Suspense(titleMovie);
            case 'T' -> new Terror(titleMovie);
            default -> new Movie(titleMovie);
        };
    }
}