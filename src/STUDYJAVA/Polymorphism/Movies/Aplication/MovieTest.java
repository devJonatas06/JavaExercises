package STUDYJAVA.Polymorphism.Movies.Aplication;

import STUDYJAVA.Polymorphism.Movies.Movie;

import java.util.Scanner;

public class MovieTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Enter Type (D for Drama , T for Terror, S for Suspense");
            String type = s.nextLine();
            if("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter name of Movie: ");
            String titleMovie = s.nextLine();
            Movie movie = Movie.getMovie(type, titleMovie);
            movie.watchTheMovie();
        }
    }
}
