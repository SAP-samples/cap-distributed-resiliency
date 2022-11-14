package cds.gen.reviewservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;

/**
 * Hierarchically organized Code List for Genres
 */
@CdsName("ReviewService.Genres")
public interface Genres_ extends StructuredType<Genres_> {
  String CDS_NAME = "ReviewService.Genres";

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<Integer> ID();

  Genres_ parent();

  Genres_ parent(Function<Genres_, CqnPredicate> filter);

  ElementRef<Integer> parent_ID();

  Genres_ children();

  Genres_ children(Function<Genres_, CqnPredicate> filter);

  GenresTexts_ texts();

  GenresTexts_ texts(Function<GenresTexts_, CqnPredicate> filter);

  GenresTexts_ localized();

  GenresTexts_ localized(Function<GenresTexts_, CqnPredicate> filter);
}
