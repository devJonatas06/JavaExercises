package STUDYJAVA.Polymorphism.Movies;

public class Terror extends Movie{
    public Terror(String titleMovie) {
        super(titleMovie);
    }

    @Override
    public void watchTheMovie() {
        super.watchTheMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Dark And Tense ",
                "Atmosphere Supernatural ",
                " Many JumpScare ");

    }
}
