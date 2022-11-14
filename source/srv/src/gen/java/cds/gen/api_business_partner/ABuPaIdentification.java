package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import java.time.LocalDate;

@CdsName("API_BUSINESS_PARTNER.A_BuPaIdentification")
public interface ABuPaIdentification extends CdsData {
  String BUSINESS_PARTNER = "BusinessPartner";

  String BPIDENTIFICATION_TYPE = "BPIdentificationType";

  String BPIDENTIFICATION_NUMBER = "BPIdentificationNumber";

  String BPIDN_NMBR_ISSUING_INSTITUTE = "BPIdnNmbrIssuingInstitute";

  String BPIDENTIFICATION_ENTRY_DATE = "BPIdentificationEntryDate";

  String COUNTRY = "Country";

  String REGION = "Region";

  String VALIDITY_START_DATE = "ValidityStartDate";

  String VALIDITY_END_DATE = "ValidityEndDate";

  String AUTHORIZATION_GROUP = "AuthorizationGroup";

  @CdsName(BUSINESS_PARTNER)
  String getBusinessPartner();

  @CdsName(BUSINESS_PARTNER)
  void setBusinessPartner(String businessPartner);

  @CdsName(BPIDENTIFICATION_TYPE)
  String getBPIdentificationType();

  @CdsName(BPIDENTIFICATION_TYPE)
  void setBPIdentificationType(String bPIdentificationType);

  @CdsName(BPIDENTIFICATION_NUMBER)
  String getBPIdentificationNumber();

  @CdsName(BPIDENTIFICATION_NUMBER)
  void setBPIdentificationNumber(String bPIdentificationNumber);

  @CdsName(BPIDN_NMBR_ISSUING_INSTITUTE)
  String getBPIdnNmbrIssuingInstitute();

  @CdsName(BPIDN_NMBR_ISSUING_INSTITUTE)
  void setBPIdnNmbrIssuingInstitute(String bPIdnNmbrIssuingInstitute);

  @CdsName(BPIDENTIFICATION_ENTRY_DATE)
  LocalDate getBPIdentificationEntryDate();

  @CdsName(BPIDENTIFICATION_ENTRY_DATE)
  void setBPIdentificationEntryDate(LocalDate bPIdentificationEntryDate);

  @CdsName(COUNTRY)
  String getCountry();

  @CdsName(COUNTRY)
  void setCountry(String country);

  @CdsName(REGION)
  String getRegion();

  @CdsName(REGION)
  void setRegion(String region);

  @CdsName(VALIDITY_START_DATE)
  LocalDate getValidityStartDate();

  @CdsName(VALIDITY_START_DATE)
  void setValidityStartDate(LocalDate validityStartDate);

  @CdsName(VALIDITY_END_DATE)
  LocalDate getValidityEndDate();

  @CdsName(VALIDITY_END_DATE)
  void setValidityEndDate(LocalDate validityEndDate);

  @CdsName(AUTHORIZATION_GROUP)
  String getAuthorizationGroup();

  @CdsName(AUTHORIZATION_GROUP)
  void setAuthorizationGroup(String authorizationGroup);

  ABuPaIdentification_ ref();

  static ABuPaIdentification create() {
    return Struct.create(ABuPaIdentification.class);
  }
}
