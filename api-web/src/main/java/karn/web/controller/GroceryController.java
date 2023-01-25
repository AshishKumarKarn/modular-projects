package karn.web.controller;

import karn.api.pojo.GroceryItem;
import karn.api.service.GroceryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/grocery")
public class GroceryController {

    @Autowired
    @Qualifier("impl1")
    private GroceryService groceryService;
    @RequestMapping("/getGroceryById/{id}")
    public ResponseEntity<GroceryItem> getGroceryById(@PathVariable Long id){
        return ResponseEntity.accepted().body(groceryService.getGroceryItemById(id));
    }
}
