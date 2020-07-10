package com.example.todoapp.mapper;

import com.example.todoapp.model.Todo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class TodoMapper implements RowMapper<Todo> {
    @Override
    public Todo mapRow(ResultSet resultSet, int i) throws SQLException {
        Todo newTodo = new Todo();

        newTodo.setId(resultSet.getLong("id"));
        newTodo.setTitle(resultSet.getString("title"));
        newTodo.setDescription(resultSet.getString("description"));
        newTodo.setCompleted(resultSet.getBoolean("completed"));

        return newTodo;
    }
}
