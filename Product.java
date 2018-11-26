import java.text.NumberFormat;
//Designing and coding a class for a bakery

public class Product {
	
	//defining the fields - state of each product object
	private String code;
	private String description;
	private double price;
	private static int count = 0;
	
	//Constructors - initializing the state of the created objects
	public Product(String code, String description, double price) {
		setCode(code);
		setDescription(description);
		setPrice(price);
		count++;
	}
	
	//methods
	public void setCode(String code) {
		this.code = code;
	}
	//return the code of the product
	public String getCode() {
		return code;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setPrice(double price) {
		this.price = price;
		
	}
	
	public double getPrice() {
		return price;
	}
	

	public String getPriceFormatted() 
	{
	    String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
	    return formattedPrice;
	}
	
	public void setCount(int count) {
		count++;
	}
	
	public int getCount() {
		 return count;
	 }
	
	public String toString() {
        return getCode() + " \t " + getDescription() + " \t " + getPriceFormatted();
    }
	
}

