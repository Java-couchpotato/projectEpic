package firstProject.epic;

import java.io.IOException;
import java.util.List;

import static firstProject.epic.CSVReader.readFromCsvFile;
import static firstProject.epic.ImageLoader.downloadImage;



public class Main {
    public static void main(String[] args) throws IOException {
        String csvFile = "UrlList.csv";
        List<PictureFiles> picturesUrls = readFromCsvFile(csvFile);
//        String imageLink = null;
//        for (int i = 0; i < picturesUrls.size(); i++) {
//            imageLink = picturesUrls.get(i).getLinkOfPicture();
//        }
        downloadImage(picturesUrls.get(0).getLinkOfPicture());

    }

}
