package com.mahimascode.joblisting.repository;

import com.mahimascode.joblisting.model.Post;
import org.springframework.stereotype.Component;

import java.util.List;


public interface SearchRepository {

   List<Post> findByText(String text);
}
