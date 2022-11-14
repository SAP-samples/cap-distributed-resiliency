package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Boolean;
import java.lang.String;
import java.time.Instant;

@CdsName("API_BUSINESS_PARTNER.A_BuPaAddressUsage")
public interface ABuPaAddressUsage_ extends StructuredType<ABuPaAddressUsage_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_BuPaAddressUsage";

  ElementRef<String> BusinessPartner();

  ElementRef<Instant> ValidityEndDate();

  ElementRef<String> AddressUsage();

  ElementRef<String> AddressID();

  ElementRef<Instant> ValidityStartDate();

  ElementRef<Boolean> StandardUsage();

  ElementRef<String> AuthorizationGroup();
}
