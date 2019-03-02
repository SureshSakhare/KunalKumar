package org.eclipse.che.examples;

import javax.validation.Valid;

import org.eclipse.che.model.Response;
import org.eclipse.che.model.Users;
import org.eclipse.che.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class GreetingController 
{
    
    @Autowired
    UserService userService;
    
    @RequestMapping(value="/save", method=RequestMethod.POST,consumes="Application/Json")
    public Response createUser(@Valid @RequestBody Users user){
        Response response=new Response();
        boolean b=userService.createUser(user);
        if(b){
            response.setCode("000");
            response.setMessage("User Created");
            response.setUserName(user.getUserName());
        }
        return response;
    }
    
     @RequestMapping(value="/getUser", method=RequestMethod.GET)
    public Users getUsers(){
        return userService.getUsers();
    }
    
    @RequestMapping(value="/hello")
    public void helloWol(){
        System.out.println("Hello");
    }
}
