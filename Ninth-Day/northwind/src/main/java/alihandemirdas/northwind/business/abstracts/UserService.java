package alihandemirdas.northwind.business.abstracts;

import alihandemirdas.northwind.core.entities.User;
import alihandemirdas.northwind.core.utilities.results.DataResult;
import alihandemirdas.northwind.core.utilities.results.Result;

public interface UserService {
	Result add(User user);
	DataResult<User> findByEmail(String email);
}
