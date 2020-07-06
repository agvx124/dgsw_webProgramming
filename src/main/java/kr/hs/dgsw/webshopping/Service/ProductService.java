package kr.hs.dgsw.webshopping.Service;

import kr.hs.dgsw.webshopping.Domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    int deleteById(Long id);

    Long add(Product product);

    int modify(Product product);

    Product findById(Long id);

    List<Product> findByMenuId(Long menuId);

    List<Product> findBySubMenuId(Long subMenuId);
}