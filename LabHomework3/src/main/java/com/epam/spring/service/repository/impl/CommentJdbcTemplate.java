package com.epam.spring.service.repository.impl;

import com.epam.spring.service.model.Comment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Make use of JdbcTemplate class somewhere in you code
 */
@Repository
@Slf4j
public class CommentJdbcTemplate {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void createSchema() {
        jdbcTemplate.execute("create schema `spring`");
    }

    public void createTableComments() {
        jdbcTemplate.execute("CREATE TABLE comments (`id` INT NOT NULL, `orderId` INT NOT NULL, `userId` INT NOT NULL, `text` VARCHAR(45) NOT NULL, PRIMARY KEY (`id`));");
    }

    public List<Comment> findAll() {
        return jdbcTemplate.query("select * from comments", new BeanPropertyRowMapper<>(Comment.class));
    }

    public int insertComment(Comment comment) {
        return jdbcTemplate.update("insert into comments (id, orderId, userId, text) values (?,?,?,?)",
                new Object[]{comment.getId(), comment.getOrderId(), comment.getUserId(), comment.getText()});
    }
}
