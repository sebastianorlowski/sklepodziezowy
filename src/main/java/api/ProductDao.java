package api;

import work.Product;

import java.io.IOException;
import java.util.List;

public interface ProductDao {
    void saveProduct(Product product) throws IOException;
    void saveProducts(List<Product> products) throws IOException;
    void removeProductById (int productId) throws IOException;
    void removeProductByName(String productName) throws IOException;
    List<Product> getAllProducts() throws IOException;
    Product getProductById(int productId) throws IOException;
    Product getProductByProductName(String productName) throws IOException;

}
