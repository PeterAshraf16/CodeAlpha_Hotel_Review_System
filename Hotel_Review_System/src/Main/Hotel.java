package Main;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private List<Review> reviews;

    public Hotel(String name) {
        this.name = name;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public String getName() {
        return name;
    }

    public double getAverageRating() {
        if (reviews.isEmpty()) return 0;
        int sum = 0;
        for (Review review : reviews) {
            sum += review.getRating();
        }
        return (double) sum / reviews.size();
    }
}
