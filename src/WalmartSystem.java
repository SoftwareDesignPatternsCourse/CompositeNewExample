import com.cart.model.Product;
import com.cart.model.Shipment;

public class WalmartSystem {

	
	public static void main(String[] args) {
		
		Shipment shipment = new Shipment();
		shipment.addItem(new Product(100, "pen" , 1 ));
		shipment.addItem(new Product(100, "eraser" , 2 ));
		shipment.addItem(new Product(100, "Book" , 1 ));
		Shipment refactoringBooks = new Shipment();
		refactoringBooks.addItem(new Product(100, "refactoring", 1));
		refactoringBooks.addItem(new Product(100, "clencode", 1));
		refactoringBooks.addItem(shipment);
		
		System.out.println("total weight: " + refactoringBooks.getWeight());
		
	}
	
}
