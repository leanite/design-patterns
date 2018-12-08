package behavioral.templatemethod;

import java.io.File;

public class CSVDataMiner extends DataMiner {

    public CSVDataMiner(File file) {
        super(file);
    }

    @Override
    protected String extractData() {
        return "Fake *.csv data";
    }
}
