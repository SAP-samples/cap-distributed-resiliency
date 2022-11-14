package cds.gen.adminservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Integer;
import java.lang.String;

@CdsName("AdminService.Genres.texts")
public interface GenresTexts_ extends StructuredType<GenresTexts_> {
  String CDS_NAME = "AdminService.Genres.texts";

  ElementRef<String> locale();

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<Integer> ID();
}
