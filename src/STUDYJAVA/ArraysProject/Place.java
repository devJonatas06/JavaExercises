package STUDYJAVA.ArraysProject;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Place {
    private String name;
    private int distance;

    public Place(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}
class travelItinerary{
    private static LinkedList<Place>places = new LinkedList<>();
    public static void main(String [] args){
        addPlace(new Place("Brasil", 0));
        addPlace(new Place("Eua",6800));
        addPlace(new Place("Suica",9200));
        addPlace(new Place("Canada", 8000));
        addPlace(new Place("Autralia",15000));
        addPlace(new Place("Alemanha", 9500));
        addPlace(new Place("Portugal", 7200));

        navigate();

    }
    private static void addPlace(Place newPlace){
        ListIterator<Place>iterator = places.listIterator();
        while (iterator.hasNext()){
            Place current = iterator.next();
            if (current.getName().equalsIgnoreCase(newPlace.getName())) {
                System.out.println(newPlace.getName() + " ja esta na lista. ");
                return;
            }
            if (newPlace.getDistance() < current.getDistance()) {
                iterator.previous();
                iterator.add(newPlace);
                return;
            }
        }
        iterator.add(newPlace);
    }
    private static void navigate() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        ListIterator<Place> iterator = places.listIterator();
        if (!iterator.hasNext()) {
            System.out.println("Nenhum local na lista. ");
            return;
        }
        System.out.println("Navegando pelo itinerario...");
        printMenu();
        System.out.println("Local Atual: " + iterator.next().getName());

        while (running){
            String command = scanner.nextLine().trim().toUpperCase();
            switch (command) {
                case "F":
                    if (iterator.hasNext()) {
                        System.out.println("Indo para: "  + iterator.next().getName());
                    } else {
                        System.out.println("Voce ja esta no ultimo local. ");
                    }
                    break;
                case "B":
                    if (iterator.hasPrevious()) {
                        System.out.println("Voltando para: " + iterator.previous().getName());

                    } else {
                        System.out.println("Voce ja esta no primeiro local");
                    }
                    break;

                case "L":
                    listPlaces();
                    break;

                case "M":
                    printMenu();
                    break;
                case "Q":
                    running = false;
                default:
                    printMenu();

            }

        }
        scanner.close();
    }
    private static void  listPlaces(){
        System.out.println("Locais registrados no itinerario: ");
        for (Place place : places){
            System.out.println(place.getName() + " - "+ place.getDistance() + " KM");
        }
    }
    private static void printMenu(){
        System.out.println("""
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """);
    }
}
