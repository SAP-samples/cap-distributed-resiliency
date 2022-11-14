package cds.gen.catalogservice;

import com.sap.cds.ql.cqn.CqnSelect;
import com.sap.cds.services.EventContext;
import com.sap.cds.services.EventName;
import java.lang.Integer;
import java.lang.String;

@EventName("addReview")
public interface AddReviewContext extends EventContext {
  String RATING = "rating";

  String TITLE = "title";

  String TEXT = "text";

  String CDS_NAME = "addReview";

  Integer getRating();

  void setRating(Integer rating);

  String getTitle();

  void setTitle(String title);

  String getText();

  void setText(String text);

  CqnSelect getCqn();

  void setCqn(CqnSelect select);

  static AddReviewContext create() {
    return EventContext.create(AddReviewContext.class, "CatalogService.Books");
  }

  void setResult(Reviews result);

  Reviews getResult();

  static AddReviewContext create(String entityName) {
    return EventContext.create(AddReviewContext.class, entityName);
  }
}
