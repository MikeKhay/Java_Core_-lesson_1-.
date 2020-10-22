package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product
{
    private int id;
    private String name;
    private String description;
    private double price;
    private int bucketId;

    public Product(String name, String description, double price)
    {
//        this.id = RandomIdGenerator.getRandomID();
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
