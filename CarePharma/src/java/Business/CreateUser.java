
package Business;



public class CreateUser 
{
    private String userFullName;
    private String userName;
    private String userType;
    private String password;
    private int userTel;
    
    
    public CreateUser(String ufn,String un,String utyp,String pw,int utel)
    {
        userFullName = ufn;
        userName = un;
        userType = utyp;
        password = pw;
        userTel = utel;
    }
    
    
    public String getUserFullName()
    {
        return userFullName;
    }
    
    public void userFullName(String ufn)
    {
        userFullName = ufn;
    }
    
       
    public String getUserName()
    {
        return userName;
    }
    
    public void userName(String un)
    {
        userName = un;
    }
    
      public String getUserType()
    {
        return userType;
    }
    
    public void userType(String ut)
    {
        userName = ut;
    }
    
      public String getPassword()
    {
        return password;
    }
    
    public void password(String pw)
    {
        userName = pw;
    }
    
    public int getUserTel()
     {
         return userTel;
     }

     public void userTel(int utel)
     {
         userTel = utel;
     }
    
    
}

