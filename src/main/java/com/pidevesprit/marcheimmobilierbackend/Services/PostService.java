package com.pidevesprit.marcheimmobilierbackend.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pidevesprit.marcheimmobilierbackend.DAO.Entities.Annonce;
import com.pidevesprit.marcheimmobilierbackend.DAO.Entities.Post;
import com.pidevesprit.marcheimmobilierbackend.DAO.Repositories.CommentaireRepository;
import com.pidevesprit.marcheimmobilierbackend.DAO.Repositories.PostRepository;
import com.pidevesprit.marcheimmobilierbackend.Services.Interfaces.IPostService;
@Service
public class PostService implements IPostService{

	@Autowired
	    private PostRepository postRepo;
	@Override
	public List<Post> getAllPost() {
		return (List<Post>)postRepo.findAll();
	}

	@Override
	public Post getPost(Long postId) {
		return postRepo.findById(postId).orElse(null);
	}

	@Override
	public Post addPost(Post post) {
		return postRepo.save(post);
	}

	@Override
	public void deletePost(Long postId) {
		postRepo.deleteById(postId);
		
	}

	@Override
	public Post updatePost(Post post) {
		return postRepo.save(post);
	}

}
