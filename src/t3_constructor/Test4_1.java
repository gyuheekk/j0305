package t3_constructor;

public class Test4_1 {
	String modle;	
	String color = "블랙";
	int speed;
	
	Test4_1(String modle) { // #1
		this.modle = modle;
		this.color = "흰색";
		this.speed = 250;
	}
	
	Test4_1(String modle, String color) { // #2
		this.modle = modle;
		this.color = color;
		this.speed = 250;
	}
	
	Test4_1(String modle, String color, int speed) { // #3
		this.modle = modle;
		this.color = color;
		this.speed = speed;
	}

}