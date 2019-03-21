import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String... args) {
		Apple a = new Apple(33, Color.GREEN);
		Apple b = new Apple(12, Color.RED);
		Apple c = new Apple(14, Color.GREEN);
		Apple d = new Apple(25, Color.RED);
		Apple e = new Apple(144, Color.GREEN);

		List<Apple> inventory = new ArrayList<Apple>(
				Arrays.asList(a, b, c, d, e));
		System.out.println("Avant filtrage : " + inventory.toString());
		List<Apple> listeFiltreesGreen = filterApplesByColor(inventory,
				Color.GREEN);
		List<Apple> listeFiltreesRed = filterApplesByColor(inventory,
				Color.RED);
		List<Apple> listeFiltreesParPoid = filterApplesByWeight(inventory, 26);
		System.out.println(
				"Après filtrage Vert : " + listeFiltreesGreen.toString());
		System.out.println(
				"Après filtrage Rouge : " + listeFiltreesRed.toString());
		System.out.println(
				"Après filtrage > 26 g : " + listeFiltreesParPoid.toString());
	}

	public static List<Apple> filterApplesByColor(List<Apple> inventory,
			Color color) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (color.equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}

	public static List<Apple> filterApplesByWeight(List<Apple> inventory,
			int weight) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (apple.getWeight() > weight) {
				result.add(apple);
			}
		}
		return result;
	}
}
