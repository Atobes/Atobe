package pac;


public class App {
	public static void main(String[] args) {
		long i = 1;
		long sum = 0;
		while (i <= 2147483647){
	        if (i % 2 == 1){
	            sum = sum + i;
	        }
	        i++;
	    }
	    System.out.println("sum = "+sum);
	}
}
