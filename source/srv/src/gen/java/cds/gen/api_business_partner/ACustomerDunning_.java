package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;
import java.time.LocalDate;

@CdsName("API_BUSINESS_PARTNER.A_CustomerDunning")
public interface ACustomerDunning_ extends StructuredType<ACustomerDunning_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_CustomerDunning";

  ElementRef<String> Customer();

  ElementRef<String> CompanyCode();

  ElementRef<String> DunningArea();

  ElementRef<String> DunningBlock();

  ElementRef<String> DunningLevel();

  ElementRef<String> DunningProcedure();

  ElementRef<String> DunningRecipient();

  ElementRef<LocalDate> LastDunnedOn();

  ElementRef<LocalDate> LegDunningProcedureOn();

  ElementRef<String> DunningClerk();

  ElementRef<String> AuthorizationGroup();

  ElementRef<String> CustomerAccountGroup();
}
