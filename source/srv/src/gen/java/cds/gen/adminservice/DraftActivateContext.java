package cds.gen.adminservice;

import com.sap.cds.ql.cqn.CqnSelect;
import com.sap.cds.services.EventContext;
import com.sap.cds.services.EventName;
import java.lang.String;

@EventName("draftActivate")
public interface DraftActivateContext extends EventContext {
  String CDS_NAME = "draftActivate";

  CqnSelect getCqn();

  void setCqn(CqnSelect select);

  static DraftActivateContext create() {
    return EventContext.create(DraftActivateContext.class, "AdminService.Orders");
  }

  void setResult(Orders result);

  Orders getResult();

  static DraftActivateContext create(String entityName) {
    return EventContext.create(DraftActivateContext.class, entityName);
  }
}
