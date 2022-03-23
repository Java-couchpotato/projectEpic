package firstProject.epic;

import java.util.List;

import static firstProject.epic.CSVReaderDemo.readFromCsvFile;

public class Main {
    public static void main(String[] args) {
        String csvFile = "UrlList.csv";
        if (args.length > 0) {
            csvFile = args[0];
        }
        List<PictureFiles> picUrls = readFromCsvFile(csvFile);
        for (PictureFiles p : picUrls) {
            System.out.println(p );
        }
    }

}
