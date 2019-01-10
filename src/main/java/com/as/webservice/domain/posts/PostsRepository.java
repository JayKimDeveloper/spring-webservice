package com.as.webservice.domain.posts;

import com.as.webservice.domain.dto.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
