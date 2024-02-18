package DZ1;

public class Main {
    public static void main(String[] args) {
        HotDrinkVendingMachine machine = new HotDrinkVendingMachine();
        machine.addProductList(new HotDrink("Каппучино",100, 0.3, 70));
        machine.addProductList(new HotDrink("Латте",130, 0.4, 50));
        machine.addProductList(new HotDrink("Эспрессо",80, 0.1, 96));
        machine.addProductList(new HotDrink("Американо",50, 0.2, 80));
        printProductByName(machine, "Эспрессо");
    }

public static void printProductByName(VendingMachine vendingMachine,
                                      String name){
    System.out.println(vendingMachine.getProductByName(name));
    }
}