package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("API_BUSINESS_PARTNER.A_BuPaIndustry")
public interface ABuPaIndustry_ extends StructuredType<ABuPaIndustry_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_BuPaIndustry";

  ElementRef<String> IndustrySector();

  ElementRef<String> IndustrySystemType();

  ElementRef<String> BusinessPartner();

  ElementRef<String> IsStandardIndustry();

  ElementRef<String> IndustryKeyDescription();
}
