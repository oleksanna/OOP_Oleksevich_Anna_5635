package DZ2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human petr = new Human("Петр");
        Human mariya = new Human("Мария");
        market.acceptToMarket(mariya);
        market.update();
    }
}