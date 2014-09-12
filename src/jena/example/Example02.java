package jena.example;

import jena.example.vocabulary.CRM;
import jena.example.vocabulary.DC;
import jena.example.vocabulary.FOAF;
import jena.example.vocabulary.LODAC;
import jena.example.vocabulary.RDA2;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.StmtIterator;

public class Example02 {
	public static void main(String[] args) {
		Model model = ModelFactory.createDefaultModel();

		Resource node904 = model.createResource("http://lod.ac/id/904");
		Resource node1626 = model.createResource("http://lod.ac/id/1626");
		Resource node4405 = model.createResource("http://lod.ac/id/4405");

		node904.addProperty(FOAF.name, "東京国立博物館");

		node1626.addProperty(FOAF.name, "葛飾北斎");
		node1626.addProperty(LODAC.JOB, "浮世絵師");
		node1626.addProperty(RDA2.dateOfBirth, "1760");
		node1626.addProperty(LODAC.CREATES, node4405);

		node4405.addProperty(DC.title, "北斎漫画");
		node4405.addProperty(DC.created, "1814より");
		node4405.addProperty(CRM.P55_has_current_location, node904);

		printModel(model);
	}

	private static void printModel(Model model) {
		StmtIterator iter = model.listStatements();

		while (iter.hasNext()) {
			System.out.println(iter.nextStatement());
		}
	}
}
