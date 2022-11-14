package cds.gen.sap.common;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;

@CdsName("sap.common.CodeList")
public interface CodeList extends CdsData {
  String NAME = "name";

  String DESCR = "descr";

  String getName();

  void setName(String name);

  String getDescr();

  void setDescr(String descr);

  static CodeList create() {
    return Struct.create(CodeList.class);
  }
}
