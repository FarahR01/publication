package com.example.artConnect.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.artConnect.Entity.Post;
import com.example.artConnect.Service.PostService;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;
    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @PostMapping
    public void createPost(@RequestBody Post post) {
        postService.savePost(post);
    }

    // Autres méthodes de gestion des requêtes
}
