package kr.hs.dgsw.webshopping.Domain;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MenuMapper {
    List<Menu> findAll();

    Menu findById(Long id);
}
