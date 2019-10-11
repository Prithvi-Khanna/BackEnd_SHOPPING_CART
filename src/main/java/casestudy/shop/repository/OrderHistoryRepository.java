package casestudy.shop.repository;

import casestudy.shop.model.OrderHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderHistoryRepository  extends JpaRepository <OrderHistory , Long>
{

}
