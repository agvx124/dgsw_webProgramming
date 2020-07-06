package kr.hs.dgsw.webshopping.Controller;

import kr.hs.dgsw.webshopping.Domain.Product;
import kr.hs.dgsw.webshopping.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping(value = "/api/product")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping(value = "/api/product/{id}")
    public Product findById(@PathVariable("id") Long id) {
        return productService.findById(id);
    }

    @GetMapping(value = "/api/product/menu/{id}")
    public List<Product> findByMenuId(@PathVariable("id") Long id) {
        System.out.println(id);
        return productService.findByMenuId(id);
    }
}
