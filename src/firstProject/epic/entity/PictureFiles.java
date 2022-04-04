package firstProject.epic.entity;

import java.util.List;

import static firstProject.epic.service.CSVReader.readFromCsvFile;

public class PictureFiles {
    private String linkOfPicture;
    private String actionForPicture;
    static int counter;
    int id;

    public PictureFiles(String linkOfPic, String action) {
        this.linkOfPicture = linkOfPic;
        this.actionForPicture = action;
        id = ++counter;
    }

    public String getLinkOfPicture(String csvFile) {
        List<PictureFiles> picturesUrls = readFromCsvFile(csvFile);
        String imageLink = null;
        for (int i = 0; i < picturesUrls.size(); i++) {
           imageLink = picturesUrls.get(i).getLinkOfPicture(csvFile);
      }
        return imageLink;
    }

    public void setLinkOfPicture(String linkOfPicture) {
        this.linkOfPicture = linkOfPicture;
    }

    public String getActionForPicture() {
        return actionForPicture;
    }

    public void setActionForPicture(String actionForPicture) {
        this.actionForPicture = actionForPicture;
    }

    @Override
    public String toString() {
        return String.format("File %s: %s\nAction %s: %s", id, linkOfPicture, id, actionForPicture);
    }

}
