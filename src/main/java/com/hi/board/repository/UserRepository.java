package com.hi.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hi.board.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User findByEmailAndPwd(String email, String pwd); //email $ pwd 를 합쳐서 찾는다
}	