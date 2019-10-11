package casestudy.shop.controller;


import casestudy.shop.model.Cart;
import casestudy.shop.repository.CartRepository;
import casestudy.shop.service.CartService;
import casestudy.shop.service.CurrentUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping( value = "/cart")
public class CartController {

    @Autowired
    CartService cartserv;
    @Autowired(required =true)
    CurrentUserService currentserv;

    @RequestMapping( value = "/addtocart/recieve/{ProductId}" , method = RequestMethod.GET)
    @ResponseBody
    public Cart addtocart(@PathVariable Long ProductId , Principal principal)
    {
        return cartserv.addtocart( currentserv.getuserid(principal),ProductId );
    }

    @RequestMapping( value = "/removeproduct/recieve/{ProductId}" , method = RequestMethod.GET)
    @ResponseBody
    public Cart removeproduct(@PathVariable Long ProductId , Principal principal)
    {
        return cartserv.removeproduct(currentserv.getuserid(principal),ProductId);
    }

    @RequestMapping( value = "/addproduct/recieve/{ProductId}" , method = RequestMethod.GET)
    @ResponseBody
    public String addproduct(@PathVariable Long ProductId , Principal principal)
    {
        return cartserv.addproduct(currentserv.getuserid(principal),ProductId);
    }

    @RequestMapping( value = "/removefromcart/recieve/{ProductId}" , method = RequestMethod.GET)
    @ResponseBody
    public String removefromcart(@PathVariable Long ProductId , Principal principal)
    {
        return cartserv.removefromcart(currentserv.getuserid(principal),ProductId);
    }

    @RequestMapping( value = "/showcart/recieve" , method = RequestMethod.GET)
    @ResponseBody
    public List<Cart> showcart(Principal principal)
    {
        return cartserv.showcart(currentserv.getuserid(principal),principal);
    }

    @RequestMapping( value = "/checkout/recieve" , method = RequestMethod.GET)
    @ResponseBody
    public double checkout(Principal principal)
    {
        return cartserv.checkout(currentserv.getuserid(principal),principal);
    }

    @RequestMapping( value = "/clearcart/recieve" , method = RequestMethod.GET)
    @ResponseBody
    public String clearcart(Principal principal)
    {
        return cartserv.clearcart(currentserv.getuserid(principal),principal);
    }
}
