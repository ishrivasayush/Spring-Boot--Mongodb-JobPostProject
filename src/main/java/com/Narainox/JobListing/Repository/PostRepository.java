package com.Narainox.JobListing.Repository;

import com.Narainox.JobListing.Model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {

}
