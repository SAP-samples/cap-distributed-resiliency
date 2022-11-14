package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Boolean;
import java.lang.String;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.Function;

@CdsName("API_BUSINESS_PARTNER.A_BusinessPartner")
public interface ABusinessPartner_ extends StructuredType<ABusinessPartner_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_BusinessPartner";

  ElementRef<String> BusinessPartner();

  ElementRef<String> Customer();

  ElementRef<String> Supplier();

  ElementRef<String> AcademicTitle();

  ElementRef<String> AuthorizationGroup();

  ElementRef<String> BusinessPartnerCategory();

  ElementRef<String> BusinessPartnerFullName();

  ElementRef<String> BusinessPartnerGrouping();

  ElementRef<String> BusinessPartnerName();

  ElementRef<String> BusinessPartnerUUID();

  ElementRef<String> CorrespondenceLanguage();

  ElementRef<String> CreatedByUser();

  ElementRef<LocalDate> CreationDate();

  ElementRef<LocalTime> CreationTime();

  ElementRef<String> FirstName();

  ElementRef<String> FormOfAddress();

  ElementRef<String> Industry();

  ElementRef<String> InternationalLocationNumber1();

  ElementRef<String> InternationalLocationNumber2();

  ElementRef<Boolean> IsFemale();

  ElementRef<Boolean> IsMale();

  ElementRef<String> IsNaturalPerson();

  ElementRef<Boolean> IsSexUnknown();

  ElementRef<String> GenderCodeName();

  ElementRef<String> Language();

  ElementRef<LocalDate> LastChangeDate();

  ElementRef<LocalTime> LastChangeTime();

  ElementRef<String> LastChangedByUser();

  ElementRef<String> LastName();

  ElementRef<String> LegalForm();

  ElementRef<String> OrganizationBPName1();

  ElementRef<String> OrganizationBPName2();

  ElementRef<String> OrganizationBPName3();

  ElementRef<String> OrganizationBPName4();

  ElementRef<LocalDate> OrganizationFoundationDate();

  ElementRef<LocalDate> OrganizationLiquidationDate();

  ElementRef<String> SearchTerm1();

  ElementRef<String> SearchTerm2();

  ElementRef<String> AdditionalLastName();

  ElementRef<LocalDate> BirthDate();

  ElementRef<String> BusinessPartnerBirthplaceName();

  ElementRef<Boolean> BusinessPartnerIsBlocked();

  ElementRef<String> BusinessPartnerType();

  ElementRef<String> ETag();

  ElementRef<String> GroupBusinessPartnerName1();

  ElementRef<String> GroupBusinessPartnerName2();

  ElementRef<String> IndependentAddressID();

  ElementRef<String> InternationalLocationNumber3();

  ElementRef<String> MiddleName();

  ElementRef<String> NameCountry();

  ElementRef<String> NameFormat();

  ElementRef<String> PersonFullName();

  ElementRef<String> PersonNumber();

  ElementRef<Boolean> IsMarkedForArchiving();

  ElementRef<String> BusinessPartnerIDByExtSystem();

  ElementRef<String> TradingPartner();

  ABuPaIdentification_ to_BuPaIdentification();

  ABuPaIdentification_ to_BuPaIdentification(Function<ABuPaIdentification_, CqnPredicate> filter);

  ElementRef<String> to_BuPaIdentification_BusinessPartner();

  ElementRef<String> to_BuPaIdentification_BPIdentificationType();

  ElementRef<String> to_BuPaIdentification_BPIdentificationNumber();

  ABuPaIndustry_ to_BuPaIndustry();

  ABuPaIndustry_ to_BuPaIndustry(Function<ABuPaIndustry_, CqnPredicate> filter);

  ElementRef<String> to_BuPaIndustry_IndustrySector();

  ElementRef<String> to_BuPaIndustry_IndustrySystemType();

  ElementRef<String> to_BuPaIndustry_BusinessPartner();

  ABusinessPartnerAddress_ to_BusinessPartnerAddress();

  ABusinessPartnerAddress_ to_BusinessPartnerAddress(
      Function<ABusinessPartnerAddress_, CqnPredicate> filter);

  ElementRef<String> to_BusinessPartnerAddress_BusinessPartner();

  ElementRef<String> to_BusinessPartnerAddress_AddressID();

  ABusinessPartnerBank_ to_BusinessPartnerBank();

  ABusinessPartnerBank_ to_BusinessPartnerBank(
      Function<ABusinessPartnerBank_, CqnPredicate> filter);

  ElementRef<String> to_BusinessPartnerBank_BusinessPartner();

  ElementRef<String> to_BusinessPartnerBank_BankIdentification();

  ABusinessPartnerContact_ to_BusinessPartnerContact();

  ABusinessPartnerContact_ to_BusinessPartnerContact(
      Function<ABusinessPartnerContact_, CqnPredicate> filter);

  ElementRef<String> to_BusinessPartnerContact_RelationshipNumber();

  ElementRef<String> to_BusinessPartnerContact_BusinessPartnerCompany();

  ElementRef<String> to_BusinessPartnerContact_BusinessPartnerPerson();

  ElementRef<LocalDate> to_BusinessPartnerContact_ValidityEndDate();

  ABusinessPartnerRole_ to_BusinessPartnerRole();

  ABusinessPartnerRole_ to_BusinessPartnerRole(
      Function<ABusinessPartnerRole_, CqnPredicate> filter);

  ElementRef<String> to_BusinessPartnerRole_BusinessPartner();

  ElementRef<String> to_BusinessPartnerRole_BusinessPartnerRole();

  ABusinessPartnerTaxNumber_ to_BusinessPartnerTax();

  ABusinessPartnerTaxNumber_ to_BusinessPartnerTax(
      Function<ABusinessPartnerTaxNumber_, CqnPredicate> filter);

  ElementRef<String> to_BusinessPartnerTax_BusinessPartner();

  ElementRef<String> to_BusinessPartnerTax_BPTaxType();

  ACustomer_ to_Customer();

  ACustomer_ to_Customer(Function<ACustomer_, CqnPredicate> filter);

  ElementRef<String> to_Customer_Customer();

  ASupplier_ to_Supplier();

  ASupplier_ to_Supplier(Function<ASupplier_, CqnPredicate> filter);

  ElementRef<String> to_Supplier_Supplier();
}
