package purchase;
import purchase.PurchaseAmount;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Amount {
    public static void amountWithDiscount(PurchaseAmount obj) {
        BigDecimal amount;
        amount = new BigDecimal(1).subtract(obj.getDiscount().divide(new BigDecimal(100)));
        amount = amount.multiply(obj.getPrice());
        amount = amount.multiply(new BigDecimal(obj.getCountThings()));
        amount = amount.setScale(2, RoundingMode.CEILING);

        System.out.format("Сумма со скидкой: %.2f\n\n", amount.floatValue());
    }
    public static void amountWithoutDiscount(PurchaseAmount obj) {
        BigDecimal amount = new BigDecimal(1);
        amount = amount.multiply(obj.getPrice());
        amount = amount.multiply(new BigDecimal(obj.getCountThings()));
        amount = amount.setScale(2, RoundingMode.CEILING);
        System.out.format("Сумма без скидки: %.2f\n", amount.floatValue());
    }
}
