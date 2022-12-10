package test;
public class Product implements Comparable{
	   public String pCode,pName;
	   public float pPrice;
	   public int pQty;
	   public Product(String pCode,String pName,float pPrice,int pQty)
	   {
		   this.pCode=pCode;
		   this.pName=pName;
		   this.pPrice=pPrice;
		   this.pQty=pQty;
	   }
public String toString()
{
	return pCode+"\t"+pName+"\t"+pPrice+"\t"+pQty;
}
public int compareTo(Object o)
{
	Product prod = (Product)o;    //String Components  
	  int q = pName.compareTo(prod.pName);
	   if(q==0) return 0;
	   else if(q>0) return 1;
	   else return -1;
	   
	    //Numeric Components
	 
	   /* if(pQty==prod.pQty) return 0;
	   else if(pQty>prod.pQty) return 1;
	   else return -1;*/
	   

	
}
}
