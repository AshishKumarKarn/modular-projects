package karn.impl.service;

import karn.api.pojo.GroceryItem;
import karn.api.service.GroceryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component("impl2")
public class DummyImpl implements GroceryService {
    @Override
    public GroceryItem getGroceryItemById(Long aLong) {
        log.warn("Dummy method invoked");
        return null;
    }
}
