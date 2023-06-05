package dev.currencydata.currencydataapi.service;

import dev.currencydata.currencydataapi.api.model.Currency;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {
    public Currency getCurrency(int id) {
        return null;
    }

    public Currency getCurrency(String name) {
        return null;
    }

    public Iterable<Currency> getCurrencies() {
        return null;
    }

    public Currency getCurrencyCodes() {
        return null;
    }

//    public static void mapGamesToDatabase() {
//
//        try {
//            // Establish connection to the H2 database
//            Connection connection = DriverManager.getConnection("jdbc:h2:file:~/springboot", "", "");
//
//            // Read the JSON file
//            JSONParser jsonParser = new JSONParser();
//
//            FileReader currencyJson = new FileReader("src/main/dev/currencydata/currencydataapi/_data/currencies.json");
//            JSONArray currenciesJsonArray = (JSONArray) jsonParser.parse(currencyJson);
//
//            List currenciesArray = new ArrayList<>();
//
//            for (int i = 0; i < currencyJson.size(); i++) {
//                var currency = currencyJson.get(i);
//                currenciesArray.add(currency);
//            }
//
//            System.out.println(currenciesArray);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
