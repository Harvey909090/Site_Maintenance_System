package Update_Salary;

import DataConnection.ConnectionClass;
import Salary.SalarySlipDetail;
import New_Engineer_Pane.EngineerHandling;
import New_Engineer_Pane.EngineerInfo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SalaryHandling {
    
    private static ArrayList<Salary_Class> ss = new ArrayList<>();
    
     public static boolean Load() 
     {
         if(!ss.isEmpty())
            return false;
        
        ResultSet resultSet = ConnectionClass.selectQuery("select * from salary;");
                       
        try{
            while(resultSet.next()){
            ss.add(new Salary_Class(Integer.parseInt(resultSet.getObject(1).toString()), resultSet.getObject(2).toString(), 
                   resultSet.getObject(3).toString(),resultSet.getObject(4).toString(), Integer.parseInt(resultSet.getObject(5).toString()), 
                   Double.parseDouble(resultSet.getObject(6).toString()), Double.parseDouble(resultSet.getObject(7).toString()), 
                   Double.parseDouble(resultSet.getObject(8).toString()),resultSet.getObject(9).toString()));
            }
            System.out.println("loaded with size of " + ss.size());
        }catch(SQLException e){
        }
        return true;
        
         }     
     
     public static void Save(Salary_Class ssc) 
     {       
        try {
             EngineerInfo personalInfo = EngineerHandling.searchByID(ssc.getId());
             
             if(personalInfo==null)
                 throw new IllegalArgumentException("No Record Found Against ID " + ssc.getId());
             
             ssc.setNetSalary(personalInfo.getSalary());
             ssc.setName(personalInfo.getName());
            ssc.setPost(personalInfo.getPost());
            
            ConnectionClass.query("insert into salary(sr, name, post, month, days, advance, deduction, net_salary, date, gross_salary)" +
                 "values ("+ ssc.getId()+", '"+ ssc.getName()+"', '"+ ssc.getPost() +"', '"+ssc.getMonthName() +"', "+ ssc.getTotalWorkingDays()+","+ ssc.getAdvance()+
                 ", "+ ssc.getDeduction() +" , " + ssc.getNetSalary() + " ,'" + ssc.getDate() + "' , " + ssc.getGross() +");");
            
            ss.add(ssc);
            new SalarySlipDetail(null, true, ssc).setVisible(true);
            
         }catch(IllegalArgumentException e){
            throw new IllegalArgumentException(e.getMessage() + "Record not saved");
        }
               
     }
     
       public static void unique(Salary_Class ssc)
     {
         for (int i = 0; i < ss.size(); i ++)
         {
             if (ssc.getId() == ss.get(i).getId())
                  throw new IllegalArgumentException("Record against this ID '"+ssc.getId()+"' is already exist ");    
         }
     }
       
      
      public static void arrayDispose()
    {
        ss.clear();
    }
      
      public static Salary_Class searchByID(int id)
    {
        try
        {
            Load();
            for(int i=0; i<ss.size(); i++)
            {
                if(ss.get(i).getId()==id)
                    return ss.get(i);
            }
        }catch(Exception e){
        }
        return null;        
    }
      
    public static ArrayList<Salary_Class> getArray()
   {
       return ss;
   }
    
    
       public static void DeleteRecord(Salary_Class ssc)
   {
       try {
       Load();
             
       ConnectionClass.query("DELETE FROM salary WHERE sr = "+ ssc.getId() + ";");
      
       }catch(Exception e)
       {
            throw new IllegalArgumentException(e.getMessage());
       }
       
      
   }
      public static void UpdateRecord(Salary_Class ssc)
   {
       try {
       
       Load();
     
       ConnectionClass.query("UPDATE salary SET name = '" + ssc.getName()  + "', post = '"+ ssc.getPost() +
               "', month = '"+ ssc.getMonthName() + "', days = '" + ssc.getTotalWorkingDays()+ "', advance = '" + ssc.getAdvance()
               + "', deduction = '"+ ssc.getDeduction() + "', net_salary = '" + ssc.getNetSalary() + "', date = '" + ssc.getDate()
               +"', gross_salary = '" + ssc.getGross() +"'WHERE sr = " + ssc.getId() +" ;");
       
       }catch(Exception e)
       {
          throw new IllegalArgumentException(e.getMessage());
       }
         
   }    
}