import helper.DataProviderHelper;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import spec.ResponseSpec;

import java.util.Map;

import static org.junit.Assert.assertTrue;

public class SearchApiTest extends BaseServiceTest{

    @Test (dataProvider = "artistName",dataProviderClass = DataProviderHelper.class)
    public void searchItems(String artistName){

        Map<String, Object> searchParams = requestMaps.searchParamsMap(artistName , "artist" , "TR","1");
        Response searchResponse = searchService.search(headers,searchParams,ResponseSpec.checkStatusCodeOk());

        boolean isQuery = searchService.getTrackItems(searchResponse).contains(artistName);
        assertTrue(isQuery);

        String artistUri = searchService.getArtistUri(searchResponse);

    }
}
