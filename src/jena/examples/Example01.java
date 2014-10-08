package jena.examples;

import jena.example.vocabulary.FOAF;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;

public class Example01 {
	public static void main(String[] args) {
		final String subject = "http://lod.ac/id/1626";
		Property property = FOAF.name;
		final String object = "葛飾北斎";

		Model model = ModelFactory.createDefaultModel();
		Resource node = model.createResource(subject);
		node.addProperty(property, object);

		System.out.println(node.getProperty(property));
	}
}
