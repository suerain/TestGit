package first;

public class Person {
	int[] data = { 0, 4, 23, 84 };
	int sum = 10;
	public void display() {
		
		System.out.println("Data: ");
		for (int i : data) {
			System.out.println("Next value: " + i);
			sum += i;
		}
		System.out.println("Sum is found to be: " + sum);
	}

}
