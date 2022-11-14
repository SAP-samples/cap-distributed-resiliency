package cds.gen.reviewservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.time.Instant;
import java.util.function.Function;

@CdsName("ReviewService.Reviews")
public interface Reviews_ extends StructuredType<Reviews_> {
  String CDS_NAME = "ReviewService.Reviews";

  ElementRef<String> ID();

  ElementRef<Instant> createdAt();

  ElementRef<String> createdBy();

  ElementRef<Instant> modifiedAt();

  ElementRef<String> modifiedBy();

  Books_ book();

  Books_ book(Function<Books_, CqnPredicate> filter);

  ElementRef<String> book_ID();

  ElementRef<Integer> rating();

  ElementRef<String> title();

  ElementRef<String> text();

  ElementRef<Boolean> IsActiveEntity();

  ElementRef<Boolean> HasActiveEntity();

  ElementRef<Boolean> HasDraftEntity();

  DraftAdministrativeData_ DraftAdministrativeData();

  DraftAdministrativeData_ DraftAdministrativeData(
      Function<DraftAdministrativeData_, CqnPredicate> filter);

  ElementRef<String> DraftAdministrativeData_DraftUUID();

  Reviews_ SiblingEntity();

  Reviews_ SiblingEntity(Function<Reviews_, CqnPredicate> filter);
}
