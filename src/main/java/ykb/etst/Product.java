package ykb.etst;

public class Product {
    public static void main(String[] args) {


        int price = 100;
        int price2 = 110;

        ProductDto productDto = new ProductDto();
        productDto.setPrice(price);
        productDto.setQuantity(2);
        productDto.setTax(18);
        productDto.setTotalPrice(100);
//        fqwefqw;

        System.out.println("Total price: " + productDto.getTotalPrice());

        ProductDto productDto2 = new ProductDto();
        productDto.setPrice(price);
        productDto.setQuantity(2);
        productDto.setTax(18);
        productDto.setTotalPrice(100);
        System.out.println(productDto2);

 }

}
