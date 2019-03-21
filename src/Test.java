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
		List<Apple> listeFiltreesGreen = filterApples(inventory,
				new ApplePredicate() {
					@Override
					public boolean test(Apple apple) {
						return Color.GREEN.equals(apple.getColor());
					}
				});

		List<Apple> listeFiltreesParPoid = filterApples(inventory,
				new ApplePredicate() {
					@Override
					public boolean test(Apple apple) {
						return apple.getWeight() > 26;
					}
				});
		System.out.println(
				"Après filtrage Vert : " + listeFiltreesGreen.toString());
		System.out.println(
				"Après filtrage > 26 g : " + listeFiltreesParPoid.toString());
	}

	public static List<Apple> filterApples(List<Apple> inventory,
			ApplePredicate p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}
