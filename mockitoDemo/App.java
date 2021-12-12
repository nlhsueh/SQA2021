package mockito;

import static org.mockito.Mockito.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime p = mock(Prime.class);
		when(p.getAllPrime(2)).thenReturn(new int[] { 2 });
		when(p.getAllPrime(10)).thenReturn(new int[] { 2, 3, 5, 7 });
		
		int a[] = p.getAllPrime(10);
		for (int x: a) {
			System.out.println(x);
		}
	}

}

interface Prime {
	int[] getAllPrime(int a);

	boolean isPrime(int x);
}
