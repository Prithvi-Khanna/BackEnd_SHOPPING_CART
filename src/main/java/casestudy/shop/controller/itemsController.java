package casestudy.shop.controller;

import casestudy.shop.exception1.NotFound;
import casestudy.shop.model.items;
import casestudy.shop.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping( value = "/product" , method = { RequestMethod.GET , RequestMethod.POST})
public class itemsController {

    @Autowired
    ItemsRepository ItemsRepo;

    @GetMapping("/get1")
    public List<items> getAllNotes() {
        return ItemsRepo.findAll();
    }

    @GetMapping("/get_cate/{category}")
    public List<items> getItem(@PathVariable( value = "category") String cate)
    {
        return ItemsRepo.findAllByCategory(cate);
    }

    @GetMapping("/{category}/{first}/{last}")
    public List<items> getPrice(@PathVariable (value = "category") String cate , @PathVariable ( value = "first" ) double price1 , @PathVariable (value = "last") double price2)
    {
        return ItemsRepo.findAllByCategoryAndPriceBetween(cate,price1, price2);
    }

    @GetMapping("/sub/{category}/{subcategory}/{first}/{last}")
    public List<items> getPrice1(@PathVariable ( value = "subcategory") String cate ,@PathVariable (value = "subcategory") String sub , @PathVariable ( value = "first" ) double price1 , @PathVariable (value = "last") double price2)
    {
        return ItemsRepo.findAllByCategoryAndSubcategoryAndPriceBetween(cate,sub,price1,price2);
    }

    @GetMapping("/{subcategory}")
    public List<items> getItem1(@PathVariable( value = "subcategory") String cate)
    {
        return ItemsRepo.findAllBySubcategory(cate);
    }

    @GetMapping("/get_name/{name}")
    public List<items> getItem2(@PathVariable( value = "name") String name)
    {
        return ItemsRepo.findAllByName(name);
    }


    @PostMapping("/post1")
    public List<items> createNote(@Valid @RequestBody List<items> user1) {
        return ItemsRepo.saveAll(user1);
    }

    @GetMapping("/get1/{id}")
    public items getNoteById(@PathVariable(value = "id") Long noteId) {
        return ItemsRepo.findById(noteId)
                .orElseThrow(() -> new NotFound("Note", "id", noteId));
    }


}
