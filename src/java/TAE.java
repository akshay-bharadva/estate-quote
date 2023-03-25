
import com.logical.connection.MySQLUtility;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.jdbc.support.rowset.SqlRowSet;


/**
 *
 * @author Akshay
 */
public class TAE {

    public static void main(String[] args) {
        MySQLUtility mySql = new MySQLUtility();

        try {
            SqlRowSet set = mySql.getRowSet("Select id,name,country_id From states limit 10");

            while (set.next()) {
//                System.out.println(set.getString("inquiryid"));
//                System.out.println(set.getString("firstname"));
//                System.out.println(set.getString("lastname"));
//                System.out.println(set.getString("dob"));
//                System.out.println(set.getString("address"));
//                System.out.println(set.getString("state"));
//                System.out.println(set.getString("city"));
//                System.out.println(set.getString("pincode"));
//                System.out.println(set.getInt("carpetarea"));
//                System.out.println(set.getInt("year"));
//                System.out.println(set.getString("roof"));
//                System.out.println(set.getString("floor"));
//                System.out.println(set.getInt("firesafety"));
                System.out.print(set.getInt("id"));
                System.out.print(set.getString("name"));
                System.out.println(set.getInt("country_id"));
                System.out.println("===========================");

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TAE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TAE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
