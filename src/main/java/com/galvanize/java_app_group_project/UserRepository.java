package com.galvanize.java_app_group_project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Long> {

		//Join
		@Query(value="select * from user_table as a inner join mr_table as b on a.ut_mrt_join = b.mrt_id;", nativeQuery = true)
		Iterable<User> createJoin ();
    
}