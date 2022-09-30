package com.Narainox.JobListing.Controllers;
import com.Narainox.JobListing.Model.Post;
import com.Narainox.JobListing.Repository.PostRepository;
import com.Narainox.JobListing.Repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {

    @Autowired
    PostRepository postRepository;

    @Autowired
    SearchRepository searchRepository;

    @GetMapping("/allPosts")
    @CrossOrigin
    public List<Post> getPosts()
    {
        return postRepository.findAll();
    }

    @PostMapping("/post")
    @CrossOrigin
    public Post addPost(@RequestBody Post post)
    {
        return postRepository.save(post);
    }

    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text)
    {
        return searchRepository.findByText(text);
    }
}
