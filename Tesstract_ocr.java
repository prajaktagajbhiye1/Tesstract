package tesstract_ocr;

import java.io.File;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Tesstract_ocr {

    public static void main(String[] args) {
        File image = new File("C:\\Users\\raghuveer\\Desktop\\number.png");

        Tesseract tessInst = new Tesseract();
        tessInst.setDatapath("C:\\tessdata");
        try {
            String result = tessInst.doOCR(image);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());

        }

    }

}
 //jar required
//tess4j-3.4.8.jar
//jna-4.1.0.jar
//jul-to-slf4j-1.7.25
//slf4j-api-1.7.25.jar
//commons-io-2.6.jar
//slf4j-simple-1.6.1.jar
//jai-imageio-core-1.4.0.jar
//lept4j-1.6.4.jar