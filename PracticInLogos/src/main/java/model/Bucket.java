package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bucket
{
    private int id;
    private Timestamp purchaseDate;

    public Bucket(Timestamp purchaseDate)
    {
        this.id = id;
        this.purchaseDate = purchaseDate;
    }
}
