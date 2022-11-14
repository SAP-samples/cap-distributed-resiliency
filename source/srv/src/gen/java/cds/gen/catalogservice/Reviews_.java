package cds.gen.catalogservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.time.Instant;
import java.util.function.Function;

@CdsName("CatalogService.Reviews")
public interface Reviews_ extends StructuredType<Reviews_> {
  String CDS_NAME = "CatalogService.Reviews";

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
}
