package com.pidevesprit.marcheimmobilierbackend.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pidevesprit.marcheimmobilierbackend.DAO.Entities.Post;
import com.pidevesprit.marcheimmobilierbackend.Services.Interfaces.IPostService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/postes")

public class PostController {
	
	@Autowired
    private IPostService postRest;
    
   /* @GetMapping("/allPosts")
    @ResponseBody
    public List<Post> getAllPosts() { 
        return postRest.getAllPost();
    }
    @GetMapping("/post/{post_id}")
    @ResponseBody
    public Post getPost(@PathVariable("post_id") Long postId) {
        return postRest.getPost(postId);
    }
    @PostMapping("/addPost")
    @ResponseBody
    public Post addPost(@RequestBody Post post) {
        return postRest.addPost(post);
    }
    
    @DeleteMapping("/deletePost/{post_id}")
    @ResponseBody
    public void deletePost(@PathVariable("post_id") Long postId) {
    	postRest.deletePost(postId);
    }
    
    @PutMapping("/updatePost")
    @ResponseBody
    public Post updatePost(@RequestBody Post post) {
        return postRest.updatePost(post);
    }*/

}
