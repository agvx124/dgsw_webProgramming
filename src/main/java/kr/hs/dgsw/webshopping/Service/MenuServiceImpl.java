package kr.hs.dgsw.webshopping.Service;

import kr.hs.dgsw.webshopping.Domain.Menu;
import kr.hs.dgsw.webshopping.Domain.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<Menu> findAll() {
        return menuMapper.findAll();
    }

    @Override
    public Menu findById(Long id) {
        return menuMapper.findById(id);
    }

}