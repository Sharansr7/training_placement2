
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.*;

public class ResumePDF {
    public static void main(String[] args) throws Exception {
        Document doc = new Document();
        PdfWriter.getInstance(doc, new FileOutputStream("resume.pdf"));
        doc.open();
        doc.add(new Paragraph("Name: Sharan"));
        doc.add(new Paragraph("Email: sharan@example.com"));
        doc.add(new Paragraph("Skills: Java, Python, SQL"));
        doc.close();
        System.out.println("Resume created.");
    }
}
