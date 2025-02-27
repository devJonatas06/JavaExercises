package STUDYJAVA.Polymorphism.Movies;

public class Suspense extends Movie{
    public Suspense(String titleMovie) {
        super(titleMovie);
    }

    @Override
    public void watchTheMovie() {
        super.watchTheMovie();
        System.out.printf(".. %s%n".repeat(3),
               " Constant mystery and tension",
               " Unexpected twists and revelations",
                "Protagonist in danger or solving a mystery");



    }
}

