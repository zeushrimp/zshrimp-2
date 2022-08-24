package com.zshrimp2.myhome.service;

import com.zshrimp2.myhome.model.Board;
import com.zshrimp2.myhome.model.User;
import com.zshrimp2.myhome.repository.BoardRepository;
import com.zshrimp2.myhome.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;

    public Board save(String username, Board board){

        User user = userRepository.findByUsername(username);
        board.setUser(user);
        return boardRepository.save(board);


    }
}
