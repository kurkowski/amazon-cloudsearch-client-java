package aws.services.cloudsearchv2.search;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Hit {
	public String id;
	public Map<String, String> fields = new HashMap<>();

	public Integer getIntegerField(String field) {
		Integer rlt = null;
		if (fields.containsKey(field)) {
			rlt = Integer.parseInt(fields.get(field));
		}
		return rlt;
	}

	public Long getLongField(String field) {
		Long rlt = null;
		if (fields.containsKey(field)) {
			rlt = Long.parseLong(fields.get(field));
		}
		return rlt;
	}

	public Double getDoubleField(String field) {
		Double rlt = null;
		if (fields.containsKey(field)) {
			rlt = Double.parseDouble(fields.get(field));
		}
		return rlt;
	}

	public String getField(String field) {
		return fields.get(field);
	}

	public List<String> getListField(String field) throws IOException {
		if (fields.containsKey(field)) {
			String value = fields.get(field);

			ObjectMapper mapper = new ObjectMapper();
			return mapper.readValue(value, List.class);
		}
		return null;
	}
}
