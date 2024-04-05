package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HotelReviewSystem {
    private List<Hotel> hotels;

    public HotelReviewSystem() {
        this.hotels = new ArrayList<>();
    }

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void sortHotelsByRating() {
        Collections.sort(hotels, Comparator.comparingDouble(Hotel::getAverageRating).reversed());
    }
}
