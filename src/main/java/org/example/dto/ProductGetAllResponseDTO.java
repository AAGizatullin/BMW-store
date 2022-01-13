package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductGetAllResponseDTO {
    private List<Product> products;


@Data
@NoArgsConstructor
@AllArgsConstructor
public static class Product{
private long id;
private String name;
private int price;
private int qty;
private String image;

}
}
