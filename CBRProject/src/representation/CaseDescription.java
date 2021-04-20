package representation;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;
 import colibristudio.annotations.JCOLIBRIAttributeType;


public class CaseDescription implements CaseComponent { 


	/* Generated Class. Please Do Not Modify... */ 


	private java.lang.String JourneyID;


	public java.lang.String getJourneyID()
		{
			return JourneyID;
		}
	public void setJourneyID(java.lang.String JourneyID0)
		{
			this.JourneyID = JourneyID0;
		}

	private java.lang.String HolidayType;


	public java.lang.String getHolidayType()
		{
			return HolidayType;
		}
	public void setHolidayType(java.lang.String HolidayType1)
		{
			this.HolidayType = HolidayType1;
		}

	private java.lang.Integer NumberOfPersons;


	public java.lang.Integer getNumberOfPersons()
		{
			return NumberOfPersons;
		}
	public void setNumberOfPersons(java.lang.Integer NumberOfPersons2)
		{
			this.NumberOfPersons = NumberOfPersons2;
		}

	private java.lang.String Region;


	public java.lang.String getRegion()
		{
			return Region;
		}
	public void setRegion(java.lang.String Region3)
		{
			this.Region = Region3;
		}

	private java.lang.String Transportation;


	public java.lang.String getTransportation()
		{
			return Transportation;
		}
	public void setTransportation(java.lang.String Transportation4)
		{
			this.Transportation = Transportation4;
		}

	private java.lang.Integer Duration;


	public java.lang.Integer getDuration()
		{
			return Duration;
		}
	public void setDuration(java.lang.Integer Duration5)
		{
			this.Duration = Duration5;
		}

	private java.lang.String Season;


	public java.lang.String getSeason()
		{
			return Season;
		}
	public void setSeason(java.lang.String Season6)
		{
			this.Season = Season6;
		}

	private java.lang.String Accomodation;


	public java.lang.String getAccomodation()
		{
			return Accomodation;
		}
	public void setAccomodation(java.lang.String Accomodation7)
		{
			this.Accomodation = Accomodation7;
		}


	@Override
	public Attribute getIdAttribute()
		{
			return new Attribute("JourneyID",this.getClass());
		} 

	public String toString()		{
			return "["+ JourneyID + " , " + Accomodation + " , " + Transportation + " , " + HolidayType + " , " + Region + " , " + Duration + " , " + Season + " , " + NumberOfPersons +"]";
		}

}
