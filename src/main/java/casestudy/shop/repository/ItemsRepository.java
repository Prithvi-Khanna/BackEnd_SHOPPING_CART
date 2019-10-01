package casestudy.shop.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import casestudy.shop.model.items;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Repository
public interface ItemsRepository extends JpaRepository<items,Long>
{
    List<items> findAllByCategory(String category);
}
