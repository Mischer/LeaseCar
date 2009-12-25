package com.epam.leasecar.actions;
import java.util.Collection;

//import com.epam.leasecar.model.Man;
import com.epam.leasecar.config.Config;
import com.epam.leasecar.model.Man;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class Login extends ActionSupport {

    private String username;
    private String password;
    private String message;
    private String name;
    
    @SuppressWarnings("unchecked")
	public String execute() throws Exception {
     
    	if (ActionContext.getContext().getSession().get("loginType") != null) {
    		return (String) ActionContext.getContext().getSession().get("loginType");
    	}
    	
    	String loginType = "login";
    	//String loginName = "";
    	
    	if (isValid(this.getUsername()) && isValid(this.getPassword())) {
        	
        	Collection<Man> mans = Config.getDAO().readMans();
        	for (Man man : mans) {
        		String ml = man.getLogin();
        		String mp = man.getPassword();

        		if (ml.equals(this.getUsername()) && mp.equals(this.getPassword())) {
        			
        			//this.name = man.getName();
                	ActionContext.getContext().getSession().put("userId", man.getId());
        			switch (man.getRole()){
        			case 1:
        				 System.out.println("admin");
        				loginType = "admin";
        				this.username = man.getName();
        				break;
        			case 2:
        			  System.out.println("user");
        				loginType = "user";
        				this.username = man.getName();
        				break;
        		
        			}
        		}
        	}
        }
    	
        if (!"login".equals(loginType)) {
        	ActionContext.getContext().getSession().put("loginType", loginType);
        	ActionContext.getContext().getSession().put("username", this.getUsername());
        	ActionContext.getContext().getSession().put("name", this.name);
        }
        
        return loginType;
    }

    private boolean isValid(String value) {
        return (value != null && value.length() != 0);
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}
