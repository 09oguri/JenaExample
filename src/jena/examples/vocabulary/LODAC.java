package jena.examples.vocabulary;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;

public class LODAC {
	protected static final String uri = "http://lod.ac/ns/lodac#";

	public static String getURI() {
		return uri;
	}

	private static Model m = ModelFactory.createDefaultModel();

	public static final Resource LODAC_REFERENCE = m.createResource(uri + "LODACReference");
	public static final Resource PERSON_REFERENCE = m.createResource(uri + "PersonReference");
	public static final Resource WORK = m.createResource(uri + "Work");
	public static final Resource WORK_REFERENCE = m.createResource(uri + "WorkReference");

	public static final Property AREA = m.createProperty(uri + "area");
	public static final Property BROAD_CATEGORY = m.createProperty(uri + "broadCategory");
	public static final Property CATEGORY_SYMBOL = m.createProperty(uri + "categorySymbol");
	public static final Property COUNTRY = m.createProperty(uri + "country");
	public static final Property CREATES = m.createProperty(uri + "creates");
	public static final Property CULTURAL_ASSETS = m.createProperty(uri + "culturalAssets");
	public static final Property CURRENT_LOCATION_NAME = m.createProperty(uri
			+ "currentLocationName");
	public static final Property DRAWING = m.createProperty(uri + "drawing");
	public static final Property END_YEAR = m.createProperty(uri + "endYear");
	public static final Property ERA = m.createProperty(uri + "era");
	public static final Property ESTIMATED_START_YEAR = m
			.createProperty(uri + "estimatedStartYear");
	public static final Property FORMER_LOCATION_NAME = m
			.createProperty(uri + "formerLocationName");
	public static final Property GENRE = m.createProperty(uri + "genre");
	public static final Property HAS_CHILDREN = m.createProperty(uri + "hasChildren");
	public static final Property IS_TAUGHT_BY = m.createProperty(uri + "isTaughtBy");
	public static final Property JOB = m.createProperty(uri + "job");
	public static final Property MIDDLE_CATEGORY = m.createProperty(uri + "middleCategory");
	public static final Property NARROW_CATEGORY = m.createProperty(uri + "narrowCategory");
	public static final Property PREFERED_CATEGORY = m.createProperty(uri + "preferedCategory");
	public static final Property REPUTATION = m.createProperty(uri + "reputation");
	public static final Property START_YEAR = m.createProperty(uri + "startYear");
	public static final Property SYMBOL = m.createProperty(uri + "symbol");
	public static final Property TYPE = m.createProperty(uri + "type");
}