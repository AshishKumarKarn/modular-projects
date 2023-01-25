package karn.api.service;

import karn.api.pojo.GroceryItem;

public interface GroceryService {
    GroceryItem getGroceryItemById(Long id);
}
