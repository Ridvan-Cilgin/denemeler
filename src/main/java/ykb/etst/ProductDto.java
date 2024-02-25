package ykb.etst;

import lombok.Data;

@Data
public class ProductDto {
    private int price;
    private int quantity;
    private int tax;
    private int totalPrice;
}