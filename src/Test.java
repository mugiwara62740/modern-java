import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	public static void main(String... args) {
		Apple a = new Apple(33, Color.GREEN);
		Apple b = new Apple(12, Color.RED);
		Apple c = new Apple(14, Color.GREEN);
		Apple d = new Apple(25, Color.RED);
		Apple e = new Apple(144, Color.GREEN);

		List<Apple> inventory = new ArrayList<Apple>(
				Arrays.asList(a, b, c, d, e));
		List<Integer> numbers = new ArrayList<Integer>(
				Arrays.asList(1, 12, 13, 1234, 122));
		System.out.println("Avant filtrage : " + inventory.toString());
		List<Apple> redApples = filter(inventory,
				(Apple apple) -> Color.RED.equals(apple.getColor()));
		List<Integer> evenNumbers = filter(numbers, (Integer i) -> i % 2 == 0);
		inventory.sort(new Comparator<Apple>() {
			public int compare(Apple a1, Apple a2) {
				return a1.getWeight().compareTo(a2.getWeight());
			}

		});

		numbers.sort((Integer a1, Integer a2) -> a1.compareTo(a2));
		System.out.println("Après filtrage Rouge : " + redApples.toString());
		System.out.println(
				"Après filtrage Nombre Pair: " + evenNumbers.toString());
		System.out.println("Après comparaison poids: " + inventory.toString());

		System.out.println("Après comparaison Numbers: " + numbers.toString());

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Hello world 1");
			}
		});
		t1.run();

		Thread t2 = new Thread(() -> System.out.println("Hello world 2"));
		t2.run();
	}

	public static <T> List<T> filter(List<T> inventory, Predicate<T> predicat) {
		List<T> result = new ArrayList<>();
		for (T item : inventory) {
			if (predicat.test(item)) {
				result.add(item);
			}
		}
		return result;
	}
}
