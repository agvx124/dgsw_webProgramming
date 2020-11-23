package kr.hs.dgsw.webshopping.Domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Cart {
    private Long id;
    private Long userId;
    private Long productId;
    private int price;
    private int amount;
    private int total;
    private LocalDateTime created;
    private int point;
}
