package staticPolymorphism;

class TestBirdStatic {

	public static void main(String[] args) {
		
		Bird myBird = new Bird();

		myBird.fly();
		myBird.fly(10000);
		myBird.fly("eagle", 10000);

	}

}
