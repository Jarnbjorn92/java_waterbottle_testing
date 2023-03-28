public class Runner {
    public static void main(String[] args) {
        WaterBottle bottle = new WaterBottle(100);
        bottle.drink();
        System.out.println(bottle.drink());
        System.out.println(bottle.empty());
        System.out.println(bottle.fill());
    }
}
