package cds.gen.catalogservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import java.util.List;
import java.util.Map;

@CdsName("CatalogService.Currencies")
public interface Currencies extends CdsData {
  String NAME = "name";

  String DESCR = "descr";

  String CODE = "code";

  String SYMBOL = "symbol";

  String TEXTS = "texts";

  String LOCALIZED = "localized";

  String getName();

  void setName(String name);

  String getDescr();

  void setDescr(String descr);

  String getCode();

  void setCode(String code);

  String getSymbol();

  void setSymbol(String symbol);

  List<CurrenciesTexts> getTexts();

  void setTexts(List<? extends Map<String, ?>> texts);

  CurrenciesTexts getLocalized();

  void setLocalized(Map<String, ?> localized);

  Currencies_ ref();

  static Currencies create() {
    return Struct.create(Currencies.class);
  }
}
