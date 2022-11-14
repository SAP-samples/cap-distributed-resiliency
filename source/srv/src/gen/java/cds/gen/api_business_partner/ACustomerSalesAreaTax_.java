package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("API_BUSINESS_PARTNER.A_CustomerSalesAreaTax")
public interface ACustomerSalesAreaTax_ extends StructuredType<ACustomerSalesAreaTax_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_CustomerSalesAreaTax";

  ElementRef<String> Customer();

  ElementRef<String> SalesOrganization();

  ElementRef<String> DistributionChannel();

  ElementRef<String> Division();

  ElementRef<String> DepartureCountry();

  ElementRef<String> CustomerTaxCategory();

  ElementRef<String> CustomerTaxClassification();
}
