package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Boolean;
import java.lang.String;
import java.time.LocalDate;
import java.util.function.Function;

@CdsName("API_BUSINESS_PARTNER.A_BusinessPartnerContact")
public interface ABusinessPartnerContact_ extends StructuredType<ABusinessPartnerContact_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_BusinessPartnerContact";

  ElementRef<String> RelationshipNumber();

  ElementRef<String> BusinessPartnerCompany();

  ElementRef<String> BusinessPartnerPerson();

  ElementRef<LocalDate> ValidityEndDate();

  ElementRef<LocalDate> ValidityStartDate();

  ElementRef<Boolean> IsStandardRelationship();

  ElementRef<String> RelationshipCategory();

  ABPContactToAddress_ to_ContactAddress();

  ABPContactToAddress_ to_ContactAddress(Function<ABPContactToAddress_, CqnPredicate> filter);

  ElementRef<String> to_ContactAddress_RelationshipNumber();

  ElementRef<String> to_ContactAddress_BusinessPartnerCompany();

  ElementRef<String> to_ContactAddress_BusinessPartnerPerson();

  ElementRef<LocalDate> to_ContactAddress_ValidityEndDate();

  ElementRef<String> to_ContactAddress_AddressID();

  ABPContactToFuncAndDept_ to_ContactRelationship();

  ABPContactToFuncAndDept_ to_ContactRelationship(
      Function<ABPContactToFuncAndDept_, CqnPredicate> filter);

  ElementRef<String> to_ContactRelationship_RelationshipNumber();

  ElementRef<String> to_ContactRelationship_BusinessPartnerCompany();

  ElementRef<String> to_ContactRelationship_BusinessPartnerPerson();

  ElementRef<LocalDate> to_ContactRelationship_ValidityEndDate();
}
