package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;
import java.time.LocalDate;

@CdsName("API_BUSINESS_PARTNER.A_BuPaIdentification")
public interface ABuPaIdentification_ extends StructuredType<ABuPaIdentification_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_BuPaIdentification";

  ElementRef<String> BusinessPartner();

  ElementRef<String> BPIdentificationType();

  ElementRef<String> BPIdentificationNumber();

  ElementRef<String> BPIdnNmbrIssuingInstitute();

  ElementRef<LocalDate> BPIdentificationEntryDate();

  ElementRef<String> Country();

  ElementRef<String> Region();

  ElementRef<LocalDate> ValidityStartDate();

  ElementRef<LocalDate> ValidityEndDate();

  ElementRef<String> AuthorizationGroup();
}
