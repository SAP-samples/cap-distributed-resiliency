package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Boolean;
import java.lang.String;

@CdsName("API_BUSINESS_PARTNER.A_CustSalesPartnerFunc")
public interface ACustSalesPartnerFunc_ extends StructuredType<ACustSalesPartnerFunc_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_CustSalesPartnerFunc";

  ElementRef<String> Customer();

  ElementRef<String> SalesOrganization();

  ElementRef<String> DistributionChannel();

  ElementRef<String> Division();

  ElementRef<String> PartnerCounter();

  ElementRef<String> PartnerFunction();

  ElementRef<String> BPCustomerNumber();

  ElementRef<String> CustomerPartnerDescription();

  ElementRef<Boolean> DefaultPartner();

  ElementRef<String> AuthorizationGroup();
}
