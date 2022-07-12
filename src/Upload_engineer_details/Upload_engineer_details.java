package Upload_engineer_details;

public final class Upload_engineer_details {
       
    private String SiteDescription;
    private int siteid = 1;
    private String uploadDate;
    private String engineerName;
    private String SiteName;
    private String SiteLink;
    
    /* Constructor */
    public Upload_engineer_details(int id, String gameDescription, String uploadDate, String developerName, String designerName, String gameLink) {
      
        setIdGame(id);
        setSiteDescription(gameDescription);
        setUploadDate(uploadDate);
        setEngineerName(developerName);
        setSiteName(designerName);
        setSiteLink(gameLink);
        
    }


      public boolean setIdGame(int id) {
       if (id > 0)
         this.siteid = id;
       else {
         this.siteid = id *-1;
        throw new IllegalArgumentException("Game ID must be in positive Integers.");
       }
       return true;
    }
    public void setSiteDescription(String SiteDescription) {
        this.SiteDescription = SiteDescription;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public void setEngineerName(String engineerName) {
        this.engineerName = engineerName;
    }

    public void setSiteName(String SiteName) {
        this.SiteName = SiteName;
    }

    public void setSiteLink(String SiteLink) {
        this.SiteLink = SiteLink;
    }

    public String getSiteDescription() {
        return SiteDescription;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public String getEngineerName() {
        return engineerName;
    }

    public String getSiteName() {
        return SiteName;
    }

    public String getSiteLink() {
        return SiteLink;
    }
    public int getSiteid()
    {
        return siteid;
    }    
}