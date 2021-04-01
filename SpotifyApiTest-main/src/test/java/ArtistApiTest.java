import io.restassured.response.Response;
import org.testng.annotations.Test;
import spec.ResponseSpec;

import java.io.IOException;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class ArtistApiTest extends  BaseServiceTest{


        @Test
        public void artistPlaylistTest() throws IOException {


            String body = helper.getPlayListBody("playlist" , "artistUri" , true);
            Response playlistResponse = playlistService.createPlayList(headers,body, "Tarkan", ResponseSpec.checkStatusCreated());

            String myPlayListId = playlistService.getCreatedPlayListId(playlistResponse);

            Map<String, Object> playlistByIdParams = requestMaps.getPlaylistByIdParamsMap(myPlayListId);
            Response itemsPlayListResponse = playlistService.getAPlaylistItems(headers,playlistByIdParams,myPlayListId,ResponseSpec.checkStatusCodeOk());


    }
}
