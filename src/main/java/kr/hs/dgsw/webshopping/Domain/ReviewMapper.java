package kr.hs.dgsw.webshopping.Domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ReviewMapper {
    Long add(Review review);

    int modify(Review review);

    int deleteById(@Param("id") Long id);

    List<Review> findByProductId(@Param("productId") Long productId);
}