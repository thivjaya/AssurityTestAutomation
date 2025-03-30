package nz.co.assurity.API.responseData;

import com.fasterxml.jackson.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fees {

    @JsonProperty("Bundle")
    private Integer bundle;
    @JsonProperty("EndDate")
    private Double endDate;
    @JsonProperty("Feature")
    private Integer feature;
    @JsonProperty("Gallery")
    private Integer gallery;
    @JsonProperty("Listing")
    private Integer listing;
    @JsonProperty("Reserve")
    private Double reserve;
    @JsonProperty("Subtitle")
    private Double subtitle;
    @JsonProperty("TenDays")
    private Double tenDays;
    @JsonProperty("ListingFeeTiers")
    private List<ListingFeeTier> listingFeeTiers;
    @JsonProperty("SecondCategory")
    private Double secondCategory;

    @JsonProperty("Bundle")
    public Integer getBundle() {
        return bundle;
    }

    @JsonProperty("Bundle")
    public void setBundle(Integer bundle) {
        this.bundle = bundle;
    }

    @JsonProperty("EndDate")
    public Double getEndDate() {
        return endDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(Double endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("Feature")
    public Integer getFeature() {
        return feature;
    }

    @JsonProperty("Feature")
    public void setFeature(Integer feature) {
        this.feature = feature;
    }

    @JsonProperty("Gallery")
    public Integer getGallery() {
        return gallery;
    }

    @JsonProperty("Gallery")
    public void setGallery(Integer gallery) {
        this.gallery = gallery;
    }

    @JsonProperty("Listing")
    public Integer getListing() {
        return listing;
    }

    @JsonProperty("Listing")
    public void setListing(Integer listing) {
        this.listing = listing;
    }

    @JsonProperty("Reserve")
    public Double getReserve() {
        return reserve;
    }

    @JsonProperty("Reserve")
    public void setReserve(Double reserve) {
        this.reserve = reserve;
    }

    @JsonProperty("Subtitle")
    public Double getSubtitle() {
        return subtitle;
    }

    @JsonProperty("Subtitle")
    public void setSubtitle(Double subtitle) {
        this.subtitle = subtitle;
    }

    @JsonProperty("TenDays")
    public Double getTenDays() {
        return tenDays;
    }

    @JsonProperty("TenDays")
    public void setTenDays(Double tenDays) {
        this.tenDays = tenDays;
    }

    @JsonProperty("ListingFeeTiers")
    public List<ListingFeeTier> getListingFeeTiers() {
        return listingFeeTiers;
    }

    @JsonProperty("ListingFeeTiers")
    public void setListingFeeTiers(List<ListingFeeTier> listingFeeTiers) {
        this.listingFeeTiers = listingFeeTiers;
    }

    @JsonProperty("SecondCategory")
    public Double getSecondCategory() {
        return secondCategory;
    }

    @JsonProperty("SecondCategory")
    public void setSecondCategory(Double secondCategory) {
        this.secondCategory = secondCategory;
    }

}
