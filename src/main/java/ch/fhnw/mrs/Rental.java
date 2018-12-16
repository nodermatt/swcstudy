package ch.fhnw.mrs;


import java.time.LocalDate;

public class Rental {
    private LocalDate rentedDate;
    private LocalDate returnDate;
    private String movie;

    public void setRentedDate(LocalDate rentedDate, String movie) {
        this.rentedDate = rentedDate;
        this.movie = movie;
    }
    public String getMovie() {
        return movie;
    }

    public LocalDate getRentedDate() {
        return rentedDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Rental(LocalDate rentedDate, String movie) {
        this.movie = movie;
        this.rentedDate = rentedDate;
    }
}
