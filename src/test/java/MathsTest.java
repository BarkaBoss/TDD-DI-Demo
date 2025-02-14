import org.example.Maths;
import org.junit.*;

public class MathsTest {

    Maths maths;
    @Before
    public void setUpInstance(){
        maths = new Maths();
    }

    @Test
    public void checkTheSumOfTwoNumbersEqualsThree(){
        Assert.assertNotEquals(16,maths.addTwoNumbers(9, 7));
    }

    @Test
    public void checkTheSumOfTwoNumbersEqualsThreeAgain(){
        Assert.assertEquals(3,maths.addTwoNumbers(1, 2));
    }

    @Test
    public void checkIfNumberIsPrime(){
        Assert.assertTrue(maths.checkPrime(13));
    }
}
