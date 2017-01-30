package hackerrank;

class MyBook extends Book {
	
	int price;
	MyBook (String title, String author, int price)
		{
		super(title, author);
		this.price = price ;
		}
	
	public void setPrice (int price){
		this.price = price;
	}
	
	public int getPrice(){
		if (price >0){
			return price;
		}
		else {
			System.out.println("Price must be positive");
			System.exit(0);
			return 0;
		}
	}

	@Override
	void display() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
		
	}
}
