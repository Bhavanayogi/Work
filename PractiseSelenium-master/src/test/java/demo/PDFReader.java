package demo;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFReader {

	public static void main(String[] args) throws IOException {
		
		URL url= new URL("file:///C:/Onedrive/OneDrive%20-%20RealPage/Documents/PDF/Lease_Envelopes.pdf"); 
		//To get this url we need to open the pdf file using open with any browser and copy that url
		
		InputStream is= url.openStream();
		BufferedInputStream fileparse = new BufferedInputStream(is);
		PDDocument doc=null;
		
		doc=PDDocument.load(fileparse);
		String pdfContent = new PDFTextStripper().getText(doc);
		System.out.println(pdfContent);
				

	}

}
