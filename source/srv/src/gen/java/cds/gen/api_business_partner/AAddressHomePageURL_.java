package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDate;

@CdsName("API_BUSINESS_PARTNER.A_AddressHomePageURL")
public interface AAddressHomePageURL_ extends StructuredType<AAddressHomePageURL_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_AddressHomePageURL";

  ElementRef<String> AddressID();

  ElementRef<String> Person();

  ElementRef<String> OrdinalNumber();

  ElementRef<LocalDate> ValidityStartDate();

  ElementRef<Boolean> IsDefaultURLAddress();

  ElementRef<String> SearchURLAddress();

  ElementRef<String> AddressCommunicationRemarkText();

  ElementRef<Integer> URLFieldLength();

  ElementRef<String> WebsiteURL();
}
