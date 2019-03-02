package org.eclipse.che.model;

import javax.validation.constraints.NotNull;

public class Users {

    @NotNull
    private String userName;
    
    public void setUserName(String userName){
        this.userName=userName;
    }
    public String getUserName(){
        return userName;
    }
}
