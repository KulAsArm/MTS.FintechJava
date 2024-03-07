package mainclass;

import purchase.PurchaseAmount;
import purchase.Amount;
import java.util.List;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) throws Exception {
        PurchaseAmount milk = new PurchaseAmount(1, 100.1F, 0.75F);
        PurchaseAmount cheese = new PurchaseAmount(5, 200.2F, 42.575F);
        PurchaseAmount meet = new PurchaseAmount(1, 500.5F, 59.1F);

        List<PurchaseAmount> purchaseAmountList = Arrays.asList(milk, meet, cheese);

        for (int i = 0; i < purchaseAmountList.size(); i++) {
            Amount.amountWithoutDiscount(purchaseAmountList.get(i));
            Amount.amountWithDiscount(purchaseAmountList.get(i));
        }
    }
}