package org.eclipse.che.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<Users>{
    
  public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
   Users user = new Users();
   user.setUserName(rs.getString("username"));
   return user;
  }
}
