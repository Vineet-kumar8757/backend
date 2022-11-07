package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Users;
@Repository
public interface UsersDao extends JpaRepository<Users, Long>{
	@Modifying
	@Transactional
	@Query(value="UPDATE users u SET u.phone =:p, u.city =:c, u.pincode =:pi, u.state =:s, u.street =:st WHERE u.user_id =:id",nativeQuery=true)
	public int updateUserDetails(@Param("p") String p, @Param("c") String c, @Param("pi") String pi, @Param("s") String s, @Param("st") String st, @Param("id") long id);
	
	@Query(value="SELECT* FROM users u WHERE u.email =:e",nativeQuery = true)
	public Users checkingExistingUsers(@Param("e") String e);
	
	@Query(value="SELECT* FROM users u WHERE u.email =:n",nativeQuery = true)
	public Users findByEmail(@Param("n") String n);
}
