public class Fibonacci {
	public static int fibo(int n) { // the function used to find fibonacci using the recursive method

		if (n <= 1) {
			return 1;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}

	public static int nacci(int n) { // the function used to find fibonacci using the iterative method
		if (n <= 1) {
			return 1;
		}
		int j = 0, p = 1, pp = 1, i;
		for (i = 2; i <= n; i++) {
			j = p + pp;
			pp = p;
			p = j;
		}
		return j;
	}

	public static void main(String[] args) {

		int i, n = 40, g1, g2;
		System.out.print("~~\t~~~~~~~~~~~~~~~~~~\t~~~~~~~~~~~~~~~~\n");
		System.out.print("No#\tIterative Method\tRecursive Method\n");
		System.out.print("~~\t~~~~~~~~~~~~~~~~~~\t~~~~~~~~~~~~~~~~\n");
		long start_time, end_time;
		int difference, difference2;
		for (i = 20; i <= n; i++) // loop from 20 to 40
		{
			start_time = System.nanoTime(); // getting the initial time
			g1 = nacci(i); // iterative method calling function for finding fibonacci 
			end_time = System.nanoTime(); // for end time
			difference = (int) ((end_time - start_time) / 1e6); // for calculating difference
			start_time = System.nanoTime(); // getting the initial time
			g2 = fibo(i); // recursive method calling function for finding fibonacci
			end_time = System.nanoTime(); // getting the end time
			difference2 = (int) ((end_time - start_time) / 1e6); // this calculates the difference
			System.out.print(i + "\t\t" + difference + "\t\t\t" + difference2 + "\t\n"); // for outputting result
		}
	}
}