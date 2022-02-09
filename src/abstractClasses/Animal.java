package abstractClasses;

abstract class Animal {
	
		abstract void move();
		abstract void eat();

		// concrete method
		void label() {
			System.out.println("Animal's data:");
		}

}