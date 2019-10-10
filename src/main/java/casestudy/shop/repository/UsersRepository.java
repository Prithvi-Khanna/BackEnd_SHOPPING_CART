package casestudy.shop.repository;

        import org.springframework.data.jpa.repository.JpaRepository;
        import casestudy.shop.model.Users;
        import org.springframework.stereotype.Repository;
        import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long>
{
        Optional <Users> findByUsername(String username);
}
