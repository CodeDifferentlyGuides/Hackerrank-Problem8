import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void contructWeirdSolutionTest(){
        String input = "42
                        3.1415
                        Welcome to HackerRank's Java tutorials!";
                        
        String expected = "String: Welcome to HackerRank's Java tutorials!
                           Double: 3.1415
                           Int: 42";
                           
        String actual = "*insert main function call*";
        
        Assert.assertEquals(expected, actual);
    }
}
