package Array;

class Product
{
	int id;
	String name;
	float price;
	public Product(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public void show()
	{
		System.out.println("Product Id : "+id);
		System.out.println("Product Name : "+name);
		System.out.println("Product Price : "+price);
		System.out.println();
	}
}

public class DemoArray {

	public static void main(String[] args) {
		//Product p = new Product(101,"TV",78000);
		//p.show();
		Product p[] =new Product[4];
		p[0] = new Product(101,"TV",78000);
		p[1] = new Product(102,"Watch",780);
		p[2] = new Product(103,"Laptop",55000);
		p[3] = new Product(104,"tab",65000);
		
		/*for(int i=0; i<=p.length;i++)
		{
			p[i].show();
		}*/
		
		for(Product pr : p)// for each row
		{
			pr.show();
		}
	}

}
