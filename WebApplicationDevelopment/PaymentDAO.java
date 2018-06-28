public interface PaymentDAO{
    public Double findSalesAmountByDate(java.util.Date paymentDate)
        throws PaymentFinderException, SQLException;
}

public class PaymentDAOImpl implements PaymentDAO {
    public Double findSalesAmountByDate(java.util.Date paymentDate)
        throws PaymentFinderException, SQLException {
            // Assume using mySQL and JDBC, get JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // Connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oabs?useSSL=false", "root", "password");
            // Create Preparestatement
            String searchByDate = "SELECT SUM(amount) FROM payment WHERE date = ?";
            sqlQuery = con.preparestatement(searchByDate);
            sqlQuery.setTimestamp(1, new java.sql.Timestamp(paymentDate.getTime()));
            // Query
            ResultSet rs = sqlQuery.executeQuery();
            // Get the double value from the first column
            Double amount = rs.getDouble(0);
            return amount;
        }
}