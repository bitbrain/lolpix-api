package org.lolpix.integration.dto.converter;

import org.lolpix.domain.model.Post;
import org.lolpix.integration.dto.PostDto;
import org.springframework.stereotype.Component;

@Component
public class PostConverter implements Converter<Post, PostDto> {

	@Override
	public Post toModel(PostDto dto) {
		return Post.builder()
				.id(dto.getId())
				.title(dto.getTitle())
				.description(dto.getDescription())
				.url(dto.getUrl())
				.build();
	}

	@Override
	public PostDto toDto(Post post) {
		return PostDto.builder()
				.id(post.getId())
				.title(post.getTitle())
				.description(post.getDescription())
				.url(post.getUrl())
				.build();
	}
}
