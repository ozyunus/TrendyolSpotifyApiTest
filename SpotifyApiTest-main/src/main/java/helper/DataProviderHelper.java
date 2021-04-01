package helper;
import org.testng.annotations.DataProvider;

public class DataProviderHelper {

    @DataProvider(name = "artistName")
    public Object[][] createArtistName() {

        return new Object[][]{
                {"Tarkan"},

        };
    }
}
