package t3_constructor;

public class Test4_2 {
	String modle;	
	String color = "블랙";
	int speed;
	
	Test4_2(String modle) { // #1
		this(modle, "흰색", 250);
	}
	
	Test4_2(String modle, String color) { // #2
		this(modle, color, 250);
	}
	
	Test4_2(String modle, String color, int speed) { // #3
		this.modle = modle;
		this.color = color;
		this.speed = speed;
	}

}