package org.lolpix.integration.mongodb;

import org.lolpix.domain.adapter.UserAdapter;
import org.lolpix.domain.model.User;
import org.springframework.stereotype.Component;

@Component
public class MongoDbUserAdapter implements UserAdapter {

	@Override
	public User get(Long id) {
		return new User();
	}

	@Override
	public User add(User element) {
		return new User();
	}

	@Override
	public void delete(User element) {

	}

	@Override
	public User update(User element) {
		return new User();
	}

}
