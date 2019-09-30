package casestudy.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import casestudy.shop.model.Users;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersRepository extends JpaRepository<Users,Long>
{
}
