package com.zshrimp2.myhome.repository;

import com.zshrimp2.myhome.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
