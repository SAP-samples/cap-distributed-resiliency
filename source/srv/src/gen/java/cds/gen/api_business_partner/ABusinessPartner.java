package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.String;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

@CdsName("API_BUSINESS_PARTNER.A_BusinessPartner")
public interface ABusinessPartner extends CdsData {
  String BUSINESS_PARTNER = "BusinessPartner";

  String CUSTOMER = "Customer";

  String SUPPLIER = "Supplier";

  String ACADEMIC_TITLE = "AcademicTitle";

  String AUTHORIZATION_GROUP = "AuthorizationGroup";

  String BUSINESS_PARTNER_CATEGORY = "BusinessPartnerCategory";

  String BUSINESS_PARTNER_FULL_NAME = "BusinessPartnerFullName";

  String BUSINESS_PARTNER_GROUPING = "BusinessPartnerGrouping";

  String BUSINESS_PARTNER_NAME = "BusinessPartnerName";

  String BUSINESS_PARTNER_UUID = "BusinessPartnerUUID";

  String CORRESPONDENCE_LANGUAGE = "CorrespondenceLanguage";

  String CREATED_BY_USER = "CreatedByUser";

  String CREATION_DATE = "CreationDate";

  String CREATION_TIME = "CreationTime";

  String FIRST_NAME = "FirstName";

  String FORM_OF_ADDRESS = "FormOfAddress";

  String INDUSTRY = "Industry";

  String INTERNATIONAL_LOCATION_NUMBER1 = "InternationalLocationNumber1";

  String INTERNATIONAL_LOCATION_NUMBER2 = "InternationalLocationNumber2";

  String IS_FEMALE = "IsFemale";

  String IS_MALE = "IsMale";

  String IS_NATURAL_PERSON = "IsNaturalPerson";

  String IS_SEX_UNKNOWN = "IsSexUnknown";

  String GENDER_CODE_NAME = "GenderCodeName";

  String LANGUAGE = "Language";

  String LAST_CHANGE_DATE = "LastChangeDate";

  String LAST_CHANGE_TIME = "LastChangeTime";

  String LAST_CHANGED_BY_USER = "LastChangedByUser";

  String LAST_NAME = "LastName";

  String LEGAL_FORM = "LegalForm";

  String ORGANIZATION_BPNAME1 = "OrganizationBPName1";

  String ORGANIZATION_BPNAME2 = "OrganizationBPName2";

  String ORGANIZATION_BPNAME3 = "OrganizationBPName3";

  String ORGANIZATION_BPNAME4 = "OrganizationBPName4";

  String ORGANIZATION_FOUNDATION_DATE = "OrganizationFoundationDate";

  String ORGANIZATION_LIQUIDATION_DATE = "OrganizationLiquidationDate";

  String SEARCH_TERM1 = "SearchTerm1";

  String SEARCH_TERM2 = "SearchTerm2";

  String ADDITIONAL_LAST_NAME = "AdditionalLastName";

  String BIRTH_DATE = "BirthDate";

  String BUSINESS_PARTNER_BIRTHPLACE_NAME = "BusinessPartnerBirthplaceName";

  String BUSINESS_PARTNER_IS_BLOCKED = "BusinessPartnerIsBlocked";

  String BUSINESS_PARTNER_TYPE = "BusinessPartnerType";

  String ETAG = "ETag";

  String GROUP_BUSINESS_PARTNER_NAME1 = "GroupBusinessPartnerName1";

  String GROUP_BUSINESS_PARTNER_NAME2 = "GroupBusinessPartnerName2";

  String INDEPENDENT_ADDRESS_ID = "IndependentAddressID";

  String INTERNATIONAL_LOCATION_NUMBER3 = "InternationalLocationNumber3";

  String MIDDLE_NAME = "MiddleName";

  String NAME_COUNTRY = "NameCountry";

  String NAME_FORMAT = "NameFormat";

  String PERSON_FULL_NAME = "PersonFullName";

  String PERSON_NUMBER = "PersonNumber";

  String IS_MARKED_FOR_ARCHIVING = "IsMarkedForArchiving";

  String BUSINESS_PARTNER_IDBY_EXT_SYSTEM = "BusinessPartnerIDByExtSystem";

  String TRADING_PARTNER = "TradingPartner";

  String TO_BU_PA_IDENTIFICATION = "to_BuPaIdentification";

  String TO_BU_PA_IDENTIFICATION_BUSINESS_PARTNER = "to_BuPaIdentification_BusinessPartner";

  String TO_BU_PA_IDENTIFICATION_BPIDENTIFICATION_TYPE = "to_BuPaIdentification_BPIdentificationType";

  String TO_BU_PA_IDENTIFICATION_BPIDENTIFICATION_NUMBER = "to_BuPaIdentification_BPIdentificationNumber";

  String TO_BU_PA_INDUSTRY = "to_BuPaIndustry";

  String TO_BU_PA_INDUSTRY_INDUSTRY_SECTOR = "to_BuPaIndustry_IndustrySector";

  String TO_BU_PA_INDUSTRY_INDUSTRY_SYSTEM_TYPE = "to_BuPaIndustry_IndustrySystemType";

  String TO_BU_PA_INDUSTRY_BUSINESS_PARTNER = "to_BuPaIndustry_BusinessPartner";

  String TO_BUSINESS_PARTNER_ADDRESS = "to_BusinessPartnerAddress";

  String TO_BUSINESS_PARTNER_ADDRESS_BUSINESS_PARTNER = "to_BusinessPartnerAddress_BusinessPartner";

  String TO_BUSINESS_PARTNER_ADDRESS_ADDRESS_ID = "to_BusinessPartnerAddress_AddressID";

  String TO_BUSINESS_PARTNER_BANK = "to_BusinessPartnerBank";

  String TO_BUSINESS_PARTNER_BANK_BUSINESS_PARTNER = "to_BusinessPartnerBank_BusinessPartner";

  String TO_BUSINESS_PARTNER_BANK_BANK_IDENTIFICATION = "to_BusinessPartnerBank_BankIdentification";

  String TO_BUSINESS_PARTNER_CONTACT = "to_BusinessPartnerContact";

  String TO_BUSINESS_PARTNER_CONTACT_RELATIONSHIP_NUMBER = "to_BusinessPartnerContact_RelationshipNumber";

  String TO_BUSINESS_PARTNER_CONTACT_BUSINESS_PARTNER_COMPANY = "to_BusinessPartnerContact_BusinessPartnerCompany";

  String TO_BUSINESS_PARTNER_CONTACT_BUSINESS_PARTNER_PERSON = "to_BusinessPartnerContact_BusinessPartnerPerson";

  String TO_BUSINESS_PARTNER_CONTACT_VALIDITY_END_DATE = "to_BusinessPartnerContact_ValidityEndDate";

  String TO_BUSINESS_PARTNER_ROLE = "to_BusinessPartnerRole";

  String TO_BUSINESS_PARTNER_ROLE_BUSINESS_PARTNER = "to_BusinessPartnerRole_BusinessPartner";

  String TO_BUSINESS_PARTNER_ROLE_BUSINESS_PARTNER_ROLE = "to_BusinessPartnerRole_BusinessPartnerRole";

  String TO_BUSINESS_PARTNER_TAX = "to_BusinessPartnerTax";

  String TO_BUSINESS_PARTNER_TAX_BUSINESS_PARTNER = "to_BusinessPartnerTax_BusinessPartner";

  String TO_BUSINESS_PARTNER_TAX_BPTAX_TYPE = "to_BusinessPartnerTax_BPTaxType";

  String TO_CUSTOMER = "to_Customer";

  String TO_CUSTOMER_CUSTOMER = "to_Customer_Customer";

  String TO_SUPPLIER = "to_Supplier";

  String TO_SUPPLIER_SUPPLIER = "to_Supplier_Supplier";

  @CdsName(BUSINESS_PARTNER)
  String getBusinessPartner();

  @CdsName(BUSINESS_PARTNER)
  void setBusinessPartner(String businessPartner);

  @CdsName(CUSTOMER)
  String getCustomer();

  @CdsName(CUSTOMER)
  void setCustomer(String customer);

  @CdsName(SUPPLIER)
  String getSupplier();

  @CdsName(SUPPLIER)
  void setSupplier(String supplier);

  @CdsName(ACADEMIC_TITLE)
  String getAcademicTitle();

