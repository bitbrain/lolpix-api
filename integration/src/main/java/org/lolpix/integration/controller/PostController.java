package org.lolpix.integration.controller;

import org.lolpix.domain.model.Post;
import org.lolpix.domain.service.PostService;
import org.lolpix.integration.dto.PostDto;
import org.lolpix.integration.dto.converter.PostConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

	private final PostService postService;
	private final PostConverter postConverter;

	public PostController(PostService postService, PostConverter postConverter) {
		this.postService = postService;
		this.postConverter = postConverter;
	}
	
	@GetMapping("/post/{postId}")
	public Post getPost(@PathVariable("postId") Long postId) {
		return postService.getPost(postId);
	}

	@PostMapping("/post")
	public PostDto addPost(Long postId) {
		return postConverter.toDto(postService.addPost(null, null, null));
	}
}
