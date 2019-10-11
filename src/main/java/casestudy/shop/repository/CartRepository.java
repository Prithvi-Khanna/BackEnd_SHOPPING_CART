package casestudy.shop.repository;

import casestudy.shop.model.Cart;
import casestudy.shop.model.Users;
import casestudy.shop.model.items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long>
{
    Optional<Cart> findByUserAndItem(Optional<Users> users, Optional<items> item);

    List<Cart> findAllByUser(Users user );

    Cart findByUser(Users users);
}
