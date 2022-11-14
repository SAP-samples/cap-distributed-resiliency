package cds.gen.catalogservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("CatalogService.Books.texts")
public interface BooksTexts_ extends StructuredType<BooksTexts_> {
  String CDS_NAME = "CatalogService.Books.texts";

  ElementRef<String> ID_texts();

  ElementRef<String> locale();

  ElementRef<String> ID();

  ElementRef<String> title();

  ElementRef<String> descr();
}
