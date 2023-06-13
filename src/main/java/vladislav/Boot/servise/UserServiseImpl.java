package vladislav.Boot.servise;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vladislav.Boot.dao.UserDaoImpl;
import vladislav.Boot.model.User;


import java.util.List;

@Service
public class UserServiseImpl implements UserServise {

   private final UserDaoImpl userDao;

    public UserServiseImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public List<User> getAllPeople() {
        return userDao.getAllPeople();
    }

    @Override
    @Transactional
    public User personById(Long id) {
        return userDao.personById(id);
    }

    @Override
    @Transactional
    public User save(User user) {
       return userDao.save(user);
    }

    @Override
    @Transactional
    public User update(User user) {
       return userDao.update(user);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userDao.delete(id);
    }
}
