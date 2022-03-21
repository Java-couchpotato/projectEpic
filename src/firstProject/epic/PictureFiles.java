package firstProject.epic;

public class PictureFiles {
    private String linkOfPic;
    private String action;
    static int counter;
    int id;

    public PictureFiles(String linkOfPic, String action) {
        this.linkOfPic=linkOfPic;
        this.action = action;
        id=++counter;
    }

    public String getLinkOfPic() {
        return linkOfPic;
    }

    @Override
    public String toString() {
        return String.format("File %s: %s\nAction %s: %s",id, linkOfPic,id,action);
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
