import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class CurrencyConverter {

    private static final String API_KEY = "780f8bb466352e828a85178f";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/";

    public static void main(String[] args) {
        String baseCurrency = getUserInput("Enter the base currency (e.g., USD): ");
        String targetCurrency = getUserInput("Enter the target currency (e.g., EUR): ");
        double amount = Double.parseDouble(getUserInput("Enter the amount to convert: "));

        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);
        if (exchangeRate != -1) {
            double convertedAmount = amount * exchangeRate;
            System.out.printf("Converted Amount: %.2f %s\n", convertedAmount, targetCurrency);
        } else {
            System.out.println("Currency conversion failed.");
        }
    }

    private static String getUserInput(String prompt) {
        System.out.print(prompt);
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return reader.readLine();
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
            return "";
        }
    }

    private static double getExchangeRate(String base, String target) {
        try {
            String url = API_URL + API_KEY + "/latest/" + base;
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            JSONObject jsonResponse = new JSONObject(response.toString());
            return jsonResponse.getJSONObject("conversion_rates").getDouble(target);
        } catch (Exception e) {
            System.out.println("Error fetching exchange rates: " + e.getMessage());
            return -1;
        }
    }
}