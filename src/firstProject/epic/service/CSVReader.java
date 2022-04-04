package firstProject.epic.service;

import firstProject.epic.entity.PictureFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    //private static String csvFile;

    private static PictureFiles createFilesList(String[] rowsFromFile) {

        String linkOfPic = rowsFromFile[0];
        String action = rowsFromFile[1];

        return new PictureFiles(linkOfPic, action);
    }

    public static List<PictureFiles> readFromCsvFile(String csvFile) {

        List<PictureFiles> urlFromFile = new ArrayList<>();
        String line;

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
            while ((line = reader.readLine()) != null) {
                String[] rows = line.split(",");
                PictureFiles rowFromFile = createFilesList(rows);
                urlFromFile.add(rowFromFile);
            }

        } catch (
                Exception e) {
            e.printStackTrace();
        }
        return urlFromFile;
    }
}

