package org.eclipse.che.daoImpl;


import javax.sql.DataSource;

import org.eclipse.che.dao.UserDao;
import org.eclipse.che.model.UserMapper;
import org.eclipse.che.model.Users;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    
    private final String CREATE_SQL="insert into USERS (username) values (?)";
    private final String GET_ALL_SQL="select * from USERS";
    
    private JdbcTemplate jdbcTemplate;
     public UserDaoImpl(DataSource dataSource) {
        this.jdbcTemplate=new JdbcTemplate(dataSource);
    }
    
      @Override
      public boolean createUser(Users user){
          return jdbcTemplate.update(CREATE_SQL, user.getUserName())>0;
      }
      @Override
       public Users getUsers(){
          return  jdbcTemplate.queryForObject(GET_ALL_SQL, new UserMapper());
       }
}
