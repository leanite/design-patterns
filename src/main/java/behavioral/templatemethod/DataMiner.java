package behavioral.templatemethod;

import java.io.File;

public abstract class DataMiner {

    private File file;

    public DataMiner(File file) {
        this.file = file;
    }

    public void startMining() {
        String rawData = extractData();
        String analysis = analyzeData(rawData);

        sendReport(analysis);
    }

    protected abstract String extractData();

    private String analyzeData(String rawData) {
        System.out.println("Analyzing " + file.getName() + " data ...");

        return rawData;
    }

    private void sendReport(String analysis) {
        System.out.println("Report: " + analysis + "\n");
    }
}

