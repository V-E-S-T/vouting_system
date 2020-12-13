package voting.system.model;

public class Meal {

    private Integer id;
    private String description;
    private Integer price;
    private Integer restaurantId;

    public Meal(String description, Integer price, Integer restaurantId) {
        this.description = description;
        this.price = price;
        this.restaurantId = restaurantId;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
