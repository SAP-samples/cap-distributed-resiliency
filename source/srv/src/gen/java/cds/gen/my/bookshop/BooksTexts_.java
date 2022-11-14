package cds.gen.my.bookshop;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("my.bookshop.Books.texts")
public interface BooksTexts_ extends StructuredType<BooksTexts_> {
  String CDS_NAME = "my.bookshop.Books.texts";

  ElementRef<String> ID_texts();

  ElementRef<String> locale();

  ElementRef<String> ID();

  ElementRef<String> title();

  ElementRef<String> descr();
}
