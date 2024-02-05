package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class ProductRepository {
   private List<Product> productData = new ArrayList<>();
   private int idCounter = 0;
   
   public Product create(Product product){
    productData.add(product);
    product.setId(++idCounter);
    // System.out.printf("nama: %s, id: %d\n", product.getName(), product.getId());
    return product;
   }
   
   public void delete(long id) {  
    for (Product product : productData){
        if (product.getId() == id){
            productData.remove(product);
            break;
        }
    }  
    // Iterator<Product> iterator = productData.iterator();
    // while (iterator.hasNext()) {
    //     Product product = iterator.next();
    //     if (product.getId() == (id)) {
    //         iterator.remove();
    //         break;
    //     }
    // }
  }

   public Iterator<Product> findAll(){
    return productData.iterator();
   }
}
