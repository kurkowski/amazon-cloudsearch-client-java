package aws.services.cloudsearchv2.search;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Hit {
	public String id;
	public Map<String, Object> fields = new HashMap<>();

	public Integer getIntegerField(String field) {
		Integer rlt = null;
		if (fields.containsKey(field)) {
			rlt = Integer.parseInt((String)fields.get(field));
		}
		return rlt;
	}

	public Long getLongField(String field) {
		Long rlt = null;
		if (fields.containsKey(field)) {
			rlt = Long.parseLong((String)fields.get(field));
		}
		return rlt;
	}

	public Double getDoubleField(String field) {
		Double rlt = null;
		if (fields.containsKey(field)) {
			rlt = Double.parseDouble((String)fields.get(field));
		}
		return rlt;
	}

	public Object getField(String field) {
		return fields.get(field);
	}

	public List<String> getListField(String field) throws IOException {
		if (!fields.containsKey(field) || !(fields.get(field) instanceof List)) {
			return null;
		}

		List<String> stringList = new ArrayList<>();
		Object list = fields.get(field);
		for (Object elem : (List) list) {
			if (String.class.isInstance(elem)) {
				stringList.add((String) elem);
			}
		}
		return stringList;
	}
}
