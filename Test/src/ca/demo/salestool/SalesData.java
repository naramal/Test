package ca.demo.salestool;

public class SalesData {
	private int data[] = {-1, 0, 4, 42, 84};
	
	public void display() {
		System.out.println("SalesData클라스 수정했다고요 display메서드");	
		for(int i:data) {
			System.out.println("Next Value: "+data[i]);
		}
	}
}