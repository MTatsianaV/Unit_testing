package org.example.first.Calculator;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CalculatorTest1 {
    @Test
    public void testCalculatingDiscountWithValidArguments() {
        // Arrange
        double purchaseAmount = 100.0;
        int discountAmount = 20;

        // Act
        double result = Calculator.calculatingDiscount(purchaseAmount, discountAmount);

        // Assert
        Assertions.assertThat(result).isEqualTo(80.0);
    }

    @Test
    public void testCalculatingDiscountWithInvalidArguments() {
        // Arrange
        double purchaseAmount = -100.0;
        int discountAmount = 20;

        // Act and Assert
        Assertions.assertThatThrownBy(() -> Calculator.calculatingDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments");
    }

    @Test
    public void testCalculatingDiscountWithInvalidDiscountAmount() {
        // Arrange
        double purchaseAmount = 100.0;
        int discountAmount = 120;

        // Act and Assert
        Assertions.assertThatThrownBy(() -> Calculator.calculatingDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments");
    }

    @Test
    public void testCalculatingDiscountWithZeroPurchaseAmount() {
        // Arrange
        double purchaseAmount = 0.0;
        int discountAmount = 10;

        // Act
        double result = Calculator.calculatingDiscount(purchaseAmount, discountAmount);

        // Assert
        Assertions.assertThat(result).isEqualTo(0.0);
    }

    @Test
    public void testCalculatingDiscountWithZeroDiscountAmount() {
        // Arrange
        double purchaseAmount = 100.0;
        int discountAmount = 0;

        // Act
        double result = Calculator.calculatingDiscount(purchaseAmount, discountAmount);

        // Assert
        Assertions.assertThat(result).isEqualTo(100.0);
    }

    @Test
    public void testCalculatingDiscountWithMaxDiscountAmount() {
        // Arrange
        double purchaseAmount = 100.0;
        int discountAmount = 100;

        // Act
        double result = Calculator.calculatingDiscount(purchaseAmount, discountAmount);

        // Assert
        Assertions.assertThat(result).isEqualTo(0.0);
    }
}
