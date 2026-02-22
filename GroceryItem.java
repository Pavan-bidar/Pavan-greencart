package greenCartsystem;

import java.sql.Date;

public class GroceryItem {
	private int id;
    private String name;
    private String category;
    private int quantity;
    private Date expiryDate;
    private double price;

    public GroceryItem(String name, String category, int quantity, Date expiryDate, double price) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.price = price;
    }

    public GroceryItem(int id, String name, String category, int quantity, Date expiryDate, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public int getQuantity() { return quantity; }
    public Date getExpiryDate() { return expiryDate; }
    public double getPrice() { return price; }

}
