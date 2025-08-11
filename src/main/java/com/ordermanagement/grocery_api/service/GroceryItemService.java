package com.ordermanagement.grocery_api.service;

import com.ordermanagement.grocery_api.model.GroceryItem;
import com.ordermanagement.grocery_api.repository.GroceryItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroceryItemService {

    private final GroceryItemRepository groceryItemRepository;

    public GroceryItemService(GroceryItemRepository groceryItemRepository) {
        this.groceryItemRepository = groceryItemRepository;
    }

    public List<GroceryItem> findAllItems() {
        return groceryItemRepository.findAll();
    }

    public Optional<GroceryItem> findItemById(Long id) {
        return groceryItemRepository.findById(id);
    }

    public GroceryItem saveItem(GroceryItem item) {
        return groceryItemRepository.save(item);
    }

    public void deleteItem(Long id) {
        groceryItemRepository.deleteById(id);
    }
}