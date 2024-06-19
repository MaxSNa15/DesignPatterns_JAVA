import Connection.ConnectDB;
import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        Connection conn = ConnectDB.getConnection();

        String query = "SELECT * FROM prueba";

        try {
            Statement st;
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id_ctr = rs.getInt("idprueba");
                String name = rs.getString("name");
                String last_name = rs.getString("last");
                // Print the result
                /*
                 * las %s son para indicar que se va a imprimir un string, si fuera un int se usa %d
                 */
                System.out.format("%d, %s, %s\n", 
                        id_ctr, name, last_name);
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta");
            System.out.println(e.getMessage());
        }
    }
}
