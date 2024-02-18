package DZ1;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
    void addProductList (Product product);
    Product getProductByName(String name);
    Product getProductByCost(double cost);
}
