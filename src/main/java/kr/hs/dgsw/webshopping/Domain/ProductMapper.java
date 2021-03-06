package kr.hs.dgsw.webshopping.Domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ProductMapper {
    Long add(Product product);

    int modify(Product product);

    int deleteById(@Param("id") Long id);

    Product findById(@Param("id") Long id);

    List<Product> findByMenuId(@Param("menuid") Long menuid);

    List<Product> findBySubMenuId(@Param("submenuid") Long submenuid);

    List<Product> findAll();
}