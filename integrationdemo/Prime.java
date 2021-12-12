import java.util.Scanner;

public class Prime {
	public static void main(String args[]) {
		new Prime().display();
	}

	public void display() {
		int n = this.read();
		System.out.println("The prime numbers are: ");
		printArray(allPrime(n));
	}

	public int read() {
		// return 7;

		System.out.print("Please input the value: ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public int[] allPrime(int n) {
		// int r[] = {2, 3, 5, 7};

		String s = "";
		for (int i=0; i<=n; i++) {
			if (isPrime(i)) {
				if (s.equals("")) 
					s = String.valueOf(i);
				else
					s = s + " " + String.valueOf(i);					
			}
		}

		String arr[] = s.split(" ");
		int r[] = new int[arr.length];
		for (int i=0; i<arr.length; i++) {
			r[i] = Integer.parseInt(arr[i]);
		}

		return r;
	}

	public void printArray(int[] arr) {
		for (int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public boolean isPrime(int x) {
		// if (x==2) return true;
		// if (x==3) return true;
		// if (x==5) return true;
		// if (x==7) return true;
		// else return false;

		if (x<2)
			return false;
		else if (x==2) {
			return true;
		}
		else {
			for (int i = 2; i< x/2+1; i++) {
				if (x % i == 0)
					return false;
			}
			return true;
		}
	}
}