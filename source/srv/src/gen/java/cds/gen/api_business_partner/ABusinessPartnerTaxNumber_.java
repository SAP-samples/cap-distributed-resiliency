package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("API_BUSINESS_PARTNER.A_BusinessPartnerTaxNumber")
public interface ABusinessPartnerTaxNumber_ extends StructuredType<ABusinessPartnerTaxNumber_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_BusinessPartnerTaxNumber";

  ElementRef<String> BusinessPartner();

  ElementRef<String> BPTaxType();

  ElementRef<String> BPTaxNumber();

  ElementRef<String> BPTaxLongNumber();

  ElementRef<String> AuthorizationGroup();
}
