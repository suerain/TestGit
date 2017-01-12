package first;
/*
 * Person Class
*/
public class Person {
	int[] data = { 0, 4, 23 };
	int sum = 0;

	public void display() {
		System.out.println("Data: ");
		for (int i = 0; i < data.length; i++) {
			System.out.println("Next value: " + data[i]);
			sum += data[i];
		}
		System.out.println("Sum is: " + sum);
	}

}
