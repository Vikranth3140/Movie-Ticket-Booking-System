import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private String role; // New role attribute (e.g., "Admin" or "User")
    private List<Booking> bookingHistory;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = HashUtils.hashPassword(password); // Store hashed password
        this.role = role;
        this.bookingHistory = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public boolean authenticate(String password) {
        return this.password.equals(HashUtils.hashPassword(password));
    }

    public void addBooking(Booking booking) {
        bookingHistory.add(booking);
    }

    public List<Booking> getBookingHistory() {
        return bookingHistory;
    }

    public void viewBookingHistory() {
        if (bookingHistory.isEmpty()) {
            System.out.println(username + " has no booking history.");
        } else {
            System.out.println(username + "'s Booking History:");
            for (Booking booking : bookingHistory) {
                String status = booking.isCanceled() ? "(Canceled)" : "(Active)";
                System.out.println("Movie: " + booking.getShowtime().getMovie().getTitle() +
                        ", Showtime: " + booking.getShowtime().getTime() + " " + status);
            }
        }
    }
}