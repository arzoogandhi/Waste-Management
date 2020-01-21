/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.HealthDept;

/**
 *
 * @author ANKIT
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.stream.Stream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratePdf {
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Ankit\\Documents\\HelloWorld.pdf"));
		 
		document.open();
		Font font = FontFactory.getFont(FontFactory.TIMES_BOLD, 16, BaseColor.BLACK);
		Paragraph para = new Paragraph("Hello World\n", font);
		para.setAlignment(Element.ALIGN_CENTER);
		
		PdfPTable table = new PdfPTable(3);
		//add header
		Stream.of("column header 1", "column header 2", "column header 3")
	      .forEach(columnTitle -> {
	        PdfPCell header = new PdfPCell();
	        header.setBackgroundColor(BaseColor.LIGHT_GRAY);
	        header.setBorderWidth(2);
	        header.setPhrase(new Phrase(columnTitle));
	        table.addCell(header);
	    });
		
		for (int i = 1; i <= 10; i++) {
			//add rows & data
			table.addCell("row "+i+", col 1");
			table.addCell("row "+i+", col 2");
			table.addCell("row "+i+", col 3");
		}
		document.add(para);
		document.add(Chunk.NEWLINE);
		document.add(table);
		document.close();
		
		
	}
    
}
