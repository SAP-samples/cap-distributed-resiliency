package cds.gen.reviewservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.cqn.CqnSelect;
import com.sap.cds.services.EventContext;
import com.sap.cds.services.EventName;
import java.lang.String;

@EventName("draftPrepare")
public interface DraftPrepareContext extends EventContext {
  String SIDE_EFFECTS_QUALIFIER = "SideEffectsQualifier";

  String CDS_NAME = "draftPrepare";

  @CdsName(SIDE_EFFECTS_QUALIFIER)
  String getSideEffectsQualifier();

  @CdsName(SIDE_EFFECTS_QUALIFIER)
  void setSideEffectsQualifier(String sideEffectsQualifier);

  CqnSelect getCqn();

  void setCqn(CqnSelect select);

  static DraftPrepareContext create() {
    return EventContext.create(DraftPrepareContext.class, "ReviewService.Reviews");
  }

  void setResult(Reviews result);

  Reviews getResult();

  static DraftPrepareContext create(String entityName) {
    return EventContext.create(DraftPrepareContext.class, entityName);
  }
}