  @CdsName(ACADEMIC_TITLE)
  void setAcademicTitle(String academicTitle);

  @CdsName(AUTHORIZATION_GROUP)
  String getAuthorizationGroup();

  @CdsName(AUTHORIZATION_GROUP)
  void setAuthorizationGroup(String authorizationGroup);

  @CdsName(BUSINESS_PARTNER_CATEGORY)
  String getBusinessPartnerCategory();

  @CdsName(BUSINESS_PARTNER_CATEGORY)
  void setBusinessPartnerCategory(String businessPartnerCategory);

  @CdsName(BUSINESS_PARTNER_FULL_NAME)
  String getBusinessPartnerFullName();

  @CdsName(BUSINESS_PARTNER_FULL_NAME)
  void setBusinessPartnerFullName(String businessPartnerFullName);

  @CdsName(BUSINESS_PARTNER_GROUPING)
  String getBusinessPartnerGrouping();

  @CdsName(BUSINESS_PARTNER_GROUPING)
  void setBusinessPartnerGrouping(String businessPartnerGrouping);

  @CdsName(BUSINESS_PARTNER_NAME)
  String getBusinessPartnerName();

  @CdsName(BUSINESS_PARTNER_NAME)
  void setBusinessPartnerName(String businessPartnerName);

  @CdsName(BUSINESS_PARTNER_UUID)
  String getBusinessPartnerUUID();

  @CdsName(BUSINESS_PARTNER_UUID)
  void setBusinessPartnerUUID(String businessPartnerUUID);

  @CdsName(CORRESPONDENCE_LANGUAGE)
  String getCorrespondenceLanguage();

  @CdsName(CORRESPONDENCE_LANGUAGE)
  void setCorrespondenceLanguage(String correspondenceLanguage);

  @CdsName(CREATED_BY_USER)
  String getCreatedByUser();

  @CdsName(CREATED_BY_USER)
  void setCreatedByUser(String createdByUser);

  @CdsName(CREATION_DATE)
  LocalDate getCreationDate();

  @CdsName(CREATION_DATE)
  void setCreationDate(LocalDate creationDate);

  @CdsName(CREATION_TIME)
  LocalTime getCreationTime();

  @CdsName(CREATION_TIME)
  void setCreationTime(LocalTime creationTime);

  @CdsName(FIRST_NAME)
  String getFirstName();

  @CdsName(FIRST_NAME)
  void setFirstName(String firstName);

  @CdsName(FORM_OF_ADDRESS)
  String getFormOfAddress();

  @CdsName(FORM_OF_ADDRESS)
  void setFormOfAddress(String formOfAddress);

  @CdsName(INDUSTRY)
  String getIndustry();

  @CdsName(INDUSTRY)
  void setIndustry(String industry);

  @CdsName(INTERNATIONAL_LOCATION_NUMBER1)
  String getInternationalLocationNumber1();

  @CdsName(INTERNATIONAL_LOCATION_NUMBER1)
  void setInternationalLocationNumber1(String internationalLocationNumber1);

  @CdsName(INTERNATIONAL_LOCATION_NUMBER2)
  String getInternationalLocationNumber2();

  @CdsName(INTERNATIONAL_LOCATION_NUMBER2)
  void setInternationalLocationNumber2(String internationalLocationNumber2);

  @CdsName(IS_FEMALE)
  Boolean getIsFemale();

  @CdsName(IS_FEMALE)
  void setIsFemale(Boolean isFemale);

  @CdsName(IS_MALE)
  Boolean getIsMale();

  @CdsName(IS_MALE)
  void setIsMale(Boolean isMale);

  @CdsName(IS_NATURAL_PERSON)
  String getIsNaturalPerson();

  @CdsName(IS_NATURAL_PERSON)
  void setIsNaturalPerson(String isNaturalPerson);

  @CdsName(IS_SEX_UNKNOWN)
  Boolean getIsSexUnknown();

  @CdsName(IS_SEX_UNKNOWN)
  void setIsSexUnknown(Boolean isSexUnknown);

  @CdsName(GENDER_CODE_NAME)
  String getGenderCodeName();

  @CdsName(GENDER_CODE_NAME)
  void setGenderCodeName(String genderCodeName);

  @CdsName(LANGUAGE)
  String getLanguage();

  @CdsName(LANGUAGE)
  void setLanguage(String language);

  @CdsName(LAST_CHANGE_DATE)
  LocalDate getLastChangeDate();

  @CdsName(LAST_CHANGE_DATE)
  void setLastChangeDate(LocalDate lastChangeDate);

  @CdsName(LAST_CHANGE_TIME)
  LocalTime getLastChangeTime();

  @CdsName(LAST_CHANGE_TIME)
  void setLastChangeTime(LocalTime lastChangeTime);

  @CdsName(LAST_CHANGED_BY_USER)
  String getLastChangedByUser();

  @CdsName(LAST_CHANGED_BY_USER)
  void setLastChangedByUser(String lastChangedByUser);

  @CdsName(LAST_NAME)
  String getLastName();

  @CdsName(LAST_NAME)
  void setLastName(String lastName);

  @CdsName(LEGAL_FORM)
  String getLegalForm();

  @CdsName(LEGAL_FORM)
  void setLegalForm(String legalForm);

  @CdsName(ORGANIZATION_BPNAME1)
  String getOrganizationBPName1();

  @CdsName(ORGANIZATION_BPNAME1)
  void setOrganizationBPName1(String organizationBPName1);

  @CdsName(ORGANIZATION_BPNAME2)
  String getOrganizationBPName2();

  @CdsName(ORGANIZATION_BPNAME2)
  void setOrganizationBPName2(String organizationBPName2);

  @CdsName(ORGANIZATION_BPNAME3)
  String getOrganizationBPName3();

  @CdsName(ORGANIZATION_BPNAME3)
  void setOrganizationBPName3(String organizationBPName3);

  @CdsName(ORGANIZATION_BPNAME4)
  String getOrganizationBPName4();

  @CdsName(ORGANIZATION_BPNAME4)
  void setOrganizationBPName4(String organizationBPName4);

  @CdsName(ORGANIZATION_FOUNDATION_DATE)
  LocalDate getOrganizationFoundationDate();

  @CdsName(ORGANIZATION_FOUNDATION_DATE)
  void setOrganizationFoundationDate(LocalDate organizationFoundationDate);

  @CdsName(ORGANIZATION_LIQUIDATION_DATE)
  LocalDate getOrganizationLiquidationDate();

  @CdsName(ORGANIZATION_LIQUIDATION_DATE)
  void setOrganizationLiquidationDate(LocalDate organizationLiquidationDate);

  @CdsName(SEARCH_TERM1)
  String getSearchTerm1();

  @CdsName(SEARCH_TERM1)
  void setSearchTerm1(String searchTerm1);

  @CdsName(SEARCH_TERM2)
  String getSearchTerm2();

  @CdsName(SEARCH_TERM2)
  void setSearchTerm2(String searchTerm2);

  @CdsName(ADDITIONAL_LAST_NAME)
  String getAdditionalLastName();

  @CdsName(ADDITIONAL_LAST_NAME)
  void setAdditionalLastName(String additionalLastName);

  @CdsName(BIRTH_DATE)
  LocalDate getBirthDate();

  @CdsName(BIRTH_DATE)
  void setBirthDate(LocalDate birthDate);

  @CdsName(BUSINESS_PARTNER_BIRTHPLACE_NAME)
  String getBusinessPartnerBirthplaceName();

  @CdsName(BUSINESS_PARTNER_BIRTHPLACE_NAME)
  void setBusinessPartnerBirthplaceName(String businessPartnerBirthplaceName);

  @CdsName(BUSINESS_PARTNER_IS_BLOCKED)
  Boolean getBusinessPartnerIsBlocked();

  @CdsName(BUSINESS_PARTNER_IS_BLOCKED)
  void setBusinessPartnerIsBlocked(Boolean businessPartnerIsBlocked);

  @CdsName(BUSINESS_PARTNER_TYPE)
  String getBusinessPartnerType();

  @CdsName(BUSINESS_PARTNER_TYPE)
  void setBusinessPartnerType(String businessPartnerType);

  @CdsName(ETAG)
  String getETag();

  @CdsName(ETAG)
  void setETag(String eTag);

  @CdsName(GROUP_BUSINESS_PARTNER_NAME1)
  String getGroupBusinessPartnerName1();

  @CdsName(GROUP_BUSINESS_PARTNER_NAME1)
  void setGroupBusinessPartnerName1(String groupBusinessPartnerName1);

  @CdsName(GROUP_BUSINESS_PARTNER_NAME2)
  String getGroupBusinessPartnerName2();

  @CdsName(GROUP_BUSINESS_PARTNER_NAME2)
  void setGroupBusinessPartnerName2(String groupBusinessPartnerName2);

  @CdsName(INDEPENDENT_ADDRESS_ID)
  String getIndependentAddressID();

  @CdsName(INDEPENDENT_ADDRESS_ID)
  void setIndependentAddressID(String independentAddressID);

  @CdsName(INTERNATIONAL_LOCATION_NUMBER3)
  String getInternationalLocationNumber3();

  @CdsName(INTERNATIONAL_LOCATION_NUMBER3)
  void setInternationalLocationNumber3(String internationalLocationNumber3);

  @CdsName(MIDDLE_NAME)
  String getMiddleName();

  @CdsName(MIDDLE_NAME)
  void setMiddleName(String middleName);

  @CdsName(NAME_COUNTRY)
  String getNameCountry();

  @CdsName(NAME_COUNTRY)
  void setNameCountry(String nameCountry);

  @CdsName(NAME_FORMAT)
  String getNameFormat();

  @CdsName(NAME_FORMAT)
  void setNameFormat(String nameFormat);

  @CdsName(PERSON_FULL_NAME)
  String getPersonFullName();

  @CdsName(PERSON_FULL_NAME)
  void setPersonFullName(String personFullName);

  @CdsName(PERSON_NUMBER)
  String getPersonNumber();

  @CdsName(PERSON_NUMBER)
  void setPersonNumber(String personNumber);

  @CdsName(IS_MARKED_FOR_ARCHIVING)
  Boolean getIsMarkedForArchiving();

  @CdsName(IS_MARKED_FOR_ARCHIVING)
  void setIsMarkedForArchiving(Boolean isMarkedForArchiving);

  @CdsName(BUSINESS_PARTNER_IDBY_EXT_SYSTEM)
  String getBusinessPartnerIDByExtSystem();

  @CdsName(BUSINESS_PARTNER_IDBY_EXT_SYSTEM)
  void setBusinessPartnerIDByExtSystem(String businessPartnerIDByExtSystem);

  @CdsName(TRADING_PARTNER)
  String getTradingPartner();

  @CdsName(TRADING_PARTNER)
  void setTradingPartner(String tradingPartner);

  @CdsName(TO_BU_PA_IDENTIFICATION)
  List<ABuPaIdentification> getToBuPaIdentification();

  @CdsName(TO_BU_PA_IDENTIFICATION)
  void setToBuPaIdentification(List<? extends Map<String, ?>> toBuPaIdentification);

  @CdsName(TO_BU_PA_IDENTIFICATION_BUSINESS_PARTNER)
  String getToBuPaIdentificationBusinessPartner();

  @CdsName(TO_BU_PA_IDENTIFICATION_BUSINESS_PARTNER)
  void setToBuPaIdentificationBusinessPartner(String toBuPaIdentificationBusinessPartner);

  @CdsName(TO_BU_PA_IDENTIFICATION_BPIDENTIFICATION_TYPE)
  String getToBuPaIdentificationBPIdentificationType();

  @CdsName(TO_BU_PA_IDENTIFICATION_BPIDENTIFICATION_TYPE)
  void setToBuPaIdentificationBPIdentificationType(String toBuPaIdentificationBPIdentificationType);

  @CdsName(TO_BU_PA_IDENTIFICATION_BPIDENTIFICATION_NUMBER)
  String getToBuPaIdentificationBPIdentificationNumber();

  @CdsName(TO_BU_PA_IDENTIFICATION_BPIDENTIFICATION_NUMBER)
  void setToBuPaIdentificationBPIdentificationNumber(
      String toBuPaIdentificationBPIdentificationNumber);

  @CdsName(TO_BU_PA_INDUSTRY)
  List<ABuPaIndustry> getToBuPaIndustry();

  @CdsName(TO_BU_PA_INDUSTRY)
  void setToBuPaIndustry(List<? extends Map<String, ?>> toBuPaIndustry);

  @CdsName(TO_BU_PA_INDUSTRY_INDUSTRY_SECTOR)
  String getToBuPaIndustryIndustrySector();

  @CdsName(TO_BU_PA_INDUSTRY_INDUSTRY_SECTOR)
  void setToBuPaIndustryIndustrySector(String toBuPaIndustryIndustrySector);

  @CdsName(TO_BU_PA_INDUSTRY_INDUSTRY_SYSTEM_TYPE)
  String getToBuPaIndustryIndustrySystemType();

  @CdsName(TO_BU_PA_INDUSTRY_INDUSTRY_SYSTEM_TYPE)
  void setToBuPaIndustryIndustrySystemType(String toBuPaIndustryIndustrySystemType);

  @CdsName(TO_BU_PA_INDUSTRY_BUSINESS_PARTNER)
  String getToBuPaIndustryBusinessPartner();

  @CdsName(TO_BU_PA_INDUSTRY_BUSINESS_PARTNER)
  void setToBuPaIndustryBusinessPartner(String toBuPaIndustryBusinessPartner);

  @CdsName(TO_BUSINESS_PARTNER_ADDRESS)
  List<ABusinessPartnerAddress> getToBusinessPartnerAddress();

  @CdsName(TO_BUSINESS_PARTNER_ADDRESS)
  void setToBusinessPartnerAddress(List<? extends Map<String, ?>> toBusinessPartnerAddress);

  @CdsName(TO_BUSINESS_PARTNER_ADDRESS_BUSINESS_PARTNER)
  String getToBusinessPartnerAddressBusinessPartner();

  @CdsName(TO_BUSINESS_PARTNER_ADDRESS_BUSINESS_PARTNER)
  void setToBusinessPartnerAddressBusinessPartner(String toBusinessPartnerAddressBusinessPartner);

  @CdsName(TO_BUSINESS_PARTNER_ADDRESS_ADDRESS_ID)
  String getToBusinessPartnerAddressAddressID();

  @CdsName(TO_BUSINESS_PARTNER_ADDRESS_ADDRESS_ID)
  void setToBusinessPartnerAddressAddressID(String toBusinessPartnerAddressAddressID);

  @CdsName(TO_BUSINESS_PARTNER_BANK)
  List<ABusinessPartnerBank> getToBusinessPartnerBank();

  @CdsName(TO_BUSINESS_PARTNER_BANK)
  void setToBusinessPartnerBank(List<? extends Map<String, ?>> toBusinessPartnerBank);

  @CdsName(TO_BUSINESS_PARTNER_BANK_BUSINESS_PARTNER)
  String getToBusinessPartnerBankBusinessPartner();

  @CdsName(TO_BUSINESS_PARTNER_BANK_BUSINESS_PARTNER)
  void setToBusinessPartnerBankBusinessPartner(String toBusinessPartnerBankBusinessPartner);

  @CdsName(TO_BUSINESS_PARTNER_BANK_BANK_IDENTIFICATION)
  String getToBusinessPartnerBankBankIdentification();

  @CdsName(TO_BUSINESS_PARTNER_BANK_BANK_IDENTIFICATION)
  void setToBusinessPartnerBankBankIdentification(String toBusinessPartnerBankBankIdentification);

  @CdsName(TO_BUSINESS_PARTNER_CONTACT)
  List<ABusinessPartnerContact> getToBusinessPartnerContact();

  @CdsName(TO_BUSINESS_PARTNER_CONTACT)
  void setToBusinessPartnerContact(List<? extends Map<String, ?>> toBusinessPartnerContact);

  @CdsName(TO_BUSINESS_PARTNER_CONTACT_RELATIONSHIP_NUMBER)
  String getToBusinessPartnerContactRelationshipNumber();

  @CdsName(TO_BUSINESS_PARTNER_CONTACT_RELATIONSHIP_NUMBER)
  void setToBusinessPartnerContactRelationshipNumber(
      String toBusinessPartnerContactRelationshipNumber);

  @CdsName(TO_BUSINESS_PARTNER_CONTACT_BUSINESS_PARTNER_COMPANY)
  String getToBusinessPartnerContactBusinessPartnerCompany();

