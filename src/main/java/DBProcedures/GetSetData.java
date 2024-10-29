/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBProcedures;
import Connection.DataBaseConnection;
import com.mycompany.project1db.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author chedr
 */
public class GetSetData {
    CallableStatement stmt = null;
    public GetSetData(){
    }
    public ArrayList<GenderType> getGenderTypes(){
        ArrayList<GenderType> List = new ArrayList<>();
        DataBaseConnection connection = new DataBaseConnection();
        try (ResultSet result = connection.getConn().prepareCall("{CALL getGener()}").executeQuery()) {
            while(result.next()){
                GenderType gender = new GenderType(result.getString("GENDERTYPE"));
                List.add(gender);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetSetData.class.getName()).log(Level.SEVERE, null, ex);
        }
        connection.desconectar();
        return List;
    }
    public void insertDisability(String disabilityName){
        
        DataBaseConnection connection = new DataBaseConnection();
        try {
            stmt = connection.getConn().prepareCall("{CALL AddDisability(?)}");
            stmt.setString(1, disabilityName);
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(GetSetData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
