package kr.hs.dgsw.webshopping.Service;

import kr.hs.dgsw.webshopping.Domain.Cart;

import java.util.List;

public interface CartService {
    Long add(Cart cart);

    int deleteById(Long id);

    int deleteByUserId(Long userId);

    Cart findById(Long userId, Long productId);

    List<Cart> findByUserId(Long userId);

    int payment(Long userId);
}