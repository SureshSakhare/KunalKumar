package org.eclipse.che.dao;


import org.eclipse.che.model.Users;

public interface UserDao {
     public boolean createUser(Users user);
      public Users getUsers();
}
