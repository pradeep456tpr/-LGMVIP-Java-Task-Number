// CurrencyConversionServlet.java
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CurrencyConversionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String sourceCurrency = request.getParameter("sourceCurrency");
        String targetCurrency = request.getParameter("targetCurrency");
        double amount = Double.parseDouble(request.getParameter("amount"));

        // Call a currency exchange rate API to fetch the latest exchange rate
        double exchangeRate = fetchExchangeRate(sourceCurrency, targetCurrency);

        // Perform the currency conversion calculation
        double convertedAmount = amount * exchangeRate;

        // Prepare the response with the converted amount
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Currency Conversion Result</h2>");
        out.println("Source Currency: " + sourceCurrency + "<br>");
        out.println("Target Currency: " + targetCurrency + "<br>");
        out.println("Amount: " + amount + "<br>");
        out.println("Converted Amount: " + convertedAmount + "<br>");
        out.println("</body></html>");
    }

    private double fetchExchangeRate(String sourceCurrency, String targetCurrency) {
        // Implement code to fetch the exchange rate using a currency exchange rate API
        // You can use libraries like HttpURLConnection or OkHttp to make HTTP requests
        // Parse the response and extract the exchange rate
        // Return the exchange rate as a double
        return 0.0; // Replace with actual implementation
    }
}
