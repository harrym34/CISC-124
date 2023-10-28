package a3;
import java.lang.Math;


public final class Complex {
	
	private double a;
	private double b;
	
	/**
	 * Initializes this complex number to (0 + 0i).
	 */
	public Complex() {
		this.a = 0;
		this.b = 0;
	}
	
	/**
	 * Initializes this complex number so that it has the same real and imaginary 
	 * parts as another complex number.
	 * 
	 * <p>
	 * 
	 * @param other - the complex number to copy
	 */
	public Complex (Complex other) {
		this.a = other.a;
		this.b = other.b;
	}
	
	public Complex (double re, double im) {
		this.a = re;
		this.b = im;	
	}
	
	public static Complex real​(double re) {
		return new Complex(re, 0.0);
	}
	
	public static Complex imag​(double im) {
		return new Complex(0.0, im);
	}
		
	// Getters and setters
	public double re() {
		return this.a;
	}
	
	public double im() {
		return this.b;
	}
	
	public void re​(double val) {
		this.a = val;
	}
	

	public void im​(double val) {
		this.b = val;
	}
	
	public Complex add​(Complex c) {
	    // Calculate the real and imaginary components of the sum
		double newA = (this.a + c.a);
		double newB = (this.b + c.b);
		
		// Return a new Complex object of the sum
		return new Complex(newA, newB);
	}
	
	/**
	 * Multiplies this complex number with another complex number 
	 * to obtain a new complex number. 
	 * 
	 * <p>
	 * 
	 * @param c - the complex number to multiply to this complex number
	 * @return a - new complex number
	 */
	public Complex multiply​(Complex c) {
		double newA = (this.a * c.a) - (this.b * c.b);
		double newB = (this.b * c.a) + (this.a * c.b);
		
		return new Complex(newA, newB);
	}


	public double mag() {
		return Math.hypot(this.a, this.b);
	}
	
	/**
	 * Returns a string representation of this complex number
	 * in the form a + bi.
	 * 
	 * <p>
	 * 
	 * @return a string representation of this complex number
	 */
	@Override
    public String toString() {
        if (b >= 0) {
            return a + " + " + b + "i";
        } 
        
        else {
            return a + " - " + (-b) + "i";
        }
    }
	
}

