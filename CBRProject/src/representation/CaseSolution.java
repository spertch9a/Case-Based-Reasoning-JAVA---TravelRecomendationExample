package representation;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;
 import colibristudio.annotations.JCOLIBRIAttributeType;


public class CaseSolution implements CaseComponent { 


	/* Generated Class. Please Do Not Modify... */ 


	private java.lang.String Hotel;


	public java.lang.String getHotel()
		{
			return Hotel;
		}
	public void setHotel(java.lang.String Hotel8)
		{
			this.Hotel = Hotel8;
		}

	private java.lang.Integer Price;


	public java.lang.Integer getPrice()
		{
			return Price;
		}
	public void setPrice(java.lang.Integer Price9)
		{
			this.Price = Price9;
		}


	@Override
	public Attribute getIdAttribute()
		{
			return new Attribute("Hotel",this.getClass());
		} 

	public String toString()		{
			return "["+ Price + " , " + Hotel +"]";
		}

}
