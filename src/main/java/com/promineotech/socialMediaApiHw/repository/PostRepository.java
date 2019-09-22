package com.promineotech.socialMediaApiHw.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.socialMediaApiHw.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long>{

}