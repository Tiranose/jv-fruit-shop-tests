package core.basesyntax.shopserviceandreportgenerator;

import java.util.Map;

public interface ReportGenerator {
    String getReport(Map<String, Integer> storage);
}
