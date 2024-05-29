package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestClient;

@RestController
public class myPostController {

    @GetMapping("/myPosts/{id}")
    public Post getDetails(@PathVariable String id) {
        System.out.println("Initalized");

        String url = "https://jsonplaceholder.typicode.com/posts/" + id;

        RestClient rc = RestClient.create();

        Post response = rc.get().uri(url).retrieve().body(Post.class);
        System.out.println("response : " + response.getBody());
        System.out.println("response : " + response.getTitle());
        System.out.println("response : " + response.getId());
        System.out.println("Response user " + response.userid);
        
        return response;
    }
}