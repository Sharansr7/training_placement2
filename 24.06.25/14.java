import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.*;

public class InvoicePDF {
    public static void main(String[] args) throws Exception {
        Document doc = new Document();
        PdfWriter.getInstance(doc, new FileOutputStream("invoice.pdf"));
        doc.open();
        doc.add(new Paragraph("INVOICE"));
        doc.add(new Paragraph("Customer: Sharan"));
        doc.add(new Paragraph("Amount: ₹5000"));
        doc.close();
        System.out.println("Invoice generated.");
    }
}
