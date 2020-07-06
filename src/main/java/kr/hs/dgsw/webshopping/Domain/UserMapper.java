package kr.hs.dgsw.webshopping.Domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> findAll();

    int deleteById(@Param("id") Long id);

    Long add(User user);

    int modify(User user);

    User findById(@Param("id") Long id);

    User login(User user);

    User findByAccount(@Param("account") String account);
}