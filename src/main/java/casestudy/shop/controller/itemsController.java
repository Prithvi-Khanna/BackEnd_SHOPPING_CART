package casestudy.shop.controller;

import casestudy.shop.exception1.NotFound;
import casestudy.shop.model.items;
import casestudy.shop.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
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

    @GetMapping("/get_item/{category}")
    public List<items> getItem(@PathVariable( value = "category") String cate)
    {
        return ItemsRepo.findAllByCategory(cate);
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
