
import junit.framework.TestCase;
import org.junit.Test;


public class MainTest extends TestCase{
    static final String input = "hoa vàng trên cỏ xanh";
    static final String[] arr = {
            "tôi thấy hoa vàng trên cỏ xanh",
            " hôm nay tôi thấy hoa vàng",
            "hoa vàng trên cỏ xanh, hoa vàng trên cỏ xanh"
    };

    public MainTest(String name) {
        super(name);
    }


    @Test
    public void testName() {
        assertEquals (countMatches.countMatches(arr, input), 3l);
        assertEquals (countMatches.countMatchesUsedJoin(arr, input), 3l);
    }



}