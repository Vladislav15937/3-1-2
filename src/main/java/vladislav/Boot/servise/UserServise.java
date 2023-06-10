package vladislav.Boot.servise;

import org.springframework.transaction.annotation.Transactional;
import vladislav.Boot.model.User;

import java.util.List;

public interface UserServise {

    @Transactional
    List<User> getAllPeople();

    @Transactional
    User personById(Long id);

    @Transactional
    void save(User user);

    @Transactional
    void update(Long id, User user);

    @Transactional
    void delete(Long id);
}
