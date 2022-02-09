package dynamicPolymorphism;

class TestBirdDynamic {

	public static void main(String[] args) {
		
		Animal myAnimal = new Animal();
		myAnimal.eat();

		Bird myBird = new Bird();
		myBird.eat();

	}

}
