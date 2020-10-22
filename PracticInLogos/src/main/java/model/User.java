package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import util.RandomIdGenerator;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User
{
    private Integer id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String role;

    public User(String email, String password, String firstName, String lastName, String role)
    {
        this.id = RandomIdGenerator.getRandomID();
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }
}
