package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table ( name = "Users")
public class Users implements Serializable {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private String email ;
    private String username ;
    private String password ;

    public Users(){}

    public Users(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    @Embedded

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
