
public class Type5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        int i, j;
		        boolean isPrime;

		       
		        for (i = 1; i <= 100; i++) {
		           
		            isPrime = true;

		           
		            for (j = 2; j <= i / 2; j++) {
		                if (i % j == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }

		           
		            if (isPrime) {
		                System.out.print(i + " ");
		            }
		        }
		    }
		}

		
		
