/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author quock
 */
public class Images {
    private int ImageID;
    private String ImageName;
    private String ImageLink;

    public Images(int ImageID, String ImageName, String ImageLink) {
        this.ImageID = ImageID;
        this.ImageName = ImageName;
        this.ImageLink = ImageLink;
    }

    public Images() {
    }
    

    public int getImageID() {
        return ImageID;
    }

    public void setImageID(int ImageID) {
        this.ImageID = ImageID;
    }

    public String getImageName() {
        return ImageName;
    }

    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    public String getImageLink() {
        return ImageLink;
    }

    public void setImageLink(String ImageLink) {
        this.ImageLink = ImageLink;
    }
    
}
