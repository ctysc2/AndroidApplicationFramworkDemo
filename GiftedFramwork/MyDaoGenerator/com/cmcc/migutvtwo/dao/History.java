package com.cmcc.migutvtwo.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table HISTORY.
 */
public class History {

    private String id;
    private String contentName;
    private String liveName;
    private String contentPic;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public History() {
    }

    public History(String id) {
        this.id = id;
    }

    public History(String id, String contentName, String liveName, String contentPic) {
        this.id = id;
        this.contentName = contentName;
        this.liveName = liveName;
        this.contentPic = contentPic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    public String getLiveName() {
        return liveName;
    }

    public void setLiveName(String liveName) {
        this.liveName = liveName;
    }

    public String getContentPic() {
        return contentPic;
    }

    public void setContentPic(String contentPic) {
        this.contentPic = contentPic;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
