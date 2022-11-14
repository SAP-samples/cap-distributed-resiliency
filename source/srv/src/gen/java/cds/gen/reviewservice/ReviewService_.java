package cds.gen.reviewservice;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;

@CdsName("ReviewService")
public interface ReviewService_ {
  String CDS_NAME = "ReviewService";

  Class<Books_> BOOKS = Books_.class;

  Class<Authors_> AUTHORS = Authors_.class;

  Class<GenresTexts_> GENRES_TEXTS = GenresTexts_.class;

  Class<Genres_> GENRES = Genres_.class;

  Class<DraftAdministrativeData_> DRAFT_ADMINISTRATIVE_DATA = DraftAdministrativeData_.class;

  Class<Reviews_> REVIEWS = Reviews_.class;

  Class<Currencies_> CURRENCIES = Currencies_.class;

  Class<CurrenciesTexts_> CURRENCIES_TEXTS = CurrenciesTexts_.class;

  Class<BooksTexts_> BOOKS_TEXTS = BooksTexts_.class;
}
