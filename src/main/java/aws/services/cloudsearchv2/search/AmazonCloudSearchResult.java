package aws.services.cloudsearchv2.search;

import java.util.ArrayList;
import java.util.HashMap;
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

	public AmazonCloudSearchResult() {
		this.facets = new HashMap<>();
	}

	public Status status;

	public long time;

	public int found;

	public int start;

	private Hits hits;

	private Map<String, Buckets> facets;

	public List<Hit> getHits() {
		if (hits == null || hits.hit == null) {
			return new ArrayList<>();
		}
		return hits.hit;

	}

	public Map<String, List<Bucket>> getFacets() {
		if (facets == null) {
			return new HashMap<>();
		}
		Map<String, List<Bucket>> facetsToReturn = new HashMap<>();
		for (Map.Entry<String, Buckets> entry : facets.entrySet()) {
			facetsToReturn.put(entry.getKey(), entry.getValue().buckets);
		}
		return facetsToReturn;
	}
}
