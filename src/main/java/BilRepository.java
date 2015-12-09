import java.sql.*;

/**
 * Created by christerhansen on 09.12.15.
 */
public class BilRepository {
    Connection con;

    public BilRepository(){
        try {
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:8889/person", "www", "www");
        }
        catch(SQLException ex){
            System.out.println("klarte ikke koble til MySQL database");
            ex.printStackTrace();
        }
    }

    public void save(Bil bil){
        try {
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO bil (regnr, effekt, anthjul, antdorer) VALUES (?, ?, ?, ?)");
            pstmt.setString(1, bil.getRegNr());
            pstmt.setString(2, bil.getEffekt());
            pstmt.setInt(3, bil.getAntHjul());
            pstmt.setInt(4, bil.getAntDorer());
            pstmt.execute();
        }
        catch(SQLException ex){
            System.out.println("Feil i insert query.");
        }
    }

    public Bil getBilByRegNr(String regNr){
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM bil WHERE regnr = ?");
            pstmt.setString(1, regNr);
            ResultSet rs = pstmt.executeQuery();
            rs.next();

            return new Bil(rs.getString("regnr"), rs.getString("effekt"), rs.getInt("anthjul"), rs.getInt("antdorer"));
        }
        catch(SQLException ex){
            System.out.println("feil i spørring");
            ex.printStackTrace();
        }
        return null;
    }
}
