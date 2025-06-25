package com.mahimascode.joblisting.repository;

import com.mahimascode.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
