package firstProject.epic;

public class PictureFiles {
    private String linkOfPic;
    private String action;

    public PictureFiles(String linkOfPic, String action) {
        this.linkOfPic=linkOfPic;
        this.action = action;
    }

    public String getLinkOfPic() {
        return linkOfPic;
    }

    @Override
    public String toString() {
        return "File "+ linkOfPic + '\'' +
                ", action " +action ;
    }

    public void setLinkOfPic(String linkOfPic) {
        this.linkOfPic = linkOfPic;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }



}
