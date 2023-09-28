import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {
      Sum sum; //

      @BeforeEach
      void  init () {
            sum = new Sum (); //new instance of our class
      }


    //Unit test
      @Test
      void addTwoNumbers (){
int expected = 9;
int actual = sum.addTwoNumbers(5,4);

assertEquals (expected, actual);
      }
}
