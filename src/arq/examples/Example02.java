package arq.examples;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.sparql.engine.http.QueryEngineHTTP;

public class Example02 {
	public static void main(String[] args) {
		try {
			String queryStr = "select * where {?s ?p ?o .} LIMIT 10";
			Query query = QueryFactory.create(queryStr);

			QueryExecution qexec = QueryExecutionFactory.sparqlService(
					"http://192.168.33.10:3030/data/sparql", query);
			((QueryEngineHTTP) qexec).addParam("timeout", "10000");

			ResultSet results = qexec.execSelect();
			while (results.hasNext()) {
				QuerySolution qs = results.next();
				RDFNode node = qs.get("s");
				System.out.println(node.toString() + ": " + node.isURIResource());
			}
			qexec.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
