package casestudy.shop.repository;

        import org.springframework.data.jpa.repository.JpaRepository;
        import casestudy.shop.model.Users;
        import org.springframework.stereotype.Repository;
        import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long>
{
        List <Users> findByUsername(String username);
}
