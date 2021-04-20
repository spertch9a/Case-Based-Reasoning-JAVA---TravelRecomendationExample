package cbr;

import jcolibri.cbraplications.StandardCBRApplication;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.Connector;
import jcolibri.exception.ExecutionException;
import jcolibri.exception.InitializingException;
import jcolibri.method.retrieve.NNretrieval.NNConfig;

import javax.annotation.Generated;
import representation.CaseDescription;
import representation.CaseSolution;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.cbrcore.Attribute;
import representation.CaseDescription;
import representation.CaseSolution;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.cbrcore.Attribute;
import representation.CaseDescription;
import representation.CaseSolution;
import representation.CaseDescription;
import representation.CaseSolution;
import representation.CaseDescription;
import representation.CaseSolution;
import representation.CaseDescription;
import representation.CaseSolution;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.cbrcore.Attribute;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.cbrcore.Attribute;
import representation.CaseDescription;
import representation.CaseSolution;
import representation.CaseDescription;
import representation.CaseSolution;

public class CBRApplication implements StandardCBRApplication {

	@Generated(value = { "ColibriStudio" })
	Connector connector;
	
	@Generated(value = { "ColibriStudio" })
	CBRCaseBase casebase;



	//******************************************************************/
	// Configuration
	//******************************************************************/

	@Override
	public void configure() throws ExecutionException {
		try{
			configureConnector();
			configureCaseBase();
		} catch (Exception e){
			throw new ExecutionException(e);
		}
	}

	/** Configures the connector */
	@Generated(value = { "CS-PTConector" })	
	private void configureConnector() throws InitializingException{
		connector = new jcolibri.connector.PlainTextConnector();
		connector.initFromXMLfile(jcolibri.util.FileIO.findFile("config/plainTextConnectorConfig.xml"));
	}

	/** Configures the case base */
	@Generated(value = { "CS-CaseManager" })	
	private void configureCaseBase() throws InitializingException{
		casebase = new jcolibri.casebase.LinearCaseBase();
	}

	//******************************************************************/
	// Similarity
	//******************************************************************/
	
	/** Configures the similarity */
	@Generated(value = { "CS-Similarity" })	
	private NNConfig getSimilarityConfig() {
		NNConfig simConfig = new NNConfig();
		simConfig.setDescriptionSimFunction(new jcolibri.method.retrieve.NNretrieval.similarity.global.Average());
		Attribute attribute0 = new Attribute("HolidayType", CaseDescription.class);
		simConfig.addMapping(attribute0, new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute0, 1.00);
		Attribute attribute1 = new Attribute("NumberOfPersons", CaseDescription.class);
		simConfig.addMapping(attribute1, new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute1, 1.00);
		Attribute attribute2 = new Attribute("Region", CaseDescription.class);
		simConfig.addMapping(attribute2, new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute2, 1.00);
		Attribute attribute3 = new Attribute("Transportation", CaseDescription.class);
		simConfig.addMapping(attribute3, new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute3, 1.00);
		Attribute attribute4 = new Attribute("Duration", CaseDescription.class);
		simConfig.addMapping(attribute4, new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute4, 1.00);
		Attribute attribute5 = new Attribute("Season", CaseDescription.class);
		simConfig.addMapping(attribute5, new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute5, 1.00);
		Attribute attribute6 = new Attribute("Accomodation", CaseDescription.class);
		simConfig.addMapping(attribute6, new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute6, 1.00);
		return simConfig;
	}

	//******************************************************************/
	// Methods
	//******************************************************************/
	

	@Generated(value = { "ColibriStudio" })
	@Override
	public CBRCaseBase preCycle() throws ExecutionException {
		casebase.init(connector);
		return casebase;
	}
		
	@Generated(value = { "ColibriStudio" })	
	@Override
	public void cycle(CBRQuery query) throws ExecutionException {
	}

	@Generated(value = { "ColibriStudio" })
	@Override
	public void postCycle() throws ExecutionException {
		connector.close();
	}

	/**
	 * Main method
	 */
	@Generated(value = { "ColibriStudio" })
	public static void main(String[] args) {
		CBRApplication cbrApp = new CBRApplication();
		try {
			cbrApp.configure();
			CBRCaseBase caseBase = cbrApp.preCycle();
			
			//hadi bedelha 
			/*
			for(CBRCase c: caseBase.getCases())
				System.out.println(c);
			*/
			//hedi cha der fi blasetha
			CBRQuery query = new CBRQuery();
			query.setDescription(new CaseDescription());
			jcolibri.method.gui.formFilling.ObtainQueryWithFormMethod.obtainQueryWithoutInitialValues(query, null, null);
			cbrApp.cycle(query);
			cbrApp.postCycle();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}
}
