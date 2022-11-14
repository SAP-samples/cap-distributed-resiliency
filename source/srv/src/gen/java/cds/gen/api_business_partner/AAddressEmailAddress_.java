package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Boolean;
import java.lang.String;

@CdsName("API_BUSINESS_PARTNER.A_AddressEmailAddress")
public interface AAddressEmailAddress_ extends StructuredType<AAddressEmailAddress_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_AddressEmailAddress";

  ElementRef<String> AddressID();

  ElementRef<String> Person();

  ElementRef<String> OrdinalNumber();

  ElementRef<Boolean> IsDefaultEmailAddress();

  ElementRef<String> EmailAddress();

  ElementRef<String> SearchEmailAddress();

  ElementRef<String> AddressCommunicationRemarkText();
}
