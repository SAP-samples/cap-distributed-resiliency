package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Boolean;
import java.lang.String;

@CdsName("API_BUSINESS_PARTNER.A_AddressFaxNumber")
public interface AAddressFaxNumber_ extends StructuredType<AAddressFaxNumber_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_AddressFaxNumber";

  ElementRef<String> AddressID();

  ElementRef<String> Person();

  ElementRef<String> OrdinalNumber();

  ElementRef<Boolean> IsDefaultFaxNumber();

  ElementRef<String> FaxCountry();

  ElementRef<String> FaxNumber();

  ElementRef<String> FaxNumberExtension();

  ElementRef<String> InternationalFaxNumber();

  ElementRef<String> AddressCommunicationRemarkText();
}
