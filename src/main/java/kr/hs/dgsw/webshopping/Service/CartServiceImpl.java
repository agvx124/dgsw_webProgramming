package kr.hs.dgsw.webshopping.Service;

import kr.hs.dgsw.webshopping.Domain.Cart;
import kr.hs.dgsw.webshopping.Domain.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartMapper cartMapper;

    @Override
    public Long add(Cart cart) {
        return cartMapper.add(cart);
    }

    @Override
    public int deleteById(Long id) {
        return cartMapper.deleteById(id);
    }

    @Override
    public int deleteByUserId(Long userId) {
        return cartMapper.deleteByUserId(userId);
    }

    @Override
    public Cart findById(Long userId, Long productId) {
        return cartMapper.findById(userId, productId);
    }

    @Override
    public List<Cart> findByUserId(Long userId) {
        return cartMapper.findByUserId(userId);
    }
    
    @Override
    public int payment(Long userId) {
        int point = cartMapper.getPoint(userId);
        cartMapper.payment(userId);
        
        return point;
    }
}