package cds.gen.reviewservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.function.Function;

@CdsName("ReviewService.Books")
public interface Books_ extends StructuredType<Books_> {
  String CDS_NAME = "ReviewService.Books";

  ElementRef<String> ID();

  ElementRef<Instant> createdAt();

  ElementRef<Instant> modifiedAt();

  ElementRef<String> title();

  ElementRef<String> descr();

  Authors_ author();

  Authors_ author(Function<Authors_, CqnPredicate> filter);

  ElementRef<String> author_ID();

  Genres_ genre();

  Genres_ genre(Function<Genres_, CqnPredicate> filter);

  ElementRef<Integer> genre_ID();

  ElementRef<Integer> stock();

  ElementRef<BigDecimal> price();

  Currencies_ currency();

  Currencies_ currency(Function<Currencies_, CqnPredicate> filter);

  ElementRef<String> currency_code();

  ElementRef<BigDecimal> rating();

  Reviews_ reviews();

  Reviews_ reviews(Function<Reviews_, CqnPredicate> filter);

  ElementRef<Boolean> isReviewable();

  BooksTexts_ texts();

  BooksTexts_ texts(Function<BooksTexts_, CqnPredicate> filter);

  BooksTexts_ localized();

  BooksTexts_ localized(Function<BooksTexts_, CqnPredicate> filter);
}