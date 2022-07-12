package Upload_engineer_details;

import DataConnection.ConnectionClass;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UploadHandling {
 
    private static ArrayList<Upload_engineer_details>upload = new ArrayList();
    
    public static boolean load()
   {
       if (!upload.isEmpty())
            return false;
        
        ResultSet resultSet = ConnectionClass.selectQuery("SELECT * FROM site_maintenance.uploadsite;");
        
        if(resultSet == null)
            return false;
        
         try{
            while(resultSet.next()){
                
              upload.add(new Upload_engineer_details(Integer.parseInt(resultSet.getObject(1).toString()),resultSet.getObject(2).toString(),
                      resultSet.getObject(3).toString(),resultSet.getObject(4).toString(), resultSet.getObject(5).toString(), 
                      resultSet.getObject(6).toString()));
            }
            System.out.println("loaded with size of " + upload.size());
        }catch(SQLException e){
        }
       return true;
   }
     
     
       public static void save(Upload_engineer_details up)
   {
       try {
           
        uniqueCheck(up);
       ConnectionClass.query("Insert into upload_engineer_details ( id, description, upload_date, developer_name, designer_name, game_link)\n" + "values ( "+up.getSiteid()+ 
               ",'"+ up.getSiteDescription()+"', '"
               + up.getUploadDate()+"','" + up.getEngineerName()+ "', '" +up.getSiteName()+"', '" + up.getSiteLink() + "' );");
       upload.add(up);
       
        }catch(IllegalArgumentException e){
            throw new IllegalArgumentException(e.getMessage());
        }
            
   } 
       
        private static void uniqueCheck(Upload_engineer_details up)
    {
        for(int i=0; i<upload.size(); i++)
        {
            if(up.getSiteid() == upload.get(i).getSiteid())
                throw new IllegalArgumentException("Record against this id '"+ up.getSiteid() +"' already exist ");            
        }
    }
        
        public static void DeleteRecord( Upload_engineer_details up)
   {
       try {
       load();
             
       ConnectionClass.query("DELETE FROM upload_engineer_details WHERE id = "+ up.getSiteid()+ ";");
      
       }catch(Exception e)
       {
            throw new IllegalArgumentException(e.getMessage());
       }
   }
   
   public static ArrayList<Upload_engineer_details> search(String search) 
    {
        load();
        ArrayList<Upload_engineer_details> send = new ArrayList();
        
        for (int i = 0; i < upload.size(); i++)
        {
            if (String.valueOf(upload.get(i).getSiteid()).toUpperCase().contains(search.toUpperCase()))
                send.add(upload.get(i));
            else if (upload.get(i).getSiteName().toUpperCase().contains(search.toUpperCase()))
                send.add(upload.get(i));
            else if (upload.get(i).getEngineerName().toUpperCase().contains(search.toUpperCase()))
                send.add(upload.get(i));
            else if (upload.get(i).getSiteDescription().toUpperCase().contains(search.toUpperCase()))
                send.add(upload.get(i));
            else if (String.valueOf(upload.get(i).getUploadDate()).toUpperCase().contains(search.toUpperCase()))
                send.add(upload.get(i)); 
           
        }
        arrayDispose();
        return send;
        
    }
     public static void arrayDispose()
    {
        upload.clear();
    }
    
     
     public static void UpdateRecord(Upload_engineer_details up)
   {
       try {
       
       load();
     
       ConnectionClass.query("UPDATE upload_engineer_details SET description = '" + up.getSiteDescription()+ "', upload_date = '"+ up.getUploadDate()+
               "', developer_date = '"+ up.getEngineerName() + "', designer_name = '" + up.getSiteName() + "', site_link = '" + up.getSiteLink()
               + " ' WHERE id = " + up.getSiteid() +" ;");
       
       }catch(Exception e)
       {
          throw new IllegalArgumentException(e.getMessage());
       }
         
   }
        public static ArrayList<Upload_engineer_details> getArray()
   {
       return upload;
   }    
}