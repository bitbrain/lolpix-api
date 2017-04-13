package org.lolpix.integration.mongodb;

import java.util.Collections;
import java.util.List;

import org.lolpix.domain.adapter.PostAdapter;
import org.lolpix.domain.model.Post;
import org.lolpix.domain.model.User;
import org.springframework.stereotype.Component;

@Component
public class MongoDbPostAdapter implements PostAdapter {

	@Override
	public Post get(Long id) {
		return new Post();
	}

	@Override
	public Post add(Post element) {
		return new Post();
	}

	@Override
	public void delete(Post element) {

	}

	@Override
	public Post update(Post element) {
		return new Post();
	}

	@Override
	public List<Post> getAll(User user) {
		return Collections.emptyList();
	}

}
