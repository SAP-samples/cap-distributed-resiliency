package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.String;
import java.time.Instant;

@CdsName("API_BUSINESS_PARTNER.A_BuPaAddressUsage")
public interface ABuPaAddressUsage extends CdsData {
  String BUSINESS_PARTNER = "BusinessPartner";

  String VALIDITY_END_DATE = "ValidityEndDate";

  String ADDRESS_USAGE = "AddressUsage";

  String ADDRESS_ID = "AddressID";

  String VALIDITY_START_DATE = "ValidityStartDate";

  String STANDARD_USAGE = "StandardUsage";

  String AUTHORIZATION_GROUP = "AuthorizationGroup";

  @CdsName(BUSINESS_PARTNER)
  String getBusinessPartner();

  @CdsName(BUSINESS_PARTNER)
  void setBusinessPartner(String businessPartner);

  @CdsName(VALIDITY_END_DATE)
  Instant getValidityEndDate();

  @CdsName(VALIDITY_END_DATE)
  void setValidityEndDate(Instant validityEndDate);

  @CdsName(ADDRESS_USAGE)
  String getAddressUsage();

  @CdsName(ADDRESS_USAGE)
  void setAddressUsage(String addressUsage);

  @CdsName(ADDRESS_ID)
  String getAddressID();

  @CdsName(ADDRESS_ID)
  void setAddressID(String addressID);

  @CdsName(VALIDITY_START_DATE)
  Instant getValidityStartDate();

  @CdsName(VALIDITY_START_DATE)
  void setValidityStartDate(Instant validityStartDate);

  @CdsName(STANDARD_USAGE)
  Boolean getStandardUsage();

  @CdsName(STANDARD_USAGE)
  void setStandardUsage(Boolean standardUsage);

  @CdsName(AUTHORIZATION_GROUP)
  String getAuthorizationGroup();

  @CdsName(AUTHORIZATION_GROUP)
  void setAuthorizationGroup(String authorizationGroup);

  ABuPaAddressUsage_ ref();

  static ABuPaAddressUsage create() {
    return Struct.create(ABuPaAddressUsage.class);
  }
}
