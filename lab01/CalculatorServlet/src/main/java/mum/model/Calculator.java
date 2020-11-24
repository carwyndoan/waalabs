package mum.model;

public class Calculator {
	private int add1;
	private int add2;
	private int sum;
	private int mult1;
	private int mult2;
	private int product;

	public int getAdd1() {
		return add1;
	}

	public int getAdd2() {
		return add2;
	}

	public int getSum() {
		return sum;
	}

	public int getMult1() {
		return mult1;
	}

	public int getMult2() {
		return mult2;
	}

	public int getProduct() {
		return product;
	}

	public void calSum(int add1, int add2){
		this.add1 = add1;
		this.add2 = add2;
		this.sum = add1 + add2;
	}

	public void calProduct(int mult1, int mult2){
		this.mult1 = mult1;
		this.mult2 = mult2;
		this.product = mult1 * mult2;
	}
}
