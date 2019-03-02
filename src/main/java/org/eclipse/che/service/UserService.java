package org.eclipse.che.service;


import org.eclipse.che.daoImpl.UserDaoImpl;
import org.eclipse.che.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserService {
    
    @Autowired
    UserDaoImpl userImpl;
    
    public boolean createUser(Users user){
        return userImpl.createUser(user);
    }
    
    public Users getUsers(){
        return userImpl.getUsers();
    }
}
