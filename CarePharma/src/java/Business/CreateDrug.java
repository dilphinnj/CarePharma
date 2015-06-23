/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;



public class CreateDrug 
{
    private String drugName;
    private String drugDetails;
    private int drugQty;
    private double drugPPU;
    
    public CreateDrug(String dn,String dd,int dq, double ppu)
    {
        drugName = dn;
        drugDetails = dd;
        drugQty = dq;
        drugPPU = ppu;
    }
    
    public String getDrugName()
    {
        return drugName;
    }
    
    public void drugName(String dn)
    {
        drugName = dn;
    }
    
    public String getDrugDetails()
    {
        return drugDetails;
    }
    
    public void getDrugDetails(String dd)
    {
        drugDetails = dd;
    }
    
    public int getDrugQty()
    {
        return drugQty;
    }
    
    public void getDrugQty(int dq)
    {
        drugQty = dq;
    }
    
    public double getDrugPPU()
    {
        return drugPPU;
    }
    
    public void getDrugPPU(double ppu)
    {
        drugPPU = ppu;
    }
    
       
   
    
}


