package vladislav.Boot.dao;



import vladislav.Boot.model.User;

import java.util.List;

public interface UserDAO {

    public List<User> getAllPeople();

    public User personById(Long id);

    public void save(User user);

    public void update(Long id, User user);

    public void delete(Long id);

}
