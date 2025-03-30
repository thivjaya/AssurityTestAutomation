package nz.co.assurity.API.responseData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListingFeeTier {

    @JsonProperty("MinimumTierPrice")
    private Integer minimumTierPrice;
    @JsonProperty("FixedFee")
    private Integer fixedFee;

    @JsonProperty("MinimumTierPrice")
    public Integer getMinimumTierPrice() {
        return minimumTierPrice;
    }

    @JsonProperty("MinimumTierPrice")
    public void setMinimumTierPrice(Integer minimumTierPrice) {
        this.minimumTierPrice = minimumTierPrice;
    }

    @JsonProperty("FixedFee")
    public Integer getFixedFee() {
        return fixedFee;
    }

    @JsonProperty("FixedFee")
    public void setFixedFee(Integer fixedFee) {
        this.fixedFee = fixedFee;
    }

}

