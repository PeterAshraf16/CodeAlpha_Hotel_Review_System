package Main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HotelReviewSystem reviewSystem = new HotelReviewSystem();
        Scanner scanner = new Scanner(System.in);

        // Adding some hotels
        Hotel hotel1 = new Hotel("Hotel A");
        Hotel hotel2 = new Hotel("Hotel B");
        reviewSystem.addHotel(hotel1);
        reviewSystem.addHotel(hotel2);

        // Adding reviews
        hotel1.addReview(new Review("User1", 4, "Nice place!"));
        hotel1.addReview(new Review("User2", 5, "Great experience!"));
        hotel2.addReview(new Review("User3", 3, "Decent hotel."));

        // Allow user to leave a new review
        System.out.println("Enter hotel name to leave a review:");
        String hotelName = scanner.nextLine();
        System.out.println("Enter your username:");
        String username = scanner.nextLine();
        System.out.println("Enter your rating (1-5):");
        int rating = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.println("Enter your comment:");
        String comment = scanner.nextLine();

        for (Hotel hotel : reviewSystem.getHotels()) {
            if (hotel.getName().equalsIgnoreCase(hotelName)) {
                hotel.addReview(new Review(username, rating, comment));
            }
        }

        // Sorting hotels by rating
        reviewSystem.sortHotelsByRating();

        // Printing sorted hotels
        for (Hotel hotel : reviewSystem.getHotels()) {
            System.out.println("Hotel: " + hotel.getName());
            System.out.println("Average Rating: " + hotel.getAverageRating());
            System.out.println("Reviews:");
            for (Review review : hotel.getReviews()) {
                System.out.println(review);
            }
            System.out.println();
        }

        scanner.close();
    }
}
