
public class Apple {
	private Integer weight;
	private Color color;

	public Apple(int weight, Color color) {
		this.color = color;
		this.weight = weight;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Apple : { color : " + color.toString() + ", weight : " + weight
				+ "}";
	}

}