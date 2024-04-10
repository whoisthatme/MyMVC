package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional
    public void updateUser(User updateUser) {
        userDao.update(updateUser);
    }

    @Override
    @Transactional
    public void removeUserById(int id) {
        userDao.removeById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAll();
    }

    public User getUserById(int id) {
        return userDao.getById(id);
    }
}