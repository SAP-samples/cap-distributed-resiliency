package cds.gen.adminservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("AdminService.Languages.texts")
public interface LanguagesTexts_ extends StructuredType<LanguagesTexts_> {
  String CDS_NAME = "AdminService.Languages.texts";

  ElementRef<String> locale();

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();
}
