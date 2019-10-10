package casestudy.shop.service;

import casestudy.shop.model.Cart;
import casestudy.shop.model.Users;
import casestudy.shop.model.items;
import casestudy.shop.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;
import  java.util.Optional;

@Service
public class CartService {

    @Autowired
    private ItemsRepository itemsRepository;
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private orderHistoryRepository orderHistoryRepository;

    public Cart addproduct(Long getuserid, Long productId) {

        Optional<items> item = itemsRepository.findById(productId);
        Optional<Users> users = usersRepository.findById(getuserid);

        if(cartRepository.findByUserAndItems(users , item).isPresent())
        {
            Cart car = cartRepository.findByUserAndItems(users,item).get();
            car.setQuantity(car.getQuantity() + 1);
            cartRepository.save(car);
        }

        else
        {
           Cart c = new Cart(item , users , 1);
           cartRepository.save(c);
        }

        return cartRepository.findByUserAndItems( users , item).get();
    }

    public Cart removeproduct(Long getuserid, Long productId) {

        Cart car= new Cart();
        return car;
    }

    public String addtocart(Long getuserid, Long ProductId) {

        Optional<items> item = itemsRepository.findById(ProductId);
        Optional<Users> users = usersRepository.findById(getuserid);

        if(cartRepository.findByUserAndItems(users , item).isPresent())
        {
            return "this item is already present in your cart";
        }
        else
        {
            Cart car = new Cart();
            car.setItem(item);
            car.setUser(users);
            cartRepository.save(car);
            return "Successfully added";
        }

    }

    public String removefromcart(Long getuserid, Principal principal) {

        return "Removed";
    }

    public List<Cart> showcart(Long getuserid, Principal principal) {
        Optional<Users> user = usersRepository.findById(getuserid);

        return cartRepository.findByUserAndItems_Active(user,1);
    }

    public double checkout(Long getuserid, Principal principal) {
        return 0;
    }

    public String clearcart(Long getuserid, Principal principal) {
        return null;
    }
}
