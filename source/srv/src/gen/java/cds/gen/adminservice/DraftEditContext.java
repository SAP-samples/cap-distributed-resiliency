package cds.gen.adminservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.cqn.CqnSelect;
import com.sap.cds.services.EventContext;
import com.sap.cds.services.EventName;
import java.lang.Boolean;
import java.lang.String;

@EventName("draftEdit")
public interface DraftEditContext extends EventContext {
  String PRESERVE_CHANGES = "PreserveChanges";

  String CDS_NAME = "draftEdit";

  @CdsName(PRESERVE_CHANGES)
  Boolean getPreserveChanges();

  @CdsName(PRESERVE_CHANGES)
  void setPreserveChanges(Boolean preserveChanges);

  CqnSelect getCqn();

  void setCqn(CqnSelect select);

  static DraftEditContext create() {
    return EventContext.create(DraftEditContext.class, "AdminService.Orders");
  }

  void setResult(Orders result);

  Orders getResult();

  static DraftEditContext create(String entityName) {
    return EventContext.create(DraftEditContext.class, entityName);
  }
}
