package casestudy.shop.model;


import javax.persistence.*;
import java.util.Optional;

@Entity
public class Cart {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @ManyToOne
    private Optional<items> item;
  @ManyToOne
    private Optional<Users> user;
  @Column
    private int quantity;

    public Cart(){}

    public Cart(Optional<items> item, Optional<Users> user, int quantity) {
        this.item = item;
        this.user = user;
        this.quantity = quantity;
    }

    public Optional<items> getItem() {
        return item;
    }

    public void setItem(Optional<items> item) {
        this.item = item;
    }

    public Optional<Users> getUser() {
        return user;
    }

    public void setUser(Optional<Users> user) {
        this.user = user;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
