package aws.services.cloudsearchv2.search;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {
  @JsonProperty
  String rid;

  @JsonProperty("time-ms")
  Integer timeMs;
}
