
package com.checkmarx.flow.gitdashboardnewver;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "name",
    "url",
    "value"
})
@Generated("jsonschema2pojo")
@Data
@Builder
public class Identifier {

    /**
     * for example, cve, cwe, osvdb, usn, or an analyzer-dependent type such as gemnasium).
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("for example, cve, cwe, osvdb, usn, or an analyzer-dependent type such as gemnasium).")
    private String type;
    /**
     * Human-readable name of the identifier.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Human-readable name of the identifier.")
    private String name;
    /**
     * URL of the identifier's documentation.
     * 
     */
    @JsonProperty("url")
    @JsonPropertyDescription("URL of the identifier's documentation.")
    private URI url;
    /**
     * Value of the identifier, for matching purpose.
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("Value of the identifier, for matching purpose.")
    private String value;

    /**
     * for example, cve, cwe, osvdb, usn, or an analyzer-dependent type such as gemnasium).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * for example, cve, cwe, osvdb, usn, or an analyzer-dependent type such as gemnasium).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Human-readable name of the identifier.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Human-readable name of the identifier.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * URL of the identifier's documentation.
     * 
     */
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    /**
     * URL of the identifier's documentation.
     * 
     */
    @JsonProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    /**
     * Value of the identifier, for matching purpose.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Value of the identifier, for matching purpose.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

   
}
