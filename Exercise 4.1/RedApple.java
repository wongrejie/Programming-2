package fruitInheritence;

public class RedApple extends Apple { //sub class
	private int quantity;
	
private String taste;
	
	public RedApple(String n,String t,double w,double p,int q) {
		super(n, w, p);
		taste=t;
		quantity=q;
		
		
	}	
	
	public String getTaste() {
		return this.taste;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public double getWeightPerApple() {
		return super.weight/this.quantity;
	}
	
	public String toString() {
	        return super.toString()+"\n"+"Taste = "+taste+"\n"+"Quantity = "+quantity+"\n"+"Average Weight per Apple (kg) = "+getWeightPerApple();
	        
	     }

}
