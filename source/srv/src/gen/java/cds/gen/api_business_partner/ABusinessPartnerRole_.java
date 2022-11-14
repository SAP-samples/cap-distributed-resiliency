package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;
import java.time.Instant;

@CdsName("API_BUSINESS_PARTNER.A_BusinessPartnerRole")
public interface ABusinessPartnerRole_ extends StructuredType<ABusinessPartnerRole_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_BusinessPartnerRole";

  ElementRef<String> BusinessPartner();

  ElementRef<String> BusinessPartnerRole();

  ElementRef<Instant> ValidFrom();

  ElementRef<Instant> ValidTo();

  ElementRef<String> AuthorizationGroup();
}
