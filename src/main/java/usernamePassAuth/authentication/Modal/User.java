package usernamePassAuth.authentication.Modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")// this help us to tell that this pojo is mapped with this table in database
@Getter
@Setter
public class User {

    @Id
    private Integer id; // this will act as a primary key for this table
    private String username;
    private String password;

}
