package firstProject.epic.service;

import java.io.*;
import java.net.URL;

public class ImageLoader {

        public static void downloadImage(String imageLink){

            InputStream inputStream = null;
            OutputStream outputStream = null;

            try {
                URL url = new URL(imageLink);
                inputStream = url.openStream();
                outputStream = new FileOutputStream("D:\\java\\projectEpic\\src\\images\\image.jpg");

                byte[] buffer = new byte[2048];
                int length;

                while ((length = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, length);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

