package jena.examples;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.util.FileManager;

public class Example03 {
	public static void main(String[] args) {
		Model model = ModelFactory.createDefaultModel();
		FileManager.get().readModel(model, "./1626.ttl");

		printModel(model);
	}

	private static void printModel(Model model) {
		StmtIterator iter = model.listStatements();

		while (iter.hasNext()) {
			System.out.println(iter.nextStatement());
		}
	}
}
