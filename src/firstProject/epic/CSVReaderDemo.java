package firstProject.epic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderDemo {

    String csvFile;


    private static PictureFiles createFilesList(String[] metadata) {

        String linkOfPic = metadata[0];
        String action = metadata[1];

        return new PictureFiles(linkOfPic, action);
    }


    public static List<PictureFiles> readFromCsvFile(String csvFile) {
        List<PictureFiles> urlList = new ArrayList<>();
        String line = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
            while ((line = reader.readLine()) != null) {
                String[] attributes = line.split(",");
                PictureFiles pf = createFilesList(attributes);
                urlList.add(pf);
            }

        } catch (
                Exception e) {
            e.printStackTrace();
        }
        return urlList;
    }
}
