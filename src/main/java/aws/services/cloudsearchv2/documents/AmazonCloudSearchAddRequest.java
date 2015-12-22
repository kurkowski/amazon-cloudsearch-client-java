package aws.services.cloudsearchv2.documents;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * This is class is used to request add or update of a document.
 * 
 * @author Tahseen Ur Rehman Fida
 * @email tahseen.ur.rehman@gmail.com
 *
 */
public class AmazonCloudSearchAddRequest extends AmazonCloudSearchDocumentRequest {
	/**
	 * The document language as a two-letter language code, such as en for English.
	 */
	public String lang = "en";
	
	/**
	 * A name-value pair for each document field
	 */
	public Map<String, Object> fields = new LinkedHashMap<String, Object>();

	
	public void addField(String name, String value) {
		fields.put(name, value);
	}	
	
	public void addField(String name, Integer value) {
		fields.put(name, value);
	}	
		
	public void addField(String name, Long value) {
		fields.put(name, value);
	}	
	
	public void addField(String name, List<String> values) {
		fields.put(name, values);
	}	
}
