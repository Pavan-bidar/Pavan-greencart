package greenCartsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class GroceryDAO {
	 public void addItem(GroceryItem item) {
	        String sql = "INSERT INTO grocery_items(name, category, quantity, expiry_date, price) VALUES(?,?,?,?,?)";

	        try (Connection con = DBConnection.getConnection();
	             PreparedStatement ps = con.prepareStatement(sql)) {

	            ps.setString(1, item.getName());
	            ps.setString(2, item.getCategory());
	            ps.setInt(3, item.getQuantity());
	            ps.setDate(4, item.getExpiryDate());
	            ps.setDouble(5, item.getPrice());

	            ps.executeUpdate();
	            System.out.println("✅ Item added successfully!");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void viewAllItems() {
	        String sql = "SELECT * FROM grocery_items";

	        try (Connection con = DBConnection.getConnection();
	             Statement stmt = con.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {

	            while (rs.next()) {
	                System.out.println(
	                        rs.getInt("id") + " | " +
	                        rs.getString("name") + " | " +
	                        rs.getString("category") + " | Qty: " +
	                        rs.getInt("quantity") + " | Exp: " +
	                        rs.getDate("expiry_date") + " | ₹" +
	                        rs.getDouble("price")
	                );
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void viewExpiredItems() {
	        String sql = "SELECT * FROM grocery_items WHERE expiry_date < CURDATE()";

	        try (Connection con = DBConnection.getConnection();
	             Statement stmt = con.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {

	            System.out.println("⚠ Expired Items:");
	            while (rs.next()) {
	                System.out.println(rs.getString("name") + " expired on " + rs.getDate("expiry_date"));
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void searchByCategory(String category) {
	        String sql = "SELECT * FROM grocery_items WHERE category=?";

	        try (Connection con = DBConnection.getConnection();
	             PreparedStatement ps = con.prepareStatement(sql)) {

	            ps.setString(1, category);
	            ResultSet rs = ps.executeQuery();

	            while (rs.next()) {
	                System.out.println(rs.getString("name") + " | Qty: " + rs.getInt("quantity"));
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void updateQuantity(int id, int quantity) {
	        String sql = "UPDATE grocery_items SET quantity=? WHERE id=?";

	        try (Connection con = DBConnection.getConnection();
	             PreparedStatement ps = con.prepareStatement(sql)) {

	            ps.setInt(1, quantity);
	            ps.setInt(2, id);
	            ps.executeUpdate();
	            System.out.println("✏ Quantity updated!");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void deleteItem(int id) {
	        String sql = "DELETE FROM grocery_items WHERE id=?";

	        try (Connection con = DBConnection.getConnection();
	             PreparedStatement ps = con.prepareStatement(sql)) {

	            ps.setInt(1, id);
	            ps.executeUpdate();
	            System.out.println("🗑 Item deleted!");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void lowStockItems() {
	        String sql = "SELECT * FROM grocery_items WHERE quantity < 5";

	        try (Connection con = DBConnection.getConnection();
	             Statement stmt = con.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {

	            System.out.println("🔔 Low Stock Items:");
	            while (rs.next()) {
	                System.out.println(rs.getString("name") + " | Qty: " + rs.getInt("quantity"));
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
