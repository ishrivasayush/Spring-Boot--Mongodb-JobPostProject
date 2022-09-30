package com.Narainox.JobListing.Repository;
import com.Narainox.JobListing.Model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SearchRepository {

    List<Post> findByText(String text);

}