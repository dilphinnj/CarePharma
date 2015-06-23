
package Business;



public class CreateCustomer 
{
    private String custName;
    private int custTel;
    private String custAge;
    
    
    
    public CreateCustomer(String cn,int ct,String ca)
    {
        custName = cn;
        custTel = ct;
        custAge = ca;
        
    }
    
    public String getCustName()
    {
        return custName;
    }
    
    public void custName(String cn)
    {
        custName = cn;
    }
    
   public int getCustTel()
    {
        return custTel;
    }
    
    public void custTel(int ct)
    {
        custTel = ct;
    }
    
    public String getCustAge()
    {
        return custAge;
    }
    
    public void custAge(String ca)
    {
        custAge = ca;
    }
    
    
   
    
}

