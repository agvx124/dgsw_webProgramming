package kr.hs.dgsw.webshopping.Service;

import kr.hs.dgsw.webshopping.Domain.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(Long id);

    User findByAccount(String account);

    int deleteById(Long id);

    Long add(User user);

    int modify(User user);

    User login(User user);

    int accumulate(User user);
}