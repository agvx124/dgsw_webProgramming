package kr.hs.dgsw.webshopping.Service;

import kr.hs.dgsw.webshopping.Domain.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> findAll();

    Menu findById(Long id);
}