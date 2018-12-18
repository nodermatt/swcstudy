package ch.fhnw.mrs;

import java.time.LocalDate;

public class MovieRental {
    private Rental[] rentals;
    private String[] movies;
    private String name;

    public MovieRental(String name) {
        this.name = name;
        this.rentals = new Rental[4];
    }

    /**
     * Adds a movie to the list of rentals.
     * A customer may only rent a total of 4 movies at a time.
     * @param movie The movie that is going to be rented. A movie consists of a 4 digit year code and a maximum of 20 character
     * @throws IllegalStateException when a customer tries to rent more than 4 movies
     */
    public void addRental(String movie) throws IllegalStateException{
        for(int i = 0; i >= rentals.length; i++) {
            if(i == rentals.length) throw new IllegalStateException("Maximal amount of rentals.");
            if(rentals[i] == null) {
                Rental rental = new Rental(LocalDate.now(), movie);
                rentals[i] = rental;
                break;
            }
        }
    }

    /**
     * Checks if a movie is available for rental.
     * @param movie The movie to be looked up
     * @throws IllegalArgumentException if the movie is already rented
     * @return true if the movie is not rented yet. False if there is an entry in rentals for the movie
     */
    public boolean checkRental(String movie) {

    }

    /**
     * Returns the price for a movie that the customer rented.
     * Each day a movie is rented costs 2.-
     * If a movie is returned after its return date, a surcharge of 5.- is applied.
     * hint: Rentals uses LocalDate to save the rented date. The class java.util.time.LocalDate might have useful methods.
     * @param movie
     * @return the total cost for the rental
     */
    public double getPrice(String movie) {
        return 0.0;
    }
    
    /**
    * Add a movie to the rental databse
    */
    public void addMovie(String movie) {
    /*Implementation hidden*/
    }
}
