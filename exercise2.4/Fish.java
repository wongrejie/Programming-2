package exercise24;

public class Fish {
	String Type,colour,blood;
	int finNum,lifespan,age,timeLeft;
	double weight,monthlyExp;
	
	
	// Create Setter Method
	  public void setFishType(String fishType) {
		  this.Type = fishType;
	  }
	  
	  public void setColour(String colour) {
		  this.colour = colour;
	  }
	  
	  public void setFinNum(int finNum) {
		  this.finNum = finNum;
	  }
	  
	  public void setWeight(double weight) {
		  this.weight = weight;
		
	  }
	  
	  public void setBlood(String blood) {
		  this.blood = blood;
	  }
		  
	  public void setLifespan(int lifespan) {
		  
		  this.lifespan = lifespan;
		  
		}
	  
	  public void setAge(int age) {
		  
		  this.age = age;
		  
		}
	  
	  public void setFoodExpenses(double monthlyExp) {
			
		  this.monthlyExp = monthlyExp;
	  }	
				
 
	  

	  // Create Getter Method
	  public Integer getFinNum() {
		  return this.finNum;
	  }
	  
	  public String getFishType() {
		  return this.Type;
	  }
	  
	  public String getColour() {
	 	  return this.colour;
 	  }
	  
	  public double getWeight() {
		  return this.weight;
	  }
	  
	  public String getBlood() {
		  return this.blood;
	  }
	  
	  public int getLifespan() {
		  return this.lifespan;
	  }
	  
	  public int getAge() {
		  return this.age;
	  }
	  
	  public double getFoodExpenses() {
		  return this.monthlyExp;
	  }
	  
	  
	public int getTimeLeft() {
		
		this.timeLeft=this.lifespan-this.age;
		return this.timeLeft;
	}
	 
}
