package a3;

/**
 * This class provides a method for computing the number of iterations for which
 * z(n + 1) = z(n) * z(n) + c remains bounded where z(0) = 0 + 0i.
 *
 */
public class MandelbrotUtil {

	private MandelbrotUtil() {
		// A private constructor prevents users from creating a
		// MandelbrotUtil object.
	}

	/**
	 * Simple test method.
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		Complex c = new Complex(0.0, 5.0);
		System.out.println(mandelbrotIterations(c, 100));
	}

	public static int mandelbrotIterations(Complex c, int max) {
	    if (max < 1) {
	        throw new IllegalArgumentException("max must be >= 1");
	    }
	    
	    Complex z = new Complex(0.0, 0.0);
	    int iter = 0;
	    
	    while (iter < max && z.mag() <= 2.0) {
	        z = z.multiply​(z).add​(c);
	        iter++;
	    }
	    
	    if (z.mag() > 2.0) {
	        return iter;
	    } 
	    
	    else {
	        return max;
	    }
	}

}
