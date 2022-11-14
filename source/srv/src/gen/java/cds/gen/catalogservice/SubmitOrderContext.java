package cds.gen.catalogservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.services.EventContext;
import com.sap.cds.services.EventName;
import java.lang.Integer;
import java.lang.String;

@EventName("submitOrder")
public interface SubmitOrderContext extends EventContext {
  String BOOK = "book";

  String QUANTITY = "quantity";

  String CDS_NAME = "submitOrder";

  String getBook();

  void setBook(String book);

  Integer getQuantity();

  void setQuantity(Integer quantity);

  void setResult(ReturnType result);

  ReturnType getResult();

  static SubmitOrderContext create() {
    return EventContext.create(SubmitOrderContext.class, null);
  }

  interface ReturnType extends CdsData {
    String STOCK = "stock";

    Integer getStock();

    void setStock(Integer stock);

    static ReturnType create() {
      return Struct.create(ReturnType.class);
    }
  }
}
