package casestudy.shop.service;

import casestudy.shop.model.Cart;
import casestudy.shop.model.OrderHistory;
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
    private OrderHistoryRepository orderHistoryRepository;

    public Cart addtocart(Long getuserid, Long productId) {

        Optional<items> item = itemsRepository.findById(productId);
        Optional<Users> users = usersRepository.findById(getuserid);

        if(cartRepository.findByUserAndItem(users , item).isPresent())
        {
            Cart car = cartRepository.findByUserAndItem(users,item).get();
            car.setQuantity(car.getQuantity() + 1);
            cartRepository.save(car);
        }

        else
        {
           Cart c = new Cart(item.get() , users.get() , 1);
           cartRepository.save(c);
        }

        return cartRepository.findByUserAndItem( users , item).get();
    }

    public Cart removeproduct(Long getuserid, Long productId) {

        Cart car= new Cart();
        return car;
    }

    public String addproduct(Long getuserid, Long ProductId) {

        Optional<items> item = itemsRepository.findById(ProductId);
        Optional<Users> users = usersRepository.findById(getuserid);

        if(cartRepository.findByUserAndItem(users , item).isPresent())
        {
            return "this item is already present";
        }
        else
        {
            Cart car = new Cart();
            car.setItem(item.get());
            car.setUser(users.get());
            cartRepository.save(car);
            return "Successfully added";
        }

    }

    public String removefromcart(Long getuserid, Long ProductId) {

        Optional<items> item = itemsRepository.findById(ProductId);
        Optional<Users> users = usersRepository.findById(getuserid);

        if(cartRepository.findByUserAndItem(users,item).get().getQuantity() <= 1)
        {
            Cart car =  cartRepository.findByUserAndItem(users,item).get();
            cartRepository.delete(car);
        }
        else
        {
            Cart car = cartRepository.findByUserAndItem(users,item).get();
            car.setQuantity(car.getQuantity() - 1);
            cartRepository.save(car);
        }
        return "Removed";
    }

    public List<Cart> showcart(Long getuserid, Principal principal) {
        Optional<Users> user= usersRepository.findById(getuserid);
        return cartRepository.findAllByUser(user.get());
    }

    public double checkout(Long getuserid, Principal principal) {

        Optional<Users> user = usersRepository.findById(getuserid);
        List<Cart> car = cartRepository.findAllByUser(user.get());
        for( Cart cart : car)
        {
            OrderHistory order = new OrderHistory();
            //order.setOrderId(cart.getId());
            order.setItem(cart.getItem());
            double p = cart.getItem().getPrice();
            order.setQuantity(cart.getQuantity());
            order.setPrice((cart.getQuantity() * p));
            order.setUser(cart.getUser());
            order.setdate1();
            orderHistoryRepository.save(order);
        }
        clearcart(getuserid,principal);
        return 0;
    }

    public String clearcart(Long getuserid, Principal principal) {

        Optional<Users> user = usersRepository.findById(getuserid);
        List<Cart> cartitem = cartRepository.findAllByUser(user.get());
        for( Cart cart : cartitem)
        {
            cartRepository.deleteById(cart.getId());
        }
        return "Cart Cleared";
    }

}
