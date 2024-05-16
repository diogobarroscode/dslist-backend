package com.diogocode.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diogocode.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
