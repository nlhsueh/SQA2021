package Prime;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

class PrimeTest {
  
   Prime p;
          
   @BeforeEach   
   public void setUp(){
      p = spy(Prime.class);        
      // p = new Prime();
   }

   @Test
   public void testIsPrime() {
      when(p.isPrime(2))
         .thenReturn(true);
      // when(p.isPrime(3))
      //    .thenReturn(true);

      int[] exp_pNumbers = p.allPrime(4);
      int[] real_pNumbers = {2, 3};
      assertArrayEquals(exp_pNumbers, real_pNumbers);   
   }

}
