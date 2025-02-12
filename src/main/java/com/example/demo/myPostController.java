package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestClient;

@RestController
public class myPostController {

    @GetMapping("/myPosts/{uid}")
    public Post getDetails(@PathVariable("uid") String uid) {
        System.out.println("Initalized");

        String url = "https://jsonplaceholder.typicode.com/posts/" + uid;

//        RestClient rc = RestClient.create();
        RestClient rc = RestClient.builder().build();

        Post response = rc.get().uri(url).retrieve().body(Post.class);

        System.out.println("response : " + response.getBody());
        System.out.println("response : " + response.getTitle());
        System.out.println("response : " + response.getId());
//        System.out.println("Response user " + response.userid);
        
        return response;
    }
}