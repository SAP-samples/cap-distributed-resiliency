package cds.gen.api_business_partner;

import com.sap.cds.services.EventContext;
import com.sap.cds.services.EventName;
import java.lang.String;

/**
 * Add asynchronous eventing API
 */
@EventName("BusinessPartner.Changed")
public interface BusinessPartnerChangedContext extends EventContext {
  String CDS_NAME = "BusinessPartner.Changed";

  BusinessPartnerChanged getData();

  void setData(BusinessPartnerChanged event);

  static BusinessPartnerChangedContext create() {
    return EventContext.create(BusinessPartnerChangedContext.class, null);
  }
}
