package kr.hs.dgsw.webshopping.Domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CartMapper {
    Long add(Cart cart);

    int deleteById(@Param("id") Long id);

    int deleteByUserId(@Param("userId") Long userId);

    Cart findById(@Param("userId") Long userId, @Param("productId") Long productId);

    List<Cart> findByUserId(@Param("userId") Long userId);

    void modify(Cart cart);

    int payment(Long userId);

    int getPoint(Long userId);
}
