import java.util.HashMap;
import java.util.Map;

public class RequestMaps {


    public Map<String,Object> headersMap(){
        String token = "BQA_12n131w-nG2Xwl-fo_QBpnMZpWBO03LzWo8tzFBHDy1S3A3s3pmQG_oUHOdlpG62YXu8ByL1lSsr-0RgCn2ogN9wcVf0e4ANnCvj8Wk2ZVjfNTZTTvwlj1_EFxDKuYFenkReHn05aC5iy4bQTionDmp7kUj8cGNzgPiO91vmEeSFxdxVRnHOAhx3EpjzkkZxeSvIpMdTjyCJhtc55nYae8NziU8Y5n1tqFxqMEo0oKrhg23l-mkrZfFYsZM0LPZ_-zmzvNDeERF_-VueHrSq7sbj59-QjaPeU5ZN";
        Map<String, Object> headers = new HashMap<>();
        headers.put("Content-Type" , "application/json; charset=UTF-8");
        headers.put("Authorization", "Bearer " + token);
        return headers;
    }

    public Map<String,Object> getPlaylistByIdParamsMap(String playlistId){
        Map<String, Object> params = new HashMap<>();
        params.put("playlist_id", playlistId);
        return params;
    }
    public Map<String,Object> searchParamsMap(String trackName, String type, String market, String limit){
        Map<String, Object> params = new HashMap<>();
        params.put("q",trackName);
        params.put("type", type);
        params.put("market", market);
        params.put("limit",limit);
        return params;
    }


    public Map<String,Object> addItemsToPlaylistParamsMap(String playlistId, String trackUri){
        Map<String, Object> params = new HashMap<>();
        params.put("playlist_id", playlistId);
        params.put("uris",trackUri);
        return params;
    }
    public Map<String,Object> getAPlaylistItemsParamsMap(String playlistId){
        Map<String, Object> params = new HashMap<>();
        params.put("playlist_id", playlistId);
        params.put("market", "TR");
        params.put("limit", "1");
        return params;
    }


}
