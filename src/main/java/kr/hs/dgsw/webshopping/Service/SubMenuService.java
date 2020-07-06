package kr.hs.dgsw.webshopping.Service;

import kr.hs.dgsw.webshopping.Domain.SubMenu;

import java.util.List;

public interface SubMenuService {
    List<SubMenu> findByMenuId(Long menuId);

    SubMenu findById(Long id);
}