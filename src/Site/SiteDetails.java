package Site;

public class SiteDetails {
    private int id;
    private String attndnc;
    private String work;
    private String assignDate;
    private String assignStatus;

    /* Constructor */
    
    public SiteDetails(int id, String attndnc, String work, String assignDate, String assignStatus) {
        setId(id);
        setAttndnc(attndnc);
        setWork(work);
        setAssignDate(assignDate);
        setAssignStatus(assignStatus);
    }

    public boolean setId(int id) {
        if (id > 0)
         this.id = id;
       else {
         this.id = id *-1;
        throw new IllegalArgumentException("Employee ID must be in positive Integers.");
       }
       return true;
    }


    public void setAttndnc(String attndnc) {
       if (!attndnc.equals("Choose"))
        this.attndnc = attndnc;
       else
           this.attndnc =  "Wrong Selection";
    }

    public void setWork(String work) {
        this.work = work;
    }
    
    public void setAssignDate(String assignDatel) {
        this.assignDate = assignDatel;
    }

    public void setAssignStatus(String assignStatus) {
        this.assignStatus = assignStatus;
    }

    public int getId() {
        return id;
    }

    public String getAttndnc() {
        return attndnc;
    }

    public String getWork() {
        return work;
    }
    
    public String getAssignDate() {
        return assignDate;
    }

    public String getAssignStatus() {
        return assignStatus;
    }    
}