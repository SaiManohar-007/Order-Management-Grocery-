package com.ordermanagement.grocery_api.controller;

import com.ordermanagement.grocery_api.model.GroceryItem;
import com.ordermanagement.grocery_api.service.GroceryItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class GroceryItemController {

    private final GroceryItemService groceryItemService;

    public GroceryItemController(GroceryItemService groceryItemService) {
        this.groceryItemService = groceryItemService;
    }

    @GetMapping
    public List<GroceryItem> getAllItems() {
        return groceryItemService.findAllItems();
    }

    @GetMapping("/{id}")
    public ResponseEntity<GroceryItem> getItemById(@PathVariable Long id) {
        return groceryItemService.findItemById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public GroceryItem createItem(@RequestBody GroceryItem item) {
        return groceryItemService.saveItem(item);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GroceryItem> updateItem(@PathVariable Long id, @RequestBody GroceryItem updatedItem) {
        return groceryItemService.findItemById(id)
                .map(item -> {
                    item.setName(updatedItem.getName());
                    item.setCategory(updatedItem.getCategory());
                    item.setPrice(updatedItem.getPrice());
                    item.setQuantity(updatedItem.getQuantity());
                    GroceryItem savedItem = groceryItemService.saveItem(item);
                    return ResponseEntity.ok(savedItem);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long id) {
        groceryItemService.deleteItem(id);
        return ResponseEntity.noContent().build();
    }
}