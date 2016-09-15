package com.mg.ums.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonPOJOBuilder
public class PrivilegesModel {
	
	@JsonProperty("privilegeId")
    private int privilegeId;

    @JsonProperty("privilegeCode")
    private String privilegeCode;
    
    @JsonProperty("privilegeDescription")
    private String privilegeDescription;
    
}