  @CdsName(TO_BUSINESS_PARTNER_CONTACT_BUSINESS_PARTNER_COMPANY)
  void setToBusinessPartnerContactBusinessPartnerCompany(
      String toBusinessPartnerContactBusinessPartnerCompany);

  @CdsName(TO_BUSINESS_PARTNER_CONTACT_BUSINESS_PARTNER_PERSON)
  String getToBusinessPartnerContactBusinessPartnerPerson();

  @CdsName(TO_BUSINESS_PARTNER_CONTACT_BUSINESS_PARTNER_PERSON)
  void setToBusinessPartnerContactBusinessPartnerPerson(
      String toBusinessPartnerContactBusinessPartnerPerson);

  @CdsName(TO_BUSINESS_PARTNER_CONTACT_VALIDITY_END_DATE)
  LocalDate getToBusinessPartnerContactValidityEndDate();

  @CdsName(TO_BUSINESS_PARTNER_CONTACT_VALIDITY_END_DATE)
  void setToBusinessPartnerContactValidityEndDate(
      LocalDate toBusinessPartnerContactValidityEndDate);

  @CdsName(TO_BUSINESS_PARTNER_ROLE)
  List<ABusinessPartnerRole> getToBusinessPartnerRole();

  @CdsName(TO_BUSINESS_PARTNER_ROLE)
  void setToBusinessPartnerRole(List<? extends Map<String, ?>> toBusinessPartnerRole);

  @CdsName(TO_BUSINESS_PARTNER_ROLE_BUSINESS_PARTNER)
  String getToBusinessPartnerRoleBusinessPartner();

  @CdsName(TO_BUSINESS_PARTNER_ROLE_BUSINESS_PARTNER)
  void setToBusinessPartnerRoleBusinessPartner(String toBusinessPartnerRoleBusinessPartner);

  @CdsName(TO_BUSINESS_PARTNER_ROLE_BUSINESS_PARTNER_ROLE)
  String getToBusinessPartnerRoleBusinessPartnerRole();

  @CdsName(TO_BUSINESS_PARTNER_ROLE_BUSINESS_PARTNER_ROLE)
  void setToBusinessPartnerRoleBusinessPartnerRole(String toBusinessPartnerRoleBusinessPartnerRole);

  @CdsName(TO_BUSINESS_PARTNER_TAX)
  List<ABusinessPartnerTaxNumber> getToBusinessPartnerTax();

  @CdsName(TO_BUSINESS_PARTNER_TAX)
  void setToBusinessPartnerTax(List<? extends Map<String, ?>> toBusinessPartnerTax);

  @CdsName(TO_BUSINESS_PARTNER_TAX_BUSINESS_PARTNER)
  String getToBusinessPartnerTaxBusinessPartner();

  @CdsName(TO_BUSINESS_PARTNER_TAX_BUSINESS_PARTNER)
  void setToBusinessPartnerTaxBusinessPartner(String toBusinessPartnerTaxBusinessPartner);

  @CdsName(TO_BUSINESS_PARTNER_TAX_BPTAX_TYPE)
  String getToBusinessPartnerTaxBPTaxType();

  @CdsName(TO_BUSINESS_PARTNER_TAX_BPTAX_TYPE)
  void setToBusinessPartnerTaxBPTaxType(String toBusinessPartnerTaxBPTaxType);

  @CdsName(TO_CUSTOMER)
  ACustomer getToCustomer();

  @CdsName(TO_CUSTOMER)
  void setToCustomer(Map<String, ?> toCustomer);

  @CdsName(TO_CUSTOMER_CUSTOMER)
  String getToCustomerCustomer();

  @CdsName(TO_CUSTOMER_CUSTOMER)
  void setToCustomerCustomer(String toCustomerCustomer);

  @CdsName(TO_SUPPLIER)
  ASupplier getToSupplier();

  @CdsName(TO_SUPPLIER)
  void setToSupplier(Map<String, ?> toSupplier);

  @CdsName(TO_SUPPLIER_SUPPLIER)
  String getToSupplierSupplier();

  @CdsName(TO_SUPPLIER_SUPPLIER)
  void setToSupplierSupplier(String toSupplierSupplier);

  ABusinessPartner_ ref();

  static ABusinessPartner create() {
    return Struct.create(ABusinessPartner.class);
  }
}
