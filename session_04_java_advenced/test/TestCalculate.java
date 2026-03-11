import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TestCalculate {

    @BeforeAll
    public static void notification() {
        System.out.println("------------------------------");
        System.out.println("     Bắt đầu kiểm thử         ");
        System.out.println("------------------------------");
    }

    @BeforeEach
    public void beforeRunTestCase() {
        System.out.println("Tôi đang chạy test case");
    }

    // test về add
    @Test
    @DisplayName("Test case đúng")
    public void testFeatureAdd() {
        int result = Calculate.add(5,7);
        Assert.assertEquals(result, 12);
    }

    @Test
    @DisplayName("Test case sai")
    public void testFeatureAdd2() {
        int result = Calculate.add(5,3);
        Assert.assertEquals(result,7);
    }

    @Test
    @DisplayName("Kiểm tra có ném lỗi hay không")
    public void checkThrows() {
        Assert.assertThrows(RuntimeException.class,() -> {
            double result = Calculate.devide(5,0);
            System.out.println(result);
        });
    }

}
