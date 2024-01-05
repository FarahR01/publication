package com.example.artConnect.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.artConnect.Repository.PostRepository;
import com.example.artConnect.Entity.Post;
@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;


    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public void savePost(Post post) {
        postRepository.save(post);
    }

    // Autres méthodes métier
}

