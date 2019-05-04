package ca.demo.salestool;

public class SalesData {
	private int data[] = {-1, 0, 4, 42, 84};
	private int date2[] = {3, 6, 7};
	//System.out.println("마스터");
	public void display() {
		System.out.println("SalesData클라스 수정했다고요 display메서드");	
		for(int i:data) {
			System.out.println("Next Value : "+data[i]);
		}
		System.out.println("branch exp");
		System.out.println("branch exp2");
		System.out.println("branch exp3");
		System.out.println("branch master");
		System.out.println("branch master2");
		System.out.println("branch master3");
	}
}
