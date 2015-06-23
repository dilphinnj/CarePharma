
package Business;


public class CreateSupplier 
{

    private int supID;
    private String supName;
    private int supTel;
    private String supDrug;
    private int admID;
    
    
    
    public CreateSupplier(String sn,int st,int aid,String sd)
    {
        supName = sn;
        supTel = st;
        admID = aid;
        supDrug = sd;
        
    }
    
    
    
    public String getSupName()
    {
        return supName;
    }
    
    public void supName(String sn)
    {
        supName = sn;
    }
    
   public int getsupTel()
    {
        return supTel;
    }
    
    public void supTel(int st)
    {
        supTel = st;
    }
    
    public String getSupDrug()
    {
        return supDrug;
    }
    
    public void supDrug(String sd)
    {
        supDrug = sd;
    }
    
    public int getAdmID()
    {
        return admID;
    }
    
    public void admID(int aid)
    {
        admID = aid;
    }
    
    
    
}
