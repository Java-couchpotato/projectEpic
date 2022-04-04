package firstProject.epic;

import firstProject.epic.entity.PictureFiles;

import java.io.IOException;
import java.util.List;

import static firstProject.epic.service.CSVReader.readFromCsvFile;


public class Main {
    public static void main(String[] args) throws IOException {
        String csvFile = "UrlList.csv";
        List<PictureFiles> picturesUrls = readFromCsvFile(csvFile);
//        String imageLink = null;
//        for (int i = 0; i < picturesUrls.size(); i++) {
//            imageLink = picturesUrls.get(i).getLinkOfPicture();
//        }

    }

}
