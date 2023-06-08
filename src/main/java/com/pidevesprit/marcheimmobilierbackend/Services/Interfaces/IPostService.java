package com.pidevesprit.marcheimmobilierbackend.Services.Interfaces;

import java.util.List;

import com.pidevesprit.marcheimmobilierbackend.DAO.Entities.Annonce;
import com.pidevesprit.marcheimmobilierbackend.DAO.Entities.Post;

public interface IPostService {
	List<Post> getAllPost();
	Post getPost(Long postId);
	Post addPost(Post post);
	void deletePost(Long postId);
	Post updatePost(Post post);

}
