package behavioral.templatemethod;

import java.io.File;

public class MainUsage {
    public static void main(String[] args) {
        PDFDataMiner pdfDataMiner = new PDFDataMiner(new File("tmp.pdf"));
        CSVDataMiner csvDataMiner = new CSVDataMiner(new File("tmp.csv"));

        pdfDataMiner.startMining();
        csvDataMiner.startMining();
    }
}
