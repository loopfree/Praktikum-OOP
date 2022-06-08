import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

public class OrchidDataAvgProcessor implements Runnable {
	// Tambahkan atribut sesuai kebutuhan
	OrchidMeanDatum meanDatum;
	String rawDataFilename;

	public OrchidDataAvgProcessor(OrchidMeanDatum meanDatum, String rawDataFilename) {
		// Konstruktor
		this.meanDatum = meanDatum;
		this.rawDataFilename = rawDataFilename;
	}

	@Override
	public void run() {
		// Menghitung rata-rata dari data yang dibaca dengan CSVReader, lalu update
		// meanDatum dengan rata-rata dari setiap aspek data

		// Apabila muncul IOException, maka hasil pembacaan data adalah kosong
		// dan meanDatum tidak di-update (tidak di throw lagi)

		try {
			CSVReader reader = new CSVReader(rawDataFilename, ",");
			reader.setSkipHeader(true);
      
      List<String[]> data = reader.read();
      float petalLengthTotal = 0;
      float petalWidthTotal = 0;
      float stemLengthTotal = 0;
      for(String[] datum : data) {
        float petalLength = Float.valueOf(datum[0]).floatValue();
        float petalWidth = Float.valueOf(datum[1]).floatValue();
        float stemLength = Float.valueOf(datum[2]).floatValue();

        petalLengthTotal += petalLength;
        petalWidthTotal += petalWidth;
        stemLengthTotal += stemLength;
      }
      float petalLengthMean = petalLengthTotal / data.size();
      float petalWidthMean = petalWidthTotal / data.size();
      float stemLengthMean = stemLengthTotal / data.size();
      meanDatum.setMean(petalLengthMean, petalWidthMean, stemLengthMean);
		} catch (Exception e) {
			// do nothing
		}
	}
}