package cds.gen.catalogservice;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;

@CdsName("CatalogService")
public interface CatalogService_ {
  String CDS_NAME = "CatalogService";

  Class<GenresTexts_> GENRES_TEXTS = GenresTexts_.class;

  Class<CurrenciesTexts_> CURRENCIES_TEXTS = CurrenciesTexts_.class;

  Class<Authors_> AUTHORS = Authors_.class;

  Class<Books_> BOOKS = Books_.class;

  Class<Reviews_> REVIEWS = Reviews_.class;

  Class<BooksTexts_> BOOKS_TEXTS = BooksTexts_.class;

  Class<Currencies_> CURRENCIES = Currencies_.class;

  Class<Genres_> GENRES = Genres_.class;
}
