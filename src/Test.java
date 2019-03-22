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

		inventory.stream().filter(apple -> apple.getColor().equals(Color.BLUE))
				.findFirst().map(appleBlue -> {
					System.out.println(appleBlue.getColor().toString());
					return appleBlue.getColor();
				});
	}
}
