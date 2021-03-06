package kr.hs.dgsw.webshopping.Controller;

import kr.hs.dgsw.webshopping.Domain.Review;
import kr.hs.dgsw.webshopping.Service.ReviewService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewController {
    @Autowired
    ReviewService reviewService;

    @PostMapping(value = "/api/review")
    public Long add(@RequestBody Review review) {
        return reviewService.add(review);
    }

    @DeleteMapping(value = "/api/review/id")
    public int deleteById(@Param("id") Long id) {
        return reviewService.deleteById(id);
    }

    @GetMapping(value = "/api/review/productId")
    public List<Review> findByProductId(@Param("productId") Long productId) {
        return reviewService.findByProductId(productId);
    }

    @PutMapping(value = "/api/review")
    public int modify(@RequestBody Review review) {
        return reviewService.modify(review);
    }
}
