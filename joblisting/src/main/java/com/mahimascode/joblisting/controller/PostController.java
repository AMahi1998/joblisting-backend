package com.mahimascode.joblisting.controller;

import com.mahimascode.joblisting.repository.PostRepository;
import com.mahimascode.joblisting.model.Post;
import com.mahimascode.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;

    @ApiIgnore
    @RequestMapping(value = "/")
    @CrossOrigin
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");

    }

    @GetMapping("/allPosts")
    @CrossOrigin
    public List<Post> getAllPosts(){
        return repo.findAll();
    }

    //posts/java
    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text){
        return srepo.findByText(text);
    }

    @PostMapping("/post")
    @CrossOrigin
    public Post addPost(@RequestBody Post post){
        return repo.save(post);
    }
}
