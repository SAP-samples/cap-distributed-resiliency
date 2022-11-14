package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;

/**
 * Add asynchronous eventing API
 */
@CdsName("API_BUSINESS_PARTNER.BusinessPartner.Changed")
public interface BusinessPartnerChanged extends CdsData {
  String BUSINESS_PARTNER = "BusinessPartner";

  @CdsName(BUSINESS_PARTNER)
  String getBusinessPartner();

  @CdsName(BUSINESS_PARTNER)
  void setBusinessPartner(String businessPartner);

  static BusinessPartnerChanged create() {
    return Struct.create(BusinessPartnerChanged.class);
  }
}
