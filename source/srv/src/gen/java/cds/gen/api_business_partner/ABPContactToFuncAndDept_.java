package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;
import java.time.LocalDate;

@CdsName("API_BUSINESS_PARTNER.A_BPContactToFuncAndDept")
public interface ABPContactToFuncAndDept_ extends StructuredType<ABPContactToFuncAndDept_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_BPContactToFuncAndDept";

  ElementRef<String> RelationshipNumber();

  ElementRef<String> BusinessPartnerCompany();

  ElementRef<String> BusinessPartnerPerson();

  ElementRef<LocalDate> ValidityEndDate();

  ElementRef<String> ContactPersonFunction();

  ElementRef<String> ContactPersonDepartment();

  ElementRef<String> PhoneNumber();

  ElementRef<String> PhoneNumberExtension();

  ElementRef<String> FaxNumber();

  ElementRef<String> FaxNumberExtension();

  ElementRef<String> EmailAddress();

  ElementRef<String> RelationshipCategory();
}
