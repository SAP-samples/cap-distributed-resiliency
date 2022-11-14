package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import java.time.Instant;

@CdsName("API_BUSINESS_PARTNER.A_BusinessPartnerRole")
public interface ABusinessPartnerRole extends CdsData {
  String BUSINESS_PARTNER = "BusinessPartner";

  String BUSINESS_PARTNER_ROLE = "BusinessPartnerRole";

  String VALID_FROM = "ValidFrom";

  String VALID_TO = "ValidTo";

  String AUTHORIZATION_GROUP = "AuthorizationGroup";

  @CdsName(BUSINESS_PARTNER)
  String getBusinessPartner();

  @CdsName(BUSINESS_PARTNER)
  void setBusinessPartner(String businessPartner);

  @CdsName(BUSINESS_PARTNER_ROLE)
  String getBusinessPartnerRole();

  @CdsName(BUSINESS_PARTNER_ROLE)
  void setBusinessPartnerRole(String businessPartnerRole);

  @CdsName(VALID_FROM)
  Instant getValidFrom();

  @CdsName(VALID_FROM)
  void setValidFrom(Instant validFrom);

  @CdsName(VALID_TO)
  Instant getValidTo();

  @CdsName(VALID_TO)
  void setValidTo(Instant validTo);

  @CdsName(AUTHORIZATION_GROUP)
  String getAuthorizationGroup();

  @CdsName(AUTHORIZATION_GROUP)
  void setAuthorizationGroup(String authorizationGroup);

  ABusinessPartnerRole_ ref();

  static ABusinessPartnerRole create() {
    return Struct.create(ABusinessPartnerRole.class);
  }
}
