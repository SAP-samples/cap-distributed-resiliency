package cds.gen;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;

@CdsName("cuid")
public interface Cuid extends CdsData {
  String ID = "ID";

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  static Cuid create() {
    return Struct.create(Cuid.class);
  }
}
