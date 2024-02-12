package com.company.jmixpractise.Service;

import com.company.jmixpractise.dto.CategoriesDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import groovy.util.logging.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Component("CategoryService")
public class CategoryService {
    @Autowired
    private ObjectMapper objectMapper;
    List<CategoriesDTO> Categories = null;

    private List<CategoriesDTO> initItems() {
        if (Categories == null) {
            String resourcePath = "data/categories.json";
            try {
                InputStream inputStream = getClass().getClassLoader().getResourceAsStream(resourcePath);
                Categories = objectMapper.readValue(inputStream, new TypeReference<>() {
                });

            } catch (Exception e) {
//                log.error("Error while loading data", e);
                Categories = new ArrayList<>();
            }
        }
        return Categories;
    }

    public List<CategoriesDTO> getCategories() {
        return initItems();
    }
//
//    public Item saveItem(Item item){
//        if(item.getId() == null){
//            long maxId = items.stream().map(Item::getId).max(Long::compareTo).orElse(1L);
//            item.setId(maxId+1);
//            initItems().add(item);
//        }
//        return item;
//    }
}
