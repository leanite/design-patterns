package behavioral.templatemethod;

import java.io.File;

public class PDFDataMiner extends DataMiner {

    public PDFDataMiner(File file) {
        super(file);
    }

    @Override
    protected String extractData() {
        return "Fake *.pdf data";
    }
}
