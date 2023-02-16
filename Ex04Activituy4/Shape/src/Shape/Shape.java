package Shape;

public abstract class Shape {
  int value ;
  abstract void calculateAre(int value);

public int getValue() {
	return value;
}

public void setValue(int value) {
	this.value = value;
}
}
