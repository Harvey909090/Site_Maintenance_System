package Site;

import DataConnection.ConnectionClass;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class SiteDetailsHandling {
   
    private static ArrayList<SiteDetails> sitelist = new ArrayList();
    /* Loading the data from database*/
    public static boolean Load() 
    {
         if(!sitelist.isEmpty())
            return false;
        ResultSet resultSet = ConnectionClass.selectQuery("select * from site;");
        try{
            while(resultSet.next()){
            sitelist.add(new SiteDetails(Integer.parseInt(resultSet.getObject(1).toString()), 
                    resultSet.getObject(2).toString(), 
                    resultSet.getObject(3).toString(), 
                    resultSet.getString(4), 
                    resultSet.getString(5)));
            }
            System.out.println("loaded with size of " + sitelist.size());
        }catch(SQLException e){
            e.getMessage();
        }
        return true;
        
      } 
    /* Saving data in database*/
    public static void Save(SiteDetails dt) {       
         try {
        // unique(dt); (sr, attndnc, work, assignTime, assignStatus)"
         ConnectionClass.query("insert into dailywork " +
                 "values ("+ dt.getId()+", '"
                 + dt.getAttndnc()+"', '"
                 +dt.getWork()+"', '"
                 +dt.getAssignDate()+"', '"
                 +dt.getAssignStatus()+"');");
         sitelist.add(dt);
         }catch(IllegalArgumentException e){
             e.getMessage();
            throw new IllegalArgumentException("Employee Against this id don't exist");
        }
     }
      /* Deleting single data from database*/
    public static void DeleteRecord(SiteDetails dt)
   {
       try {
       Load();    
       ConnectionClass.query("DELETE FROM sites WHERE sr = "+ dt.getId() + ";");
       }catch(Exception e)
       {
        throw new IllegalArgumentException(e.getMessage());
       } 
   }
    /* Deleting the whole data from database*/
    public static void DeleteAllData(SiteDetails dt)
   {
       try {
       Load();
       for (int i = 0; i< sitelist.size(); i++){
       ConnectionClass.query("DELETE FROM engineers WHERE sr = "+ sitelist.get(i).getId() + ";");
       }
       }catch(Exception e)
       {
         throw new IllegalArgumentException(e.getMessage());
       }
       
   }
    /* Cleaning the ArrayList*/
    public static void arrayDispose()
    {
        sitelist.clear();
    }
   /* Getting the data in ArrayList*/
    public static ArrayList<SiteDetails> getArray()
   {
       return sitelist;
   }
    /* Updating data in database*/  
    public static void UpdateRecord(SiteDetails dt)
   {
       try {
       Load();
       ConnectionClass.query("UPDATE dailywork SET attndnc = '" + dt.getAttndnc()  
               + "',work = '"
               + dt.getWork() 
               + "'WHERE sr = " 
               + dt.getId() +" ;");
       }catch(Exception e)
       {
          throw new IllegalArgumentException(e.getMessage());
       }         
   }   
}