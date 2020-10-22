package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bucket
{
    private int id;
    private LocalDateTime purchaseDate;

    public Bucket(LocalDateTime purchaseDate)
    {
//        this.id = RandomIdGenerator.getRandomID();
        this.purchaseDate = purchaseDate;
    }
}
