package cds.gen.adminservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.io.InputStream;
import java.lang.String;

@CdsName("AdminService.Upload")
public interface Upload extends CdsData {
  String CSV = "csv";

  InputStream getCsv();

  void setCsv(InputStream csv);

  Upload_ ref();

  static Upload create() {
    return Struct.create(Upload.class);
  }
}
