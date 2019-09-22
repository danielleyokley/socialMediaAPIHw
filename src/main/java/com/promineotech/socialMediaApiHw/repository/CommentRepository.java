package com.promineotech.socialMediaApiHw.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.socialMediaApiHw.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {

}