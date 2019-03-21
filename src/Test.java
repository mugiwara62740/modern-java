import java.util.ArrayList;
import java.util.Arrays;
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
		System.out.println("Après filtrage Rouge : " + redApples.toString());
		System.out.println(
				"Après filtrage Nombre Pair: " + evenNumbers.toString());
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
