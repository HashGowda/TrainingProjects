
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotelAuthenticationTest {

    @Test
    public void hotelAAuthentication() {
        // Logic for hotel A authentication (one level)
        String hotel = "A";
        String authenticationLevel = getAuthenticationLevel(hotel);
        Assert.assertEquals(authenticationLevel, "One level");
    }

    @Test
    public void hotelBAuthentication() {
        // Logic for hotel B authentication (two levels)
        String hotel = "B";
        String authenticationLevel = getAuthenticationLevel(hotel);
        Assert.assertEquals(authenticationLevel, "Two levels");
    }

    @Test
    public void hotelCAuthentication() {
        // Logic for hotel C authentication (one level)
        String hotel = "C";
        String authenticationLevel = getAuthenticationLevel(hotel);
        Assert.assertEquals(authenticationLevel, "One level");
    }

    private String getAuthenticationLevel(String hotel) {
        // Logic to retrieve the authentication level for the given hotel
        String authenticationLevel = "";
        switch (hotel) {
            case "A":
                authenticationLevel = "One level";
                break;
            case "B":
                authenticationLevel = "Two levels";
                break;
            case "C":
                authenticationLevel = "One level";
                break;
        }
        return authenticationLevel;
    }
}

