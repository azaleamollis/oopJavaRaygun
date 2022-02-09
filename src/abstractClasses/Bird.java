package abstractClasses;

class Bird extends Animal {
		
		@Override
		void move() {
				 System.out.println("Moves by flying.");
		}
		
		@Override
		void eat() {
					System.out.println("Eats birdfood.");
		}	 

}
