package ca.demo.salestool;

public class Main {
	public static void main(String[] args) {
		SalesData data = new SalesData();
		displayGreeting();
		data.display();
		
	}
	
	private static void displayGreeting() {
		System.out.println("안녕하세여");
		System.out.println("세일즈 데이터 에여");
		System.out.println("추가요");
	}
}