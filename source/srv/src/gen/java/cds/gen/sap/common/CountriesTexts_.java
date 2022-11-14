package cds.gen.sap.common;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("sap.common.Countries.texts")
public interface CountriesTexts_ extends StructuredType<CountriesTexts_> {
  String CDS_NAME = "sap.common.Countries.texts";

  ElementRef<String> locale();

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();
}
