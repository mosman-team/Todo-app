package com.example.todoapp.dao;

import com.example.todoapp.mapper.TodoMapper;
import com.example.todoapp.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Todo> findAll(){
        String sql = "select * from todo";
        return jdbcTemplate.query(sql, new TodoMapper());
    }

}





