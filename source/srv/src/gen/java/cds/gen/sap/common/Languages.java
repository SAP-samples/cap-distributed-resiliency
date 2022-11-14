package cds.gen.sap.common;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import java.util.List;
import java.util.Map;

@CdsName("sap.common.Languages")
public interface Languages extends CdsData {
  String NAME = "name";

  String DESCR = "descr";

  String CODE = "code";

  String TEXTS = "texts";

  String LOCALIZED = "localized";

  String getName();

  void setName(String name);

  String getDescr();

  void setDescr(String descr);

  String getCode();

  void setCode(String code);

  List<LanguagesTexts> getTexts();

  void setTexts(List<? extends Map<String, ?>> texts);

  LanguagesTexts getLocalized();

  void setLocalized(Map<String, ?> localized);

  Languages_ ref();

  static Languages create() {
    return Struct.create(Languages.class);
  }
}
