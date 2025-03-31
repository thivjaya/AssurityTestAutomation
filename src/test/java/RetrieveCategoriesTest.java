import io.restassured.RestAssured;
import io.restassured.response.Response;
import nz.co.assurity.API.responseData.Category;
import nz.co.assurity.API.responseData.Promotion;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RetrieveCategoriesTest extends BaseTest {

    /**
     *
     * @param categoryId
     * This test verify the functionality of get category end point.
     * Category ID is passed through the testng xml
     * Response is deserialized and mapped to the Category class to easy validation of response fields
     */
    @Test
    @Parameters("categoryId")
    public void testVerifyCategoryName(String categoryId) {
        Response response = RestAssured.given().log().all().spec(specification).queryParam("catalogue", false)
                .pathParam("categoryID", categoryId)
                .when().get(apiGetCategory);
        Category category = response.as(Category.class);
        Assert.assertEquals(category.getName(), "Carbon credits", "Category Name does not match\n");
        Assert.assertEquals(category.getCanRelist(), true, "Relisting cannot be done");
        for (Promotion promotion : category.getPromotions()) {
            if (promotion.getName().equals("Gallery"))
                Assert.assertEquals(promotion.getDescription(), "Good position in category", "Description of the promotion does not match\n");
        }
    }

}
