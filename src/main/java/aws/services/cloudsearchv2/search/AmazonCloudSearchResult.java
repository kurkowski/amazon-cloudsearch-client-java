package aws.services.cloudsearchv2.search;

import java.util.List;
import java.util.Map;

/**
 * Result of a query executed on Amazon Cloud Search.
 * 
 * @author Tahseen Ur Rehman Fida
 * @email tahseen.ur.rehman@gmail.com
 *
 */
public class AmazonCloudSearchResult {
	public String rid;
	
	public long time;
	
	public int found;
	
	public int start;
	
	public List<Hit> hits;

	public Map<String, List<Bucket>> facets;
}
