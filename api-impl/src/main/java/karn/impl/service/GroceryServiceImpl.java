package karn.impl.service;

import karn.api.pojo.GroceryItem;
import karn.api.service.GroceryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component("impl1")
public class GroceryServiceImpl implements GroceryService {

    @Autowired
    private final JdbcTemplate jdbcTemplate;

    @Override
    public GroceryItem getGroceryItemById(Long id) {
//        return jdbcTemplate.queryForObject("select * from public.grocery_item where grocery_id = ? ", BeanPropertyRowMapper.newInstance(GroceryItem.class), id);
        return jdbcTemplate.query("SELECT * FROM public.grocery_item where grocery_id=" + id, rs -> {
            GroceryItem item = new GroceryItem();
            if(rs.next()){
                item.setId(rs.getLong("grocery_id"));
                item.setName(rs.getString("name"));
                item.setPrice(rs.getDouble("price"));
                item.setPurchaseDate(rs.getDate("purchase_date"));
                item.setQuantity(rs.getDouble("quantity"));
                item.setUnit(rs.getString("unit"));
            }
             return item;
        });
    }
}
