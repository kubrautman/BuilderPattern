
public class Car {
	private int age;
	private boolean climate;
	private boolean screen;
	private boolean abs;
	
	public static class Builder{
		public class abs {

		}
		private int age;
		private boolean climate =false;
		private boolean screen=false;
		private boolean abs=false;
		public Builder(int age) {
			this.age = age;

		}	
		public Builder climate(boolean b) {
			climate = b;
			return this;

		}	
		public Builder screen(boolean b) {
			screen = b;
			return this;

		}	
		public Builder abs(boolean b) {
			abs = b;
			return this;

		}
	    public Car build() {
	        return new Car(this);
	      }
	}

	private Car(Builder builder) {
		age= builder.age;
		climate= builder.climate;
		screen= builder.screen;
		abs= builder.abs;
		
		
	}
	
	 @Override
	public String toString() {
		return "Car [age=" + age + ", climate=" + climate + ", screen=" + screen + ", abs=" + abs + "]";
	}

	public static void main(String[] args) {
	    
		 Car car = new Car.Builder(20).abs(false).climate(true).build();
		 System.out.println(car.toString());
	    }
}
