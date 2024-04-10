package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void save(User user);

    void update(User user);

    void removeById(int id);

    List<User> getAll();

    User getById(int id);
}
