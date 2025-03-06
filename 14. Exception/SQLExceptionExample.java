import java.sql.*;

class SQLExceptionExample {
    public static void main(String[] args) throws SQLException {
        throw new SQLException("Database error occurred");
    }
}
