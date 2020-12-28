package kata3;

/**
 * @author Antonio Miguel Martel
 */
public class Main {

    public static void main(String[] args) {
        Histogram<String> histogram;
        histogram = new Histogram<>();
        
        for (int i = 0; i < 10; i++) {
            histogram.increment("ulpgc.es");
        }
        for (int i = 0; i < 5; i++) {
            histogram.increment("yahoo.es");
        }
        for (int i = 0; i < 6; i++) {
            histogram.increment("pikachu.es");
        }
        for (int i = 0; i < 2; i++) {
            histogram.increment("ull.es");
        }
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
    
    
    
    
    
    
    
    
}
