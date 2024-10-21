# Currency Converter

## Description
A simple console-based currency converter application that allows users to convert an amount from one currency to another using real-time exchange rates fetched from the ExchangeRate-API. Users can select their base currency and target currency, input the amount they want to convert, and receive the converted amount displayed in the target currency.

## Features
- User-friendly interface for inputting currency details.
- Fetches real-time exchange rates from the ExchangeRate-API.
- Converts the input amount based on the selected currencies.
- Displays the converted amount along with the target currency symbol.

## Technologies Used
- Java
- JSON for parsing API responses
- ExchangeRate-API for fetching exchange rates

## Requirements
- JDK 8 or higher
- Internet connection for fetching exchange rates
- [org.json](https://mvnrepository.com/artifact/org.json/json) library for JSON parsing (add to your project)

## Getting Started

### Step 1: Obtain API Key
1. Visit [ExchangeRate-API](https://www.exchangerate-api.com/).
2. Sign up for a free account and confirm your email.
3. After logging in, locate your API key on the dashboard.

### Step 2: Clone the Repository
```bash
git clone https://github.com/PriyantNikhare/CODSOFT.git
cd Task/TASK4_CURRENCY_CONVERTER
```

### Step 3: Update API Key
- Open `CurrencyConverter.java` and replace `"YOUR_API_KEY"` with your actual API key.

### Step 4: Compile and Run the Application
```bash
javac CurrencyConverter.java
java CurrencyConverter
```

### Example Usage
1. When prompted, enter the base currency (e.g., USD).
2. Enter the target currency (e.g., EUR).
3. Input the amount you want to convert.
4. The application will display the converted amount.

```
Enter the base currency (e.g., USD): USD
Enter the target currency (e.g., EUR): EUR
Enter the amount to convert: 100
Converted Amount: 85.00 EUR
```

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing
Contributions are welcome! Please feel free to submit a pull request or open an issue if you have suggestions or improvements.

## Acknowledgments
- [ExchangeRate-API](https://www.exchangerate-api.com/) for providing exchange rates.
- [org.json](https://mvnrepository.com/artifact/org.json/json) for JSON parsing in Java.

## Contact

For any questions or suggestions, feel free to reach out:

- GitHub: [Priyant Prashant Nikhare](https://github.com/PriyantNikhare)
- Email: priyant.p.nikhare@gmail.com
