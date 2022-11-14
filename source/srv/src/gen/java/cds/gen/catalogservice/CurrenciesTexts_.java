package cds.gen.catalogservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("CatalogService.Currencies.texts")
public interface CurrenciesTexts_ extends StructuredType<CurrenciesTexts_> {
  String CDS_NAME = "CatalogService.Currencies.texts";

  ElementRef<String> locale();

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();
}
