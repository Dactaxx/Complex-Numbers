package complexnumbers;

public class ComplexNumber {
	public static void main(String[] args) {
		ComplexNumber a = new ComplexNumber(3, 4);
		ComplexNumber b = new ComplexNumber(5, 6);
		
		ComplexNumber c = ComplexNumber.divide(a, b);
		
		System.out.println(c.getReal() + " + " + c.getImaginary() + "i");
		
	}
	
	private double real, imaginary;

	public ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
		
	}
	
	public ComplexNumber() {
		
	}
	
	public double getReal() {
		return real;
		
	}
	
	public void setReal(double real) {
		this.real = real;
		
	}
	
	public double getImaginary() {
		return imaginary;
		
	}
	
	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
		
	}
	
	public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
		ComplexNumber c = new ComplexNumber();
		c.setReal(a.getReal() + b.getReal());
		c.setImaginary(a.getImaginary() + b.getImaginary());
		return c;
		
	}
	
	public static ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
		ComplexNumber c = new ComplexNumber();
		c.setReal(a.getReal() - b.getReal());
		c.setImaginary(a.getImaginary() - b.getImaginary());
		return c;
		
	}
	
	public static ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
		ComplexNumber c = new ComplexNumber();
		c.setReal((a.getReal() * b.getReal()) + -(a.getImaginary() * b.getImaginary()));
		c.setImaginary((a.getReal() * b.getImaginary()) + (a.getImaginary() * b.getReal()));
		return c;
		
	}
	
	public static ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
		ComplexNumber c = new ComplexNumber();
		ComplexNumber conjugate = new ComplexNumber(b.getReal(), -b.getImaginary());
		ComplexNumber a1 = ComplexNumber.multiply(a, conjugate);
		ComplexNumber b1 = ComplexNumber.multiply(b, conjugate);
		
		c.setReal((a1.getReal() / b1.getReal()));
		c.setImaginary((a1.getImaginary() / b1.getReal()));
		return c;
		
	}
	
}
