package vladislav.Boot.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import vladislav.Boot.model.User;

import java.util.List;


@Repository
public class UserDaoImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllPeople() {
        return entityManager.createQuery("SELECT a FROM User a", User.class).getResultList();
    }

    @Override
    public User personById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public User save(User user) {
      return entityManager.merge(user);
    }

    @Override
    public User update(User user) {

        return entityManager.merge(user);
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(personById(id));
    }
}
