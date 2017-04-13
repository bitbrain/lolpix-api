package org.lolpix.domain.service;

import java.util.List;

import org.lolpix.domain.adapter.PostAdapter;
import org.lolpix.domain.adapter.UserAdapter;
import org.lolpix.domain.model.Post;
import org.lolpix.domain.model.User;
import org.springframework.stereotype.Service;

@Service
public class PostService {

	private final PostAdapter postAdapter;
	private final UserAdapter userAdapter;

	public PostService(PostAdapter postAdapter, UserAdapter userAdapter) {
		this.postAdapter = postAdapter;
		this.userAdapter = userAdapter;
	}

	public Post addPost(String titel, String description, String url) {
		return postAdapter.add(new Post(null, titel, description, url));
	}

	public void deletePost(Long id) {
		Post post = postAdapter.get(id);
		postAdapter.delete(post);
	}

	public Post getPost(Long id) {
		return postAdapter.get(id);
	}

	public List<Post> getAllPosts(Long userId) {
		User user = userAdapter.get(userId);
		return postAdapter.getAll(user);
	}

}
