package casestudy.shop.controller;

import casestudy.shop.model.items;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping( value = "/product" , method = { RequestMethod.GET , RequestMethod.POST})
public class itemsController {

    @GetMapping(path = "/{batch}", produces = "application/json")
    public int register(@RequestParam(name = "ProductId") Long ProductId,
                        @RequestParam(name = "name", required = false) String name,
                        @RequestParam(name = "details", required = false) String details,
                        @PathVariable ("batch") int batch) {
        return -1;
    }

    @PostMapping(path = "/post", produces = "application/json")
    public int register(@RequestBody items item1) {
        return 90;
    }


    @GetMapping(path = "/list")
    public List<items> getAllStudents() {
        List<items> item1 = new ArrayList<>();

        item1.add(new items( 12345 , "T-shirt" , "Black Polo T-shirt" , 2599 , "shop1.jpg" , "Clothing" , "Topwear" ));
        item1.add(new items( 12346 , "T-shirt" , "Yellow Polo T-shirt" , 2599 , "shop1.jpg" , "Clothing" , "Topwear" ));
        item1.add(new items( 12347 , "T-shirt" , "Black Rounded Neck T-shirt" , 2599 , "shop1.jpg" , "Clothing" , "Topwear" ));
        item1.add(new items( 12348 , "T-shirt" , "Red Polo T-shirt" , 2599 , "shop1.jpg" , "Clothing" , "Topwear" ));

        return item1;
    }


    @PostMapping("/session")
    public String Assignitems(@RequestBody items item1) {

        return item1.getName();
    }
}
