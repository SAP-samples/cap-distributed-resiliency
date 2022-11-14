package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Boolean;
import java.lang.String;

@CdsName("API_BUSINESS_PARTNER.A_AddressPhoneNumber")
public interface AAddressPhoneNumber_ extends StructuredType<AAddressPhoneNumber_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_AddressPhoneNumber";

  ElementRef<String> AddressID();

  ElementRef<String> Person();

  ElementRef<String> OrdinalNumber();

  ElementRef<String> DestinationLocationCountry();

  ElementRef<Boolean> IsDefaultPhoneNumber();

  ElementRef<String> PhoneNumber();

  ElementRef<String> PhoneNumberExtension();

  ElementRef<String> InternationalPhoneNumber();

  ElementRef<String> PhoneNumberType();

  ElementRef<String> AddressCommunicationRemarkText();
}
