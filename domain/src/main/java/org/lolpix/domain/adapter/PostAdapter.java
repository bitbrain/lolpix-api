package org.lolpix.domain.adapter;

import java.util.List;

import org.lolpix.domain.model.Post;
import org.lolpix.domain.model.User;

public interface PostAdapter extends Adapter<Post, Long> {

	List<Post> getAll(User user);
}
