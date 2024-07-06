package dio.api.Service;

import dio.api.Model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);


}
