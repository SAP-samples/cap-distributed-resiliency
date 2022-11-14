package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Boolean;
import java.lang.String;
import java.time.LocalDate;

@CdsName("API_BUSINESS_PARTNER.A_SupplierPartnerFunc")
public interface ASupplierPartnerFunc_ extends StructuredType<ASupplierPartnerFunc_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_SupplierPartnerFunc";

  ElementRef<String> Supplier();

  ElementRef<String> PurchasingOrganization();

  ElementRef<String> SupplierSubrange();

  ElementRef<String> Plant();

  ElementRef<String> PartnerFunction();

  ElementRef<String> PartnerCounter();

  ElementRef<Boolean> DefaultPartner();

  ElementRef<LocalDate> CreationDate();

  ElementRef<String> CreatedByUser();

  ElementRef<String> ReferenceSupplier();

  ElementRef<String> AuthorizationGroup();
}
