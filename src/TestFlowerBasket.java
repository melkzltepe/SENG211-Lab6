public class TestFlowerBasket {
    public static void main(String[] args) {
        Flower rose = new Flower("Pink", "Rose", 1.5);
        Bouquet bouquet = new Bouquet("Valentine's Day", rose, 13);
        System.out.println("Cost of the bouquet: " + bouquet.getCost());
    }
}
