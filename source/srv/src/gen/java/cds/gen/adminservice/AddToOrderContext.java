package cds.gen.adminservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.cqn.CqnSelect;
import com.sap.cds.services.EventContext;
import com.sap.cds.services.EventName;
import java.lang.Integer;
import java.lang.String;

@EventName("addToOrder")
public interface AddToOrderContext extends EventContext {
  String ORDER_ID = "order_ID";

  String QUANTITY = "quantity";

  String CDS_NAME = "addToOrder";

  @CdsName(ORDER_ID)
  String getOrderId();

  @CdsName(ORDER_ID)
  void setOrderId(String orderId);

  Integer getQuantity();

  void setQuantity(Integer quantity);

  CqnSelect getCqn();

  void setCqn(CqnSelect select);

  static AddToOrderContext create() {
    return EventContext.create(AddToOrderContext.class, "AdminService.Books");
  }

  void setResult(Orders result);

  Orders getResult();

  static AddToOrderContext create(String entityName) {
    return EventContext.create(AddToOrderContext.class, entityName);
  }
}
