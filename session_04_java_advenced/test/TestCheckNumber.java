import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TestCheckNumber {
    @Test
    @DisplayName("Kiểm tra số chẵn")
    public void checkEven() {
        Assert.assertTrue(CheckNumber.isEven(2));
    }

    @Test
    @DisplayName("Kiểm tra số nguyên tố")
    public void checkPrime() {
        Assert.assertTrue(CheckNumber.isPrime(9));
    }
}
