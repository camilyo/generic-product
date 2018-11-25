

public class ProductMain {

	public static void main(String[] args) {
		
		//Assigning values to my Product method
		Product p1 = new Product("123", " Carrot Cake ", 15);
		Product p2 = new Product("234", " Butter Cake ", 21);
		Product p3 = new Product("345", " Sponge Cake ", 17);
		Product p4 = new Product("456", " Pound Cake ", 11);
		
		
		
		//creating the heading of my product table
		System.out.println("Code" + " \t " + "Description" + " \t " + "Price");
		
		//calling my method through the implicit parameter object
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		System.out.println();
		
		//Counting the number of products
		System.out.println("Number of products: " + p1.getCount());
	}		

}
