package oops;

class SearchService
{
	public void search(String name)
	{
		System.out.println("serching by name : "+name);
	}
	public void search(int id)
	{
		System.out.println("serching by id : "+id);
	}
	public void search(String name,String city)
	{
		System.out.println("serching by name and city : "+name +" and "+city);
	}
	
	
}

public class ExampleMethodOverLoading {

	public static void main(String[] args) {
		SearchService s = new SearchService();
		s.search("T-Shirt");
		s.search(1000);
		s.search("Tab","Delhi");
	}

}
