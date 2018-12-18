package ch.fhnw.mrs;

import ch.fhnw.Student;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for MovieRental.
 */
public class RentalTest {
    private MovieRental rental;
    
    @Before
    public void setup() {
        rental = new MovieRental("MovieZone");
        rental.addMovie("Fast and Furious");
        rental.addMovie("Nusssknacker");
        rental.addMovie("Herr der Ringe");
        rental.addMovie("Eternal sunshine of the spotless mind");       
    }
    
    @After
    public void tearDown() {
        rental = null;
    }
    
    @Test
    public void testCorrectReturnPrice() {
    // TODO: Implement
    }

    @Test
    public void testDelayedReturnPrice() {
        // TODO: Implement
    }

    @Test
    public void testMaximalRentalsReached() {
        // TODO: Implement
    }

    @Test
    public void testMovieAlreadyRented() {
        // TODO: Implement
    }

}
