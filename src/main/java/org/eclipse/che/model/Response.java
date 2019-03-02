package org.eclipse.che.model;

public class Response {
    
    private String code;
    private String message;
    private String userName;
    
    public void setCode(String code){
        this.code=code;
    }
    public String getCode(){
        return code;
    }
    public void setMessage(String message){
        this.message=message;
    }
    public String getMessage(){
        return message;
    }
    
     
    public void setUserName(String userName){
        this.userName=userName;
    }
    public String getUserName(){
        return userName;
    }
    
}
