package vladislav.Boot.dao;

import vladislav.Boot.model.User;

import java.util.List;

public interface UserDAO {

    public List<User> getAllPeople();

    public User personById(Long id);

    public User save(User user);

    public User update(User user);

    public void delete(Long id);

}
