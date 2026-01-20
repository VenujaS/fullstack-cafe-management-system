package com.cafe.backend.service;

import com.cafe.backend.model.Menu;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuService {

    private final List<Menu> menuList = new ArrayList<>();

    public List<Menu> getAllMenuItems() {
        return menuList;
    }

    public Menu addMenuItem(Menu menu) {
        menuList.add(menu);
        return menu;
    }
}
