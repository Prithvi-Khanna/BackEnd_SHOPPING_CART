package casestudy.shop.repository;

import casestudy.shop.model.OrderHistory;
import casestudy.shop.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderHistoryRepository  extends JpaRepository <OrderHistory , Long>
{

    List<OrderHistory> findAllByUser(Optional<Users> users);
}
