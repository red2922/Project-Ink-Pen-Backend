package com.jake.demo.Services;

import org.springframework.stereotype.Service;
import com.jake.demo.Components.UtilityComponent;
import com.jake.demo.Repository.PostsRepository;
import com.jake.demo.dto.Post;

@Service
public class PostsService {
    private String utilityName = "postNumber";

    private PostsRepository postRepository;
    private UtilityComponent utilityComponent;

    public PostsService(PostsRepository postRepository, UtilityComponent utilityComponent) {
        this.postRepository = postRepository;
        this.utilityComponent = utilityComponent;
    }

    public Post createNewPost(Post post) {
        post.setId(utilityComponent.updateUtilityData(utilityName).getSum());
        return postRepository.save(post);
    }

    public void updatePostBalance(Integer id, float pay) {
        postRepository.changeBalance(id, pay);
    }

    public void updateLikes(Integer id, Integer likes) {
        postRepository.changeLikes(id, likes);
    }
}
