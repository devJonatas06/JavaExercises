package STUDYJAVA.Polymorphism.Movies;

public class Drama extends Movie{
    public Drama(String titleMovie) {
        super(titleMovie);
    }

    @Override
    public void watchTheMovie() {
        super.watchTheMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Deep and emotional character development",
                "Realistic and intense dialogues" ,
                "Focus on personal struggles and relationships");

    }
}
