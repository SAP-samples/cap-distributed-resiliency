package cds.gen.adminservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.io.InputStream;
import java.lang.String;

@CdsName("AdminService.Upload")
public interface Upload_ extends StructuredType<Upload_> {
  String CDS_NAME = "AdminService.Upload";

  ElementRef<InputStream> csv();
}
