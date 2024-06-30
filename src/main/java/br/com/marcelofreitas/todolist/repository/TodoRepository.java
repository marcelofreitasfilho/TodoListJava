package br.com.marcelofreitas.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marcelofreitas.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
