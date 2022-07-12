package New_Engineer_Pane;

import DataConnection.ConnectionClass;
import Login.LoginHandling;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class EngineerHandling {
    
    private static ArrayList<EngineerInfo> pi = new ArrayList();
    public static boolean Load() 
     {
         if(!pi.isEmpty())
            return false;
        
        ResultSet resultSet = ConnectionClass.selectQuery("select * from personalinfo;");
                       
        try{
            while(resultSet.next()){
            pi.add(new EngineerInfo(Integer.parseInt(resultSet.getObject(1).toString()), resultSet.getObject(2).toString(), 
                     resultSet.getObject(3).toString(),resultSet.getObject(4).toString(), resultSet.getObject(5).toString(), 
                    resultSet.getObject(6).toString(),resultSet.getObject(7).toString(), resultSet.getObject(8).toString()
                    , resultSet.getObject(9).toString(), resultSet.getBytes(10), resultSet.getObject(11).toString(),
                    Double.parseDouble(resultSet.getObject(12).toString()), resultSet.getObject(13).toString()));
            }
            System.out.println("loaded with size of " + pi.size());
        }catch(SQLException e){
        }
        return true;
        
         }
     public static int EngineerID()
     {
         if (!pi.isEmpty())
             return pi.get(pi.size()-1).getId()+1;
         else
             return 1;
     
     }
     
     public static void Save(EngineerInfo pi1) throws SQLException 
     {       
        try {
             
         unique(pi1);
        PreparedStatement ps=  ConnectionClass.getPreStatement("insert into Engineers(id, name, phone, cnic, emrgnc_name, emrgnc_phone, address, dob, email, emp_pic, post, salary, timing)" +
                 "values ( ?,?,?,?,?,?,?,?,?,?,?,?,? )");
         ps.setInt(1, pi1.getId());
         ps.setString(2, pi1.getName());
         ps.setString(3, pi1.getPhone());
         ps.setString(4, pi1.getCnic());
         ps.setString(5, pi1.geteName());
         ps.setString(6, pi1.getePhone());
         ps.setString(7, pi1.getAddress());
         ps.setString(8, pi1.getDob());
         ps.setString(9, pi1.getEmail());
         ps.setBytes(10, pi1.getPic());
         ps.setString(11,pi1.getPost());
         ps.setDouble(12, pi1.getSalary());
         ps.setString(13, pi1.getTiming());

         ps.execute();
         }catch(IllegalArgumentException e){
           
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }
               
     }
     
     public static void unique(EngineerInfo pi1)
     {
         for (int i = 0; i < pi.size(); i ++)
         {
             if (pi1.getId() == pi.get(i).getId())
                  throw new IllegalArgumentException("Record against this ID '"+pi1.getId()+"' is already exist ");    
         }
     }
     
    public static void arrayDispose()
    {
        pi.clear();
    }
    
    public static EngineerInfo searchByID(int id)
    {
        try
        {
            Load();       
            for(int i=0; i<pi.size(); i++)
                if(pi.get(i).getId()==id)
                    return pi.get(i);
            
        }catch(Exception e){
        }
        return null;        
    }
    
    public static ArrayList<EngineerInfo> search(String search) 
    {
        Load();
        ArrayList<EngineerInfo> send = new ArrayList();
        
        for (int i = 0; i < pi.size(); i++)
        {
            if (String.valueOf(pi.get(i).getId()).toUpperCase().contains(search.toUpperCase()))
                send.add(pi.get(i));
            else if (pi.get(i).getName().toUpperCase().contains(search.toUpperCase()))
                send.add(pi.get(i));
            else if (String.valueOf(pi.get(i).getPhone()).toUpperCase().contains(search.toUpperCase()))
                send.add(pi.get(i));
        }
        arrayDispose();
        return send;
        
    }
   public static ArrayList<EngineerInfo> getArray()
   {
       return pi;
   }
   
   public static void UpdateRecord(EngineerInfo pi1)
   {
       try {
       
       Load();
       
       PreparedStatement ps=  ConnectionClass.getPreStatement("Update personalinfo SET name = ?, phone = ? , cnic = ?, "
               + "emrgnc_name = ?, emrgnc_phone = ? , address = ? , dob = ?, email = ?, emp_pic = ? , post = ?, salary = ?, timing = ? where id = "+pi1.getId());
         
         ps.setString(1, pi1.getName());
         ps.setString(2, pi1.getPhone());
         ps.setString(3, pi1.getCnic());
         ps.setString(4, pi1.geteName());
         ps.setString(5, pi1.getePhone());
         ps.setString(6, pi1.getAddress());
         ps.setString(7, pi1.getDob());
         ps.setString(8, pi1.getEmail());
         ps.setBytes(9, pi1.getPic());
         ps.setString(10,pi1.getPost());
         ps.setDouble(11, pi1.getSalary());
         ps.setString(12, pi1.getTiming());

         ps.execute();
         
         for(int i=0; i<pi.size(); i++)
             if(pi.get(i).getId() == pi1.getId())
             {
                 pi.set(i, pi1);
                 break;
             }
         
         }catch(SQLException e){
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }

         
   }
   
   public static void DeleteRecord(EngineerInfo pi1)
   {
       try {

            LoginHandling.DeleteRecord(pi1.getId());
            ConnectionClass.query("DELETE FROM personalinfo WHERE id = "+ pi1.getId() + ";");
      
       for(int i=0; i<pi.size(); i++)
           if(pi.get(i).getId() == pi1.getId())
           {
               pi.remove(i);
               break;
           }
       
       }catch(Exception e)
       {
            throw new IllegalArgumentException(e.getMessage());
       }      
      
   }
   public static void DeleteAllData(EngineerInfo pi1)
   {
       try {
       Load();
       for (int i = 0; i< pi.size(); i++){
       ConnectionClass.query("DELETE FROM personalinfo WHERE id = "+ pi.get(i).getId() + ";");
       }
       }catch(Exception e)
       {
            throw new IllegalArgumentException(e.getMessage());
       }
       
   }
 }