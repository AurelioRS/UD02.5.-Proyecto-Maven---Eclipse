package es.iessoterohernandez.daw.endes.HelloWorldPdf;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class App 
{
    public static void main( String[] args )
    {
       try {
    	   Document d = new Document();
    	   PdfWriter.getInstance(d,new FileOutputStream("C://Users/RAF/HelloWorld.pdf"));
    	   d.open();
    	   d.add(new Paragraph("Hello World"));
    	   d.close();
    	   
       }catch(Exception e) {
    	   System.out.println(e);
       }
       System.out.println("PDF creado");
    }
}
