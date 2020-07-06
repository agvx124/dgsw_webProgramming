package kr.hs.dgsw.webshopping.Service;

import kr.hs.dgsw.webshopping.Domain.Review;

import java.util.List;

public interface ReviewService {
    Long add(Review review);

    int deleteById(Long id);

    int modify(Review review);

    List<Review> findByProductId(Long productId);
}