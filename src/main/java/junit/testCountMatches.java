package junit;

import impl.countMatches;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class testCountMatches{
    static final String input = "hoa vàng trên cỏ xanh";
    static final String[] arr = {
            "tôi thấy hoa vàng trên cỏ xanh",
            " hôm nay tôi thấy hoa vàng",
            "hoa vàng trên cỏ xanh, hoa vàng trên cỏ xanh"
    };

    //global timeout rule
    @Rule
    public Timeout globalTimeout = Timeout.seconds(1000);

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeClass - runOnceBeforeClass");
    }

    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass - runOnceAfterClass");
    }

    @Before
    public void runBeforeTestMethod() {
        System.out.println("@Before - runBeforeTestMethod");
    }

    @After
    public void AfterTestCountMatchesinArray() {
        System.out.println("@After - runAfterTestMethod");
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Ignore("Test Ignore")
    @Test
    public void testIgnore() {
        System.out.println("@testIgnore");
    }

    @Test(timeout = 1000)
    public void testCountMatchesInArray() {

        assertThat(countMatches.countMatches(arr, input), is(3));
        assertThat(countMatches.countMatchesUsedJoin(arr, input), is(3));

        assertThat(countMatches.countMatches(arr, "hoa vàng"), is(4));
        assertThat(countMatches.countMatchesUsedJoin(arr, "hoa vàng"), is(4));

        assertThat(countMatches.countMatches(arr, "hoa vàng xanh"), is(0));
        assertThat(countMatches.countMatchesUsedJoin(arr, "hoa vàng xanh"), is(0));

        assertThat(countMatches.countMatches(arr, "vàng"), is(4));
        assertThat(countMatches.countMatchesUsedJoin(arr, "vàng"), is(4));
    }

    @Parameterized.Parameters(name = "{index}: testAdd({0}+{1}) = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 6},
                {2, 2, 4},
                {8, 2, 10},
                {4, 5, 9},
                {5, 5, 10}
        });
    }

    @Test
    public void test_addTwoNumbes() {
        assertThat(add(1, 2), is(3));
    }


    public int add(int a, int b) {
        return a + b;
    }



}

