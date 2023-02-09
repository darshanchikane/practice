package Week4Day3.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Product {
	
	int id;
	String name;
	float price;
	
	

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}



	public static void main(String[] args) {
		
		List<Product> productlist = new ArrayList<Product>();
		
		productlist.add(new Product(1,"dell laptop",30000f));
		productlist.add(new Product(2,"apple laptop",100000f));
		productlist.add(new Product(3,"sony laptop",80000f));
		productlist.add(new Product(4,"hp laptop",57000f));
		productlist.add(new Product(5,"lenovo laptop",48000f));
		
	    List<Float> products = productlist.stream().filter(i->i.price>60000f).map(i->i.price).collect(Collectors.toList());

	    System.out.println("Products greater than price 60000 are : " + products);
	    
	    productlist.stream().filter(i->i.price==100000f).forEach(p->System.out.println(p.name));
	    
	    
	    Map<String, Float> listmap = productlist.stream().collect(Collectors.toMap(p->p.name, p->p.price));
	    System.out.println("List of all products and price : " + listmap);
	    
	}

}
