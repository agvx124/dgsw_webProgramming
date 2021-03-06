package kr.hs.dgsw.webshopping.Domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Product {
    private Long id;
    private String name;
    private int price;
    private Long menuid;
    private Long submenuid;
    private String details;
    private String factory;
    private Long eventid;
    private int point;
}
