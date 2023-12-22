package CADO;

import java.math.BigDecimal;
import java.sql.*;

public class CADO {
    Connection cnx=null;

    public Connection Conexion() throws Exception {
        String strHost;
        String strPort;
        String strDatabase;
        String strUser;
        String strPassword;
        String strCadenaConexion;
        try {
            strHost = "localhost";
            strPort = "5432";
            strDatabase = "Rectorado";
            strUser = "postgres";
            strPassword = "postgres";
            strCadenaConexion = "jdbc:postgresql://" + strHost + ":" + strPort + "/" + strDatabase;
            Class.forName("org.postgresql.Driver");
            cnx = DriverManager.getConnection(strCadenaConexion, strUser, strPassword);
            return cnx;
        } catch (Exception ex) {
            throw new Exception("ERROR ===> " + ex.getMessage());
        }
    }

    public boolean CerrarSeccion () throws Exception{
        try {
            cnx.close();
            return true;
        } catch (Exception e) {
           throw e;
        }
    }

    public boolean EjecutaProc(String call, Object param[]) throws Exception {
        CallableStatement ca;
        try {
            ca = Conexion().prepareCall(call);
            for (int x = 0; x < param.length; x++) {

                if (param[x].getClass().toString().equals("class java.lang.String")) {
                    ca.setString(x + 1, param[x].toString());
                }
                if (param[x].getClass().toString().equals("class java.lang.Integer")) {
                    ca.setInt(x + 1, Integer.parseInt(param[x].toString()));
                }
                if (param[x].getClass().toString().equals("class java.lang.Double")) {
                    ca.setDouble(x + 1, Double.parseDouble(param[x].toString()));
                }
                if (param[x].getClass().toString().equals("class java.lang.Float")) {
                    ca.setFloat(x + 1, Float.parseFloat(param[x].toString()));
                }
                if (param[x].getClass().toString().equals("class java.math.BigDecimal")) {
                    ca.setBigDecimal(x + 1, new BigDecimal(param[x].toString()));
                }
                if (param[x].getClass().toString().equals("class java.lang.Boolean")) {
                    ca.setBoolean(x + 1, Boolean.parseBoolean(param[x].toString()));
                }
                if (param[x].getClass().toString().equals("class java.sql.Date")) {
                    ca.setDate(x + 1, Date.valueOf(param[x].toString()));
                }
            }

            ResultSet rs = ca.executeQuery();
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }

    }

    public ResultSet RecuperaProc(String call) throws Exception {
        CallableStatement ca;
        ResultSet rs;
        try {
            ca = Conexion().prepareCall(call, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = ca.executeQuery();
            return rs;
        } catch (Exception ex) {
            return null;
        }finally{
            CerrarSeccion();
        }
    }

    public ResultSet RecuperaProc(String call, Object param[]) throws Exception {
        CallableStatement ca;
        ResultSet rs;
        try {
            ca = Conexion().prepareCall(call, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            for (int x = 0; x < param.length; x++) {
                if (param[x].getClass().toString().equals("class java.lang.String")) {
                    ca.setString(x + 1, param[x].toString());
                }
                if (param[x].getClass().toString().equals("class java.lang.Integer")) {
                    ca.setInt(x + 1, Integer.parseInt(param[x].toString()));
                }
                if (param[x].getClass().toString().equals("class java.lang.Double")) {
                    ca.setDouble(x + 1, Double.parseDouble(param[x].toString()));
                }
                if (param[x].getClass().toString().equals("class java.lang.Float")) {
                    ca.setFloat(x + 1, Float.parseFloat(param[x].toString()));
                }
                if (param[x].getClass().toString().equals("class java.lang.Boolean")) {
                    ca.setBoolean(x + 1, Boolean.parseBoolean(param[x].toString()));
                }
                if (param[x].getClass().toString().equals("class java.sql.Date")) {
                    ca.setDate(x + 1, Date.valueOf(param[x].toString()));
                }
            }
            rs = ca.executeQuery();
            return rs;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }finally{
            CerrarSeccion();
        }
    }

}
