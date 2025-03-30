package nz.co.assurity.API.responseData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Promotion {

    @JsonProperty("Id")
    private Integer id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Price")
    private Integer price;
    @JsonProperty("MinimumPhotoCount")
    private Integer minimumPhotoCount;
    @JsonProperty("OriginalPrice")
    private Integer originalPrice;
    @JsonProperty("Recommended")
    private Boolean recommended;

    @JsonProperty("Id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("Price")
    public Integer getPrice() {
        return price;
    }

    @JsonProperty("Price")
    public void setPrice(Integer price) {
        this.price = price;
    }

    @JsonProperty("MinimumPhotoCount")
    public Integer getMinimumPhotoCount() {
        return minimumPhotoCount;
    }

    @JsonProperty("MinimumPhotoCount")
    public void setMinimumPhotoCount(Integer minimumPhotoCount) {
        this.minimumPhotoCount = minimumPhotoCount;
    }

    @JsonProperty("OriginalPrice")
    public Integer getOriginalPrice() {
        return originalPrice;
    }

    @JsonProperty("OriginalPrice")
    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    @JsonProperty("Recommended")
    public Boolean getRecommended() {
        return recommended;
    }

    @JsonProperty("Recommended")
    public void setRecommended(Boolean recommended) {
        this.recommended = recommended;
    }


}
