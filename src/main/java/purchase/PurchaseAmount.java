package purchase;

import java.math.BigDecimal;

/*
 * Класс для хранения покупок
 * В классе есть три поля: кол-во вещей, цена и скидка
 * В классе реализованы сеттеры
 */
public class PurchaseAmount {
    private int countThings; //Кол-во вещей
    private BigDecimal price; // Цена одного товара
    private BigDecimal discount; // Скидка

    // Конструктор с параметрами
    public PurchaseAmount(int countThings, float price, float discount) throws Exception{
        if (countThings >= 0 && price >= 0.0F && (discount >= 0.0F && discount <= 100.0F)){
            this.countThings = countThings;
            this.price = new BigDecimal(price);
            this.discount = new BigDecimal(discount);
    }
        else{
            throw new Exception("Проверьте правильность ввода данных!");
        }
    }

    public void setCountThings(int countThings) {
        this.countThings = countThings;
    }
    public void setPrice(float price){
        this.price = new BigDecimal(price);
    }
    public void setDiscount(float discount) {
        this.discount = new BigDecimal(discount);
    }

    public BigDecimal getPrice(){
        return this.price;
    }
    public BigDecimal getDiscount(){
        return this.discount;
    }
    public int getCountThings(){
        return this.countThings;
    }
}
