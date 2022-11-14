package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;

@CdsName("API_BUSINESS_PARTNER.A_BusinessPartnerTaxNumber")
public interface ABusinessPartnerTaxNumber extends CdsData {
  String BUSINESS_PARTNER = "BusinessPartner";

  String BPTAX_TYPE = "BPTaxType";

  String BPTAX_NUMBER = "BPTaxNumber";

  String BPTAX_LONG_NUMBER = "BPTaxLongNumber";

  String AUTHORIZATION_GROUP = "AuthorizationGroup";

  @CdsName(BUSINESS_PARTNER)
  String getBusinessPartner();

  @CdsName(BUSINESS_PARTNER)
  void setBusinessPartner(String businessPartner);

  @CdsName(BPTAX_TYPE)
  String getBPTaxType();

  @CdsName(BPTAX_TYPE)
  void setBPTaxType(String bPTaxType);

  @CdsName(BPTAX_NUMBER)
  String getBPTaxNumber();

  @CdsName(BPTAX_NUMBER)
  void setBPTaxNumber(String bPTaxNumber);

  @CdsName(BPTAX_LONG_NUMBER)
  String getBPTaxLongNumber();

  @CdsName(BPTAX_LONG_NUMBER)
  void setBPTaxLongNumber(String bPTaxLongNumber);

  @CdsName(AUTHORIZATION_GROUP)
  String getAuthorizationGroup();

  @CdsName(AUTHORIZATION_GROUP)
  void setAuthorizationGroup(String authorizationGroup);

  ABusinessPartnerTaxNumber_ ref();

  static ABusinessPartnerTaxNumber create() {
    return Struct.create(ABusinessPartnerTaxNumber.class);
  }
}
