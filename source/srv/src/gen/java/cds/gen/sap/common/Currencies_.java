package cds.gen.sap.common;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.String;
import java.util.function.Function;

@CdsName("sap.common.Currencies")
public interface Currencies_ extends StructuredType<Currencies_> {
  String CDS_NAME = "sap.common.Currencies";

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();

  ElementRef<String> symbol();

  CurrenciesTexts_ texts();

  CurrenciesTexts_ texts(Function<CurrenciesTexts_, CqnPredicate> filter);

  CurrenciesTexts_ localized();

  CurrenciesTexts_ localized(Function<CurrenciesTexts_, CqnPredicate> filter);
}
