DROP VIEW IF EXISTS localized_fr_AdminService_Orders;
DROP VIEW IF EXISTS localized_de_AdminService_Orders;
DROP VIEW IF EXISTS localized_fr_ReviewService_Authors;
DROP VIEW IF EXISTS localized_de_ReviewService_Authors;
DROP VIEW IF EXISTS localized_fr_ReviewService_Reviews;
DROP VIEW IF EXISTS localized_de_ReviewService_Reviews;
DROP VIEW IF EXISTS localized_fr_CatalogService_Reviews;
DROP VIEW IF EXISTS localized_de_CatalogService_Reviews;
DROP VIEW IF EXISTS localized_fr_CatalogService_Authors;
DROP VIEW IF EXISTS localized_de_CatalogService_Authors;
DROP VIEW IF EXISTS localized_fr_AdminService_OrderItems;
DROP VIEW IF EXISTS localized_de_AdminService_OrderItems;
DROP VIEW IF EXISTS localized_fr_AdminService_Authors;
DROP VIEW IF EXISTS localized_de_AdminService_Authors;
DROP VIEW IF EXISTS localized_fr_ReviewService_Currencies;
DROP VIEW IF EXISTS localized_de_ReviewService_Currencies;
DROP VIEW IF EXISTS localized_fr_ReviewService_Genres;
DROP VIEW IF EXISTS localized_de_ReviewService_Genres;
DROP VIEW IF EXISTS localized_fr_CatalogService_Currencies;
DROP VIEW IF EXISTS localized_de_CatalogService_Currencies;
DROP VIEW IF EXISTS localized_fr_CatalogService_Genres;
DROP VIEW IF EXISTS localized_de_CatalogService_Genres;
DROP VIEW IF EXISTS localized_fr_AdminService_Currencies;
DROP VIEW IF EXISTS localized_de_AdminService_Currencies;
DROP VIEW IF EXISTS localized_fr_AdminService_Genres;
DROP VIEW IF EXISTS localized_de_AdminService_Genres;
DROP VIEW IF EXISTS localized_fr_ReviewService_Books;
DROP VIEW IF EXISTS localized_de_ReviewService_Books;
DROP VIEW IF EXISTS localized_fr_CatalogService_Books;
DROP VIEW IF EXISTS localized_de_CatalogService_Books;
DROP VIEW IF EXISTS localized_fr_AdminService_Languages;
DROP VIEW IF EXISTS localized_de_AdminService_Languages;
DROP VIEW IF EXISTS localized_fr_AdminService_Books;
DROP VIEW IF EXISTS localized_de_AdminService_Books;
DROP VIEW IF EXISTS localized_fr_my_bookshop_Reviews;
DROP VIEW IF EXISTS localized_de_my_bookshop_Reviews;
DROP VIEW IF EXISTS localized_fr_my_bookshop_OrderItems;
DROP VIEW IF EXISTS localized_de_my_bookshop_OrderItems;
DROP VIEW IF EXISTS localized_fr_my_bookshop_Orders;
DROP VIEW IF EXISTS localized_de_my_bookshop_Orders;
DROP VIEW IF EXISTS localized_fr_my_bookshop_Authors;
DROP VIEW IF EXISTS localized_de_my_bookshop_Authors;
DROP VIEW IF EXISTS localized_fr_my_bookshop_Genres;
DROP VIEW IF EXISTS localized_de_my_bookshop_Genres;
DROP VIEW IF EXISTS localized_fr_my_bookshop_Books;
DROP VIEW IF EXISTS localized_de_my_bookshop_Books;
DROP VIEW IF EXISTS localized_fr_sap_common_Currencies;
DROP VIEW IF EXISTS localized_de_sap_common_Currencies;
DROP VIEW IF EXISTS localized_fr_sap_common_Languages;
DROP VIEW IF EXISTS localized_de_sap_common_Languages;
DROP VIEW IF EXISTS localized_AdminService_Orders;
DROP VIEW IF EXISTS localized_ReviewService_Authors;
DROP VIEW IF EXISTS localized_ReviewService_Reviews;
DROP VIEW IF EXISTS localized_CatalogService_Reviews;
DROP VIEW IF EXISTS localized_CatalogService_Authors;
DROP VIEW IF EXISTS localized_AdminService_OrderItems;
DROP VIEW IF EXISTS localized_AdminService_Authors;
DROP VIEW IF EXISTS localized_ReviewService_Currencies;
DROP VIEW IF EXISTS localized_ReviewService_Genres;
DROP VIEW IF EXISTS localized_CatalogService_Currencies;
DROP VIEW IF EXISTS localized_CatalogService_Genres;
DROP VIEW IF EXISTS localized_AdminService_Currencies;
DROP VIEW IF EXISTS localized_AdminService_Genres;
DROP VIEW IF EXISTS localized_ReviewService_Books;
DROP VIEW IF EXISTS localized_CatalogService_Books;
DROP VIEW IF EXISTS localized_AdminService_Languages;
DROP VIEW IF EXISTS localized_AdminService_Books;
DROP VIEW IF EXISTS ReviewService_DraftAdministrativeData;
DROP VIEW IF EXISTS AdminService_DraftAdministrativeData;
DROP VIEW IF EXISTS localized_my_bookshop_Reviews;
DROP VIEW IF EXISTS localized_my_bookshop_OrderItems;
DROP VIEW IF EXISTS localized_my_bookshop_Orders;
DROP VIEW IF EXISTS localized_my_bookshop_Authors;
DROP VIEW IF EXISTS localized_my_bookshop_Genres;
DROP VIEW IF EXISTS localized_my_bookshop_Books;
DROP VIEW IF EXISTS localized_sap_common_Currencies;
DROP VIEW IF EXISTS localized_sap_common_Languages;
DROP VIEW IF EXISTS ReviewService_Currencies_texts;
DROP VIEW IF EXISTS ReviewService_Genres_texts;
DROP VIEW IF EXISTS CatalogService_Currencies_texts;
DROP VIEW IF EXISTS CatalogService_Genres_texts;
DROP VIEW IF EXISTS AdminService_Currencies_texts;
DROP VIEW IF EXISTS AdminService_Genres_texts;
DROP VIEW IF EXISTS ReviewService_Books_texts;
DROP VIEW IF EXISTS ReviewService_Currencies;
DROP VIEW IF EXISTS ReviewService_Genres;
DROP VIEW IF EXISTS CatalogService_Books_texts;
DROP VIEW IF EXISTS CatalogService_Currencies;
DROP VIEW IF EXISTS CatalogService_Genres;
DROP VIEW IF EXISTS AdminService_Languages_texts;
DROP VIEW IF EXISTS AdminService_Addresses;
DROP VIEW IF EXISTS AdminService_OrderItems;
DROP VIEW IF EXISTS AdminService_Books_texts;
DROP VIEW IF EXISTS AdminService_Currencies;
DROP VIEW IF EXISTS AdminService_Genres;
DROP VIEW IF EXISTS ReviewService_Authors;
DROP VIEW IF EXISTS ReviewService_Books;
DROP VIEW IF EXISTS ReviewService_Reviews;
DROP VIEW IF EXISTS NotesService_Notes;
DROP VIEW IF EXISTS CatalogService_Reviews;
DROP VIEW IF EXISTS CatalogService_Authors;
DROP VIEW IF EXISTS CatalogService_Books;
DROP VIEW IF EXISTS AdminService_Languages;
DROP VIEW IF EXISTS AdminService_Orders;
DROP VIEW IF EXISTS AdminService_Authors;
DROP VIEW IF EXISTS AdminService_Books;

DROP TABLE IF EXISTS ReviewService_Reviews_drafts;
DROP TABLE IF EXISTS AdminService_OrderItems_drafts;
DROP TABLE IF EXISTS AdminService_Orders_drafts;
DROP TABLE IF EXISTS AdminService_Books_texts_drafts;
DROP TABLE IF EXISTS AdminService_Books_drafts;
DROP TABLE IF EXISTS DRAFT_DraftAdministrativeData;
DROP TABLE IF EXISTS my_bookshop_Genres_texts;
DROP TABLE IF EXISTS my_bookshop_Books_texts;
DROP TABLE IF EXISTS sap_common_Currencies_texts;
DROP TABLE IF EXISTS sap_common_Languages_texts;
DROP TABLE IF EXISTS cds_outbox_Messages;
DROP TABLE IF EXISTS my_bookshop_Reviews;
DROP TABLE IF EXISTS my_bookshop_OrderItems;
DROP TABLE IF EXISTS my_bookshop_Orders;
DROP TABLE IF EXISTS my_bookshop_Genres;
DROP TABLE IF EXISTS my_bookshop_Authors;
DROP TABLE IF EXISTS my_bookshop_Books;
DROP TABLE IF EXISTS my_bookshop_Notes;
DROP TABLE IF EXISTS sap_common_Currencies;
DROP TABLE IF EXISTS sap_common_Languages;
DROP TABLE IF EXISTS my_bookshop_Addresses;

CREATE TABLE my_bookshop_Addresses (
  ID NVARCHAR(10) NOT NULL,
  businessPartner NVARCHAR(10) NOT NULL,
  country NVARCHAR(3),
  city NVARCHAR(40),
  postalCode NVARCHAR(10),
  street NVARCHAR(60),
  houseNumber NVARCHAR(10),
  tombstone BOOLEAN,
  PRIMARY KEY(ID, businessPartner)
);

CREATE TABLE sap_common_Languages (
  name NVARCHAR(255),
  descr NVARCHAR(1000),
  code NVARCHAR(14) NOT NULL,
  PRIMARY KEY(code)
);

CREATE TABLE sap_common_Currencies (
  name NVARCHAR(255),
  descr NVARCHAR(1000),
  code NVARCHAR(3) NOT NULL,
  symbol NVARCHAR(5),
  PRIMARY KEY(code)
);

CREATE TABLE my_bookshop_Notes (
  ID NVARCHAR(36) NOT NULL,
  note NVARCHAR(5000),
  address_ID NVARCHAR(10),
  address_businessPartner NVARCHAR(10),
  PRIMARY KEY(ID)
);

CREATE TABLE my_bookshop_Books (
  ID NVARCHAR(36) NOT NULL,
  createdAt TIMESTAMP,
  createdBy NVARCHAR(255),
  modifiedAt TIMESTAMP,
  modifiedBy NVARCHAR(255),
  title NVARCHAR(111),
  descr NVARCHAR(1111),
  author_ID NVARCHAR(36),
  genre_ID INTEGER,
  stock INTEGER,
  price DECIMAL(9, 2),
  currency_code NVARCHAR(3),
  rating DECIMAL(2, 1),
  isReviewable BOOLEAN NOT NULL DEFAULT TRUE,
  PRIMARY KEY(ID)
);

CREATE TABLE my_bookshop_Authors (
  ID NVARCHAR(36) NOT NULL,
  createdAt TIMESTAMP,
  createdBy NVARCHAR(255),
  modifiedAt TIMESTAMP,
  modifiedBy NVARCHAR(255),
  name NVARCHAR(111),
  dateOfBirth DATE,
  dateOfDeath DATE,
  placeOfBirth NVARCHAR(5000),
  placeOfDeath NVARCHAR(5000),
  PRIMARY KEY(ID)
);

CREATE TABLE my_bookshop_Genres (
  name NVARCHAR(255),
  descr NVARCHAR(1000),
  ID INTEGER NOT NULL,
  parent_ID INTEGER,
  PRIMARY KEY(ID)
);

CREATE TABLE my_bookshop_Orders (
  ID NVARCHAR(36) NOT NULL,
  createdAt TIMESTAMP,
  createdBy NVARCHAR(255),
  modifiedAt TIMESTAMP,
  modifiedBy NVARCHAR(255),
  OrderNo NVARCHAR(5000),
  buyer NVARCHAR(255),
  total DECIMAL(9, 2),
  currency_code NVARCHAR(3),
  shippingAddress_ID NVARCHAR(10),
  shippingAddress_businessPartner NVARCHAR(10),
  PRIMARY KEY(ID)
);

CREATE TABLE my_bookshop_OrderItems (
  ID NVARCHAR(36) NOT NULL,
  parent_ID NVARCHAR(36),
  book_ID NVARCHAR(36),
  quantity INTEGER,
  amount DECIMAL(9, 2),
  PRIMARY KEY(ID)
);

CREATE TABLE my_bookshop_Reviews (
  ID NVARCHAR(36) NOT NULL,
  createdAt TIMESTAMP,
  createdBy NVARCHAR(255),
  modifiedAt TIMESTAMP,
  modifiedBy NVARCHAR(255),
  book_ID NVARCHAR(36),
  rating INTEGER,
  title NVARCHAR(111),
  text NVARCHAR(1111),
  PRIMARY KEY(ID)
);

CREATE TABLE cds_outbox_Messages (
  ID NVARCHAR(36) NOT NULL,
  timestamp TIMESTAMP,
  target NVARCHAR(5000),
  msg NCLOB,
  attempts INTEGER DEFAULT 0,
  partition INTEGER DEFAULT 0,
  PRIMARY KEY(ID)
);

CREATE TABLE sap_common_Languages_texts (
  locale NVARCHAR(14) NOT NULL,
  name NVARCHAR(255),
  descr NVARCHAR(1000),
  code NVARCHAR(14) NOT NULL,
  PRIMARY KEY(locale, code)
);

CREATE TABLE sap_common_Currencies_texts (
  locale NVARCHAR(14) NOT NULL,
  name NVARCHAR(255),
  descr NVARCHAR(1000),
  code NVARCHAR(3) NOT NULL,
  PRIMARY KEY(locale, code)
);

CREATE TABLE my_bookshop_Books_texts (
  ID_texts NVARCHAR(36) NOT NULL,
  locale NVARCHAR(14),
  ID NVARCHAR(36),
  title NVARCHAR(111),
  descr NVARCHAR(1111),
  PRIMARY KEY(ID_texts),
  CONSTRAINT my_bookshop_Books_texts_locale UNIQUE (locale, ID)
);

CREATE TABLE my_bookshop_Genres_texts (
  locale NVARCHAR(14) NOT NULL,
  name NVARCHAR(255),
  descr NVARCHAR(1000),
  ID INTEGER NOT NULL,
  PRIMARY KEY(locale, ID)
);

CREATE TABLE DRAFT_DraftAdministrativeData (
  DraftUUID NVARCHAR(36) NOT NULL,
  CreationDateTime TIMESTAMP,
  CreatedByUser NVARCHAR(256),
  DraftIsCreatedByMe BOOLEAN,
  LastChangeDateTime TIMESTAMP,
  LastChangedByUser NVARCHAR(256),
  InProcessByUser NVARCHAR(256),
  DraftIsProcessedByMe BOOLEAN,
  PRIMARY KEY(DraftUUID)
);

CREATE TABLE AdminService_Books_drafts (
  ID NVARCHAR(36) NOT NULL,
  createdAt TIMESTAMP NULL,
  createdBy NVARCHAR(255) NULL,
  modifiedAt TIMESTAMP NULL,
  modifiedBy NVARCHAR(255) NULL,
  title NVARCHAR(111) NULL,
  descr NVARCHAR(1111) NULL,
  author_ID NVARCHAR(36) NULL,
  genre_ID INTEGER NULL,
  stock INTEGER NULL,
  price DECIMAL(9, 2) NULL,
  currency_code NVARCHAR(3) NULL,
  rating DECIMAL(2, 1) NULL,
  isReviewable BOOLEAN NULL DEFAULT TRUE,
  IsActiveEntity BOOLEAN,
  HasActiveEntity BOOLEAN,
  HasDraftEntity BOOLEAN,
  DraftAdministrativeData_DraftUUID NVARCHAR(36) NOT NULL,
  PRIMARY KEY(ID)
);

CREATE TABLE AdminService_Books_texts_drafts (
  ID_texts NVARCHAR(36) NOT NULL,
  locale NVARCHAR(14) NULL,
  ID NVARCHAR(36) NULL,
  title NVARCHAR(111) NULL,
  descr NVARCHAR(1111) NULL,
  IsActiveEntity BOOLEAN,
  HasActiveEntity BOOLEAN,
  HasDraftEntity BOOLEAN,
  DraftAdministrativeData_DraftUUID NVARCHAR(36) NOT NULL,
  PRIMARY KEY(ID_texts)
);

CREATE TABLE AdminService_Orders_drafts (
  ID NVARCHAR(36) NOT NULL,
  createdAt TIMESTAMP NULL,
  createdBy NVARCHAR(255) NULL,
  modifiedAt TIMESTAMP NULL,
  modifiedBy NVARCHAR(255) NULL,
  OrderNo NVARCHAR(5000) NULL,
  buyer NVARCHAR(255) NULL,
  total DECIMAL(9, 2) NULL,
  currency_code NVARCHAR(3) NULL,
  shippingAddress_ID NVARCHAR(10) NULL,
  shippingAddress_businessPartner NVARCHAR(10) NULL,
  IsActiveEntity BOOLEAN,
  HasActiveEntity BOOLEAN,
  HasDraftEntity BOOLEAN,
  DraftAdministrativeData_DraftUUID NVARCHAR(36) NOT NULL,
  PRIMARY KEY(ID)
);

CREATE TABLE AdminService_OrderItems_drafts (
  ID NVARCHAR(36) NOT NULL,
  parent_ID NVARCHAR(36) NULL,
  book_ID NVARCHAR(36) NULL,
  quantity INTEGER NULL,
  amount DECIMAL(9, 2) NULL,
  IsActiveEntity BOOLEAN,
  HasActiveEntity BOOLEAN,
  HasDraftEntity BOOLEAN,
  DraftAdministrativeData_DraftUUID NVARCHAR(36) NOT NULL,
  PRIMARY KEY(ID)
);

CREATE TABLE ReviewService_Reviews_drafts (
  ID NVARCHAR(36) NOT NULL,
  createdAt TIMESTAMP NULL,
  createdBy NVARCHAR(255) NULL,
  modifiedAt TIMESTAMP NULL,
  modifiedBy NVARCHAR(255) NULL,
  book_ID NVARCHAR(36) NULL,
  rating INTEGER NULL,
  title NVARCHAR(111) NULL,
  text NVARCHAR(1111) NULL,
  IsActiveEntity BOOLEAN,
  HasActiveEntity BOOLEAN,
  HasDraftEntity BOOLEAN,
  DraftAdministrativeData_DraftUUID NVARCHAR(36) NOT NULL,
  PRIMARY KEY(ID)
);

CREATE VIEW AdminService_Books AS SELECT
  Books_0.ID,
  Books_0.createdAt,
  Books_0.createdBy,
  Books_0.modifiedAt,
  Books_0.modifiedBy,
  Books_0.title,
  Books_0.descr,
  Books_0.author_ID,
  Books_0.genre_ID,
  Books_0.stock,
  Books_0.price,
  Books_0.currency_code,
  Books_0.rating,
  Books_0.isReviewable
FROM my_bookshop_Books AS Books_0;

CREATE VIEW AdminService_Authors AS SELECT
  Authors_0.ID,
  Authors_0.createdAt,
  Authors_0.createdBy,
  Authors_0.modifiedAt,
  Authors_0.modifiedBy,
  Authors_0.name,
  Authors_0.dateOfBirth,
  Authors_0.dateOfDeath,
  Authors_0.placeOfBirth,
  Authors_0.placeOfDeath
FROM my_bookshop_Authors AS Authors_0;

CREATE VIEW AdminService_Orders AS SELECT
  Orders_0.ID,
  Orders_0.createdAt,
  Orders_0.createdBy,
  Orders_0.modifiedAt,
  Orders_0.modifiedBy,
  Orders_0.OrderNo,
  Orders_0.buyer,
  Orders_0.total,
  Orders_0.currency_code,
  Orders_0.shippingAddress_ID,
  Orders_0.shippingAddress_businessPartner
FROM my_bookshop_Orders AS Orders_0;

CREATE VIEW AdminService_Languages AS SELECT
  CommonLanguages_0.name,
  CommonLanguages_0.descr,
  CommonLanguages_0.code
FROM sap_common_Languages AS CommonLanguages_0;

CREATE VIEW CatalogService_Books AS SELECT
  Books_0.ID,
  Books_0.createdAt,
  Books_0.modifiedAt,
  Books_0.title,
  Books_0.descr,
  Books_0.author_ID,
  Books_0.genre_ID,
  Books_0.stock,
  Books_0.price,
  Books_0.currency_code,
  Books_0.rating,
  Books_0.isReviewable
FROM my_bookshop_Books AS Books_0;

CREATE VIEW CatalogService_Authors AS SELECT
  Authors_0.ID,
  Authors_0.createdAt,
  Authors_0.createdBy,
  Authors_0.modifiedAt,
  Authors_0.modifiedBy,
  Authors_0.name,
  Authors_0.dateOfBirth,
  Authors_0.dateOfDeath,
  Authors_0.placeOfBirth,
  Authors_0.placeOfDeath
FROM my_bookshop_Authors AS Authors_0;

CREATE VIEW CatalogService_Reviews AS SELECT
  Reviews_0.ID,
  Reviews_0.createdAt,
  Reviews_0.createdBy,
  Reviews_0.modifiedAt,
  Reviews_0.modifiedBy,
  Reviews_0.book_ID,
  Reviews_0.rating,
  Reviews_0.title,
  Reviews_0.text
FROM my_bookshop_Reviews AS Reviews_0;

CREATE VIEW NotesService_Notes AS SELECT
  Notes_0.ID,
  Notes_0.note,
  Notes_0.address_ID,
  Notes_0.address_businessPartner
FROM my_bookshop_Notes AS Notes_0;

CREATE VIEW ReviewService_Reviews AS SELECT
  Reviews_0.ID,
  Reviews_0.createdAt,
  Reviews_0.createdBy,
  Reviews_0.modifiedAt,
  Reviews_0.modifiedBy,
  Reviews_0.book_ID,
  Reviews_0.rating,
  Reviews_0.title,
  Reviews_0.text
FROM my_bookshop_Reviews AS Reviews_0;

CREATE VIEW ReviewService_Books AS SELECT
  Books_0.ID,
  Books_0.createdAt,
  Books_0.modifiedAt,
  Books_0.title,
  Books_0.descr,
  Books_0.author_ID,
  Books_0.genre_ID,
  Books_0.stock,
  Books_0.price,
  Books_0.currency_code,
  Books_0.rating,
  Books_0.isReviewable
FROM my_bookshop_Books AS Books_0;

CREATE VIEW ReviewService_Authors AS SELECT
  Authors_0.ID,
  Authors_0.createdAt,
  Authors_0.createdBy,
  Authors_0.modifiedAt,
  Authors_0.modifiedBy,
  Authors_0.name,
  Authors_0.dateOfBirth,
  Authors_0.dateOfDeath,
  Authors_0.placeOfBirth,
  Authors_0.placeOfDeath
FROM my_bookshop_Authors AS Authors_0;

CREATE VIEW AdminService_Genres AS SELECT
  Genres_0.name,
  Genres_0.descr,
  Genres_0.ID,
  Genres_0.parent_ID
FROM my_bookshop_Genres AS Genres_0;

CREATE VIEW AdminService_Currencies AS SELECT
  Currencies_0.name,
  Currencies_0.descr,
  Currencies_0.code,
  Currencies_0.symbol
FROM sap_common_Currencies AS Currencies_0;

CREATE VIEW AdminService_Books_texts AS SELECT
  texts_0.ID_texts,
  texts_0.locale,
  texts_0.ID,
  texts_0.title,
  texts_0.descr
FROM my_bookshop_Books_texts AS texts_0;

CREATE VIEW AdminService_OrderItems AS SELECT
  OrderItems_0.ID,
  OrderItems_0.parent_ID,
  OrderItems_0.book_ID,
  OrderItems_0.quantity,
  OrderItems_0.amount
FROM my_bookshop_OrderItems AS OrderItems_0;

CREATE VIEW AdminService_Addresses AS SELECT
  Addresses_0.ID,
  Addresses_0.businessPartner,
  Addresses_0.country,
  Addresses_0.city,
  Addresses_0.postalCode,
  Addresses_0.street,
  Addresses_0.houseNumber,
  Addresses_0.tombstone
FROM my_bookshop_Addresses AS Addresses_0;

CREATE VIEW AdminService_Languages_texts AS SELECT
  texts_0.locale,
  texts_0.name,
  texts_0.descr,
  texts_0.code
FROM sap_common_Languages_texts AS texts_0;

CREATE VIEW CatalogService_Genres AS SELECT
  Genres_0.name,
  Genres_0.descr,
  Genres_0.ID,
  Genres_0.parent_ID
FROM my_bookshop_Genres AS Genres_0;

CREATE VIEW CatalogService_Currencies AS SELECT
  Currencies_0.name,
  Currencies_0.descr,
  Currencies_0.code,
  Currencies_0.symbol
FROM sap_common_Currencies AS Currencies_0;

CREATE VIEW CatalogService_Books_texts AS SELECT
  texts_0.ID_texts,
  texts_0.locale,
  texts_0.ID,
  texts_0.title,
  texts_0.descr
FROM my_bookshop_Books_texts AS texts_0;

CREATE VIEW ReviewService_Genres AS SELECT
  Genres_0.name,
  Genres_0.descr,
  Genres_0.ID,
  Genres_0.parent_ID
FROM my_bookshop_Genres AS Genres_0;

CREATE VIEW ReviewService_Currencies AS SELECT
  Currencies_0.name,
  Currencies_0.descr,
  Currencies_0.code,
  Currencies_0.symbol
FROM sap_common_Currencies AS Currencies_0;

CREATE VIEW ReviewService_Books_texts AS SELECT
  texts_0.ID_texts,
  texts_0.locale,
  texts_0.ID,
  texts_0.title,
  texts_0.descr
FROM my_bookshop_Books_texts AS texts_0;

CREATE VIEW AdminService_Genres_texts AS SELECT
  texts_0.locale,
  texts_0.name,
  texts_0.descr,
  texts_0.ID
FROM my_bookshop_Genres_texts AS texts_0;

CREATE VIEW AdminService_Currencies_texts AS SELECT
  texts_0.locale,
  texts_0.name,
  texts_0.descr,
  texts_0.code
FROM sap_common_Currencies_texts AS texts_0;

CREATE VIEW CatalogService_Genres_texts AS SELECT
  texts_0.locale,
  texts_0.name,
  texts_0.descr,
  texts_0.ID
FROM my_bookshop_Genres_texts AS texts_0;

CREATE VIEW CatalogService_Currencies_texts AS SELECT
  texts_0.locale,
  texts_0.name,
  texts_0.descr,
  texts_0.code
FROM sap_common_Currencies_texts AS texts_0;

CREATE VIEW ReviewService_Genres_texts AS SELECT
  texts_0.locale,
  texts_0.name,
  texts_0.descr,
  texts_0.ID
FROM my_bookshop_Genres_texts AS texts_0;

CREATE VIEW ReviewService_Currencies_texts AS SELECT
  texts_0.locale,
  texts_0.name,
  texts_0.descr,
  texts_0.code
FROM sap_common_Currencies_texts AS texts_0;

CREATE VIEW localized_sap_common_Languages AS SELECT
  coalesce(localized_1.name, L_0.name) AS name,
  coalesce(localized_1.descr, L_0.descr) AS descr,
  L_0.code
FROM (sap_common_Languages AS L_0 LEFT JOIN sap_common_Languages_texts AS localized_1 ON localized_1.code = L_0.code AND localized_1.locale = 'en');

CREATE VIEW localized_sap_common_Currencies AS SELECT
  coalesce(localized_1.name, L_0.name) AS name,
  coalesce(localized_1.descr, L_0.descr) AS descr,
  L_0.code,
  L_0.symbol
FROM (sap_common_Currencies AS L_0 LEFT JOIN sap_common_Currencies_texts AS localized_1 ON localized_1.code = L_0.code AND localized_1.locale = 'en');

CREATE VIEW localized_my_bookshop_Books AS SELECT
  L_0.ID,
  L_0.createdAt,
  L_0.createdBy,
  L_0.modifiedAt,
  L_0.modifiedBy,
  coalesce(localized_1.title, L_0.title) AS title,
  coalesce(localized_1.descr, L_0.descr) AS descr,
  L_0.author_ID,
  L_0.genre_ID,
  L_0.stock,
  L_0.price,
  L_0.currency_code,
  L_0.rating,
  L_0.isReviewable
FROM (my_bookshop_Books AS L_0 LEFT JOIN my_bookshop_Books_texts AS localized_1 ON localized_1.ID = L_0.ID AND localized_1.locale = 'en');

CREATE VIEW localized_my_bookshop_Genres AS SELECT
  coalesce(localized_1.name, L_0.name) AS name,
  coalesce(localized_1.descr, L_0.descr) AS descr,
  L_0.ID,
  L_0.parent_ID
FROM (my_bookshop_Genres AS L_0 LEFT JOIN my_bookshop_Genres_texts AS localized_1 ON localized_1.ID = L_0.ID AND localized_1.locale = 'en');

CREATE VIEW localized_my_bookshop_Authors AS SELECT
  L.ID,
  L.createdAt,
  L.createdBy,
  L.modifiedAt,
  L.modifiedBy,
  L.name,
  L.dateOfBirth,
  L.dateOfDeath,
  L.placeOfBirth,
  L.placeOfDeath
FROM my_bookshop_Authors AS L;

CREATE VIEW localized_my_bookshop_Orders AS SELECT
  L.ID,
  L.createdAt,
  L.createdBy,
  L.modifiedAt,
  L.modifiedBy,
  L.OrderNo,
  L.buyer,
  L.total,
  L.currency_code,
  L.shippingAddress_ID,
  L.shippingAddress_businessPartner
FROM my_bookshop_Orders AS L;

CREATE VIEW localized_my_bookshop_OrderItems AS SELECT
  L.ID,
  L.parent_ID,
  L.book_ID,
  L.quantity,
  L.amount
FROM my_bookshop_OrderItems AS L;

CREATE VIEW localized_my_bookshop_Reviews AS SELECT
  L.ID,
  L.createdAt,
  L.createdBy,
  L.modifiedAt,
  L.modifiedBy,
  L.book_ID,
  L.rating,
  L.title,
  L.text
FROM my_bookshop_Reviews AS L;

CREATE VIEW AdminService_DraftAdministrativeData AS SELECT
  DraftAdministrativeData.DraftUUID,
  DraftAdministrativeData.CreationDateTime,
  DraftAdministrativeData.CreatedByUser,
  DraftAdministrativeData.DraftIsCreatedByMe,
  DraftAdministrativeData.LastChangeDateTime,
  DraftAdministrativeData.LastChangedByUser,
  DraftAdministrativeData.InProcessByUser,
  DraftAdministrativeData.DraftIsProcessedByMe
FROM DRAFT_DraftAdministrativeData AS DraftAdministrativeData;

CREATE VIEW ReviewService_DraftAdministrativeData AS SELECT
  DraftAdministrativeData.DraftUUID,
  DraftAdministrativeData.CreationDateTime,
  DraftAdministrativeData.CreatedByUser,
  DraftAdministrativeData.DraftIsCreatedByMe,
  DraftAdministrativeData.LastChangeDateTime,
  DraftAdministrativeData.LastChangedByUser,
  DraftAdministrativeData.InProcessByUser,
  DraftAdministrativeData.DraftIsProcessedByMe
FROM DRAFT_DraftAdministrativeData AS DraftAdministrativeData;

CREATE VIEW localized_AdminService_Books AS SELECT
  Books_0.ID,
  Books_0.createdAt,
  Books_0.createdBy,
  Books_0.modifiedAt,
  Books_0.modifiedBy,
  Books_0.title,
  Books_0.descr,
  Books_0.author_ID,
  Books_0.genre_ID,
  Books_0.stock,
  Books_0.price,
  Books_0.currency_code,
  Books_0.rating,
  Books_0.isReviewable
FROM localized_my_bookshop_Books AS Books_0;

CREATE VIEW localized_AdminService_Languages AS SELECT
  CommonLanguages_0.name,
  CommonLanguages_0.descr,
  CommonLanguages_0.code
FROM localized_sap_common_Languages AS CommonLanguages_0;

CREATE VIEW localized_CatalogService_Books AS SELECT
  Books_0.ID,
  Books_0.createdAt,
  Books_0.modifiedAt,
  Books_0.title,
  Books_0.descr,
  Books_0.author_ID,
  Books_0.genre_ID,
  Books_0.stock,
  Books_0.price,
  Books_0.currency_code,
  Books_0.rating,
  Books_0.isReviewable
FROM localized_my_bookshop_Books AS Books_0;

CREATE VIEW localized_ReviewService_Books AS SELECT
  Books_0.ID,
  Books_0.createdAt,
  Books_0.modifiedAt,
  Books_0.title,
  Books_0.descr,
  Books_0.author_ID,
  Books_0.genre_ID,
  Books_0.stock,
  Books_0.price,
  Books_0.currency_code,
  Books_0.rating,
  Books_0.isReviewable
FROM localized_my_bookshop_Books AS Books_0;

CREATE VIEW localized_AdminService_Genres AS SELECT
  Genres_0.name,
  Genres_0.descr,
  Genres_0.ID,
  Genres_0.parent_ID
FROM localized_my_bookshop_Genres AS Genres_0;

CREATE VIEW localized_AdminService_Currencies AS SELECT
  Currencies_0.name,
  Currencies_0.descr,
  Currencies_0.code,
  Currencies_0.symbol
FROM localized_sap_common_Currencies AS Currencies_0;

CREATE VIEW localized_CatalogService_Genres AS SELECT
  Genres_0.name,
  Genres_0.descr,
  Genres_0.ID,
  Genres_0.parent_ID
FROM localized_my_bookshop_Genres AS Genres_0;

CREATE VIEW localized_CatalogService_Currencies AS SELECT
  Currencies_0.name,
  Currencies_0.descr,
  Currencies_0.code,
  Currencies_0.symbol
FROM localized_sap_common_Currencies AS Currencies_0;

CREATE VIEW localized_ReviewService_Genres AS SELECT
  Genres_0.name,
  Genres_0.descr,
  Genres_0.ID,
  Genres_0.parent_ID
FROM localized_my_bookshop_Genres AS Genres_0;

CREATE VIEW localized_ReviewService_Currencies AS SELECT
  Currencies_0.name,
  Currencies_0.descr,
  Currencies_0.code,
  Currencies_0.symbol
FROM localized_sap_common_Currencies AS Currencies_0;

CREATE VIEW localized_AdminService_Authors AS SELECT
  Authors_0.ID,
  Authors_0.createdAt,
  Authors_0.createdBy,
  Authors_0.modifiedAt,
  Authors_0.modifiedBy,
  Authors_0.name,
  Authors_0.dateOfBirth,
  Authors_0.dateOfDeath,
  Authors_0.placeOfBirth,
  Authors_0.placeOfDeath
FROM localized_my_bookshop_Authors AS Authors_0;

CREATE VIEW localized_AdminService_OrderItems AS SELECT
  OrderItems_0.ID,
  OrderItems_0.parent_ID,
  OrderItems_0.book_ID,
  OrderItems_0.quantity,
  OrderItems_0.amount
FROM localized_my_bookshop_OrderItems AS OrderItems_0;

CREATE VIEW localized_CatalogService_Authors AS SELECT
  Authors_0.ID,
  Authors_0.createdAt,
  Authors_0.createdBy,
  Authors_0.modifiedAt,
  Authors_0.modifiedBy,
  Authors_0.name,
  Authors_0.dateOfBirth,
  Authors_0.dateOfDeath,
  Authors_0.placeOfBirth,
  Authors_0.placeOfDeath
FROM localized_my_bookshop_Authors AS Authors_0;

CREATE VIEW localized_CatalogService_Reviews AS SELECT
  Reviews_0.ID,
  Reviews_0.createdAt,
  Reviews_0.createdBy,
  Reviews_0.modifiedAt,
  Reviews_0.modifiedBy,
  Reviews_0.book_ID,
  Reviews_0.rating,
  Reviews_0.title,
  Reviews_0.text
FROM localized_my_bookshop_Reviews AS Reviews_0;

CREATE VIEW localized_ReviewService_Reviews AS SELECT
  Reviews_0.ID,
  Reviews_0.createdAt,
  Reviews_0.createdBy,
  Reviews_0.modifiedAt,
  Reviews_0.modifiedBy,
  Reviews_0.book_ID,
  Reviews_0.rating,
  Reviews_0.title,
  Reviews_0.text
FROM localized_my_bookshop_Reviews AS Reviews_0;

CREATE VIEW localized_ReviewService_Authors AS SELECT
  Authors_0.ID,
  Authors_0.createdAt,
  Authors_0.createdBy,
  Authors_0.modifiedAt,
  Authors_0.modifiedBy,
  Authors_0.name,
  Authors_0.dateOfBirth,
  Authors_0.dateOfDeath,
  Authors_0.placeOfBirth,
  Authors_0.placeOfDeath
FROM localized_my_bookshop_Authors AS Authors_0;

CREATE VIEW localized_AdminService_Orders AS SELECT
  Orders_0.ID,
  Orders_0.createdAt,
  Orders_0.createdBy,
  Orders_0.modifiedAt,
  Orders_0.modifiedBy,
  Orders_0.OrderNo,
  Orders_0.buyer,
  Orders_0.total,
  Orders_0.currency_code,
  Orders_0.shippingAddress_ID,
  Orders_0.shippingAddress_businessPartner
FROM localized_my_bookshop_Orders AS Orders_0;

CREATE VIEW localized_de_sap_common_Languages AS SELECT
  coalesce(localized_de_1.name, L_0.name) AS name,
  coalesce(localized_de_1.descr, L_0.descr) AS descr,
  L_0.code
FROM (sap_common_Languages AS L_0 LEFT JOIN sap_common_Languages_texts AS localized_de_1 ON localized_de_1.code = L_0.code AND localized_de_1.locale = 'de');

CREATE VIEW localized_fr_sap_common_Languages AS SELECT
  coalesce(localized_fr_1.name, L_0.name) AS name,
  coalesce(localized_fr_1.descr, L_0.descr) AS descr,
  L_0.code
FROM (sap_common_Languages AS L_0 LEFT JOIN sap_common_Languages_texts AS localized_fr_1 ON localized_fr_1.code = L_0.code AND localized_fr_1.locale = 'fr');

CREATE VIEW localized_de_sap_common_Currencies AS SELECT
  coalesce(localized_de_1.name, L_0.name) AS name,
  coalesce(localized_de_1.descr, L_0.descr) AS descr,
  L_0.code,
  L_0.symbol
FROM (sap_common_Currencies AS L_0 LEFT JOIN sap_common_Currencies_texts AS localized_de_1 ON localized_de_1.code = L_0.code AND localized_de_1.locale = 'de');

CREATE VIEW localized_fr_sap_common_Currencies AS SELECT
  coalesce(localized_fr_1.name, L_0.name) AS name,
  coalesce(localized_fr_1.descr, L_0.descr) AS descr,
  L_0.code,
  L_0.symbol
FROM (sap_common_Currencies AS L_0 LEFT JOIN sap_common_Currencies_texts AS localized_fr_1 ON localized_fr_1.code = L_0.code AND localized_fr_1.locale = 'fr');

CREATE VIEW localized_de_my_bookshop_Books AS SELECT
  L_0.ID,
  L_0.createdAt,
  L_0.createdBy,
  L_0.modifiedAt,
  L_0.modifiedBy,
  coalesce(localized_de_1.title, L_0.title) AS title,
  coalesce(localized_de_1.descr, L_0.descr) AS descr,
  L_0.author_ID,
  L_0.genre_ID,
  L_0.stock,
  L_0.price,
  L_0.currency_code,
  L_0.rating,
  L_0.isReviewable
FROM (my_bookshop_Books AS L_0 LEFT JOIN my_bookshop_Books_texts AS localized_de_1 ON localized_de_1.ID = L_0.ID AND localized_de_1.locale = 'de');

CREATE VIEW localized_fr_my_bookshop_Books AS SELECT
  L_0.ID,
  L_0.createdAt,
  L_0.createdBy,
  L_0.modifiedAt,
  L_0.modifiedBy,
  coalesce(localized_fr_1.title, L_0.title) AS title,
  coalesce(localized_fr_1.descr, L_0.descr) AS descr,
  L_0.author_ID,
  L_0.genre_ID,
  L_0.stock,
  L_0.price,
  L_0.currency_code,
  L_0.rating,
  L_0.isReviewable
FROM (my_bookshop_Books AS L_0 LEFT JOIN my_bookshop_Books_texts AS localized_fr_1 ON localized_fr_1.ID = L_0.ID AND localized_fr_1.locale = 'fr');

CREATE VIEW localized_de_my_bookshop_Genres AS SELECT
  coalesce(localized_de_1.name, L_0.name) AS name,
  coalesce(localized_de_1.descr, L_0.descr) AS descr,
  L_0.ID,
  L_0.parent_ID
FROM (my_bookshop_Genres AS L_0 LEFT JOIN my_bookshop_Genres_texts AS localized_de_1 ON localized_de_1.ID = L_0.ID AND localized_de_1.locale = 'de');

CREATE VIEW localized_fr_my_bookshop_Genres AS SELECT
  coalesce(localized_fr_1.name, L_0.name) AS name,
  coalesce(localized_fr_1.descr, L_0.descr) AS descr,
  L_0.ID,
  L_0.parent_ID
FROM (my_bookshop_Genres AS L_0 LEFT JOIN my_bookshop_Genres_texts AS localized_fr_1 ON localized_fr_1.ID = L_0.ID AND localized_fr_1.locale = 'fr');

CREATE VIEW localized_de_my_bookshop_Authors AS SELECT
  L.ID,
  L.createdAt,
  L.createdBy,
  L.modifiedAt,
  L.modifiedBy,
  L.name,
  L.dateOfBirth,
  L.dateOfDeath,
  L.placeOfBirth,
  L.placeOfDeath
FROM my_bookshop_Authors AS L;

CREATE VIEW localized_fr_my_bookshop_Authors AS SELECT
  L.ID,
  L.createdAt,
  L.createdBy,
  L.modifiedAt,
  L.modifiedBy,
  L.name,
  L.dateOfBirth,
  L.dateOfDeath,
  L.placeOfBirth,
  L.placeOfDeath
FROM my_bookshop_Authors AS L;

CREATE VIEW localized_de_my_bookshop_Orders AS SELECT
  L.ID,
  L.createdAt,
  L.createdBy,
  L.modifiedAt,
  L.modifiedBy,
  L.OrderNo,
  L.buyer,
  L.total,
  L.currency_code,
  L.shippingAddress_ID,
  L.shippingAddress_businessPartner
FROM my_bookshop_Orders AS L;

CREATE VIEW localized_fr_my_bookshop_Orders AS SELECT
  L.ID,
  L.createdAt,
  L.createdBy,
  L.modifiedAt,
  L.modifiedBy,
  L.OrderNo,
  L.buyer,
  L.total,
  L.currency_code,
  L.shippingAddress_ID,
  L.shippingAddress_businessPartner
FROM my_bookshop_Orders AS L;

CREATE VIEW localized_de_my_bookshop_OrderItems AS SELECT
  L.ID,
  L.parent_ID,
  L.book_ID,
  L.quantity,
  L.amount
FROM my_bookshop_OrderItems AS L;

CREATE VIEW localized_fr_my_bookshop_OrderItems AS SELECT
  L.ID,
  L.parent_ID,
  L.book_ID,
  L.quantity,
  L.amount
FROM my_bookshop_OrderItems AS L;

CREATE VIEW localized_de_my_bookshop_Reviews AS SELECT
  L.ID,
  L.createdAt,
  L.createdBy,
  L.modifiedAt,
  L.modifiedBy,
  L.book_ID,
  L.rating,
  L.title,
  L.text
FROM my_bookshop_Reviews AS L;

CREATE VIEW localized_fr_my_bookshop_Reviews AS SELECT
  L.ID,
  L.createdAt,
  L.createdBy,
  L.modifiedAt,
  L.modifiedBy,
  L.book_ID,
  L.rating,
  L.title,
  L.text
FROM my_bookshop_Reviews AS L;

CREATE VIEW localized_de_AdminService_Books AS SELECT
  Books_0.ID,
  Books_0.createdAt,
  Books_0.createdBy,
  Books_0.modifiedAt,
  Books_0.modifiedBy,
  Books_0.title,
  Books_0.descr,
  Books_0.author_ID,
  Books_0.genre_ID,
  Books_0.stock,
  Books_0.price,
  Books_0.currency_code,
  Books_0.rating,
  Books_0.isReviewable
FROM localized_de_my_bookshop_Books AS Books_0;

CREATE VIEW localized_fr_AdminService_Books AS SELECT
  Books_0.ID,
  Books_0.createdAt,
  Books_0.createdBy,
  Books_0.modifiedAt,
  Books_0.modifiedBy,
  Books_0.title,
  Books_0.descr,
  Books_0.author_ID,
  Books_0.genre_ID,
  Books_0.stock,
  Books_0.price,
  Books_0.currency_code,
  Books_0.rating,
  Books_0.isReviewable
FROM localized_fr_my_bookshop_Books AS Books_0;

CREATE VIEW localized_de_AdminService_Languages AS SELECT
  CommonLanguages_0.name,
  CommonLanguages_0.descr,
  CommonLanguages_0.code
FROM localized_de_sap_common_Languages AS CommonLanguages_0;

CREATE VIEW localized_fr_AdminService_Languages AS SELECT
  CommonLanguages_0.name,
  CommonLanguages_0.descr,
  CommonLanguages_0.code
FROM localized_fr_sap_common_Languages AS CommonLanguages_0;

CREATE VIEW localized_de_CatalogService_Books AS SELECT
  Books_0.ID,
  Books_0.createdAt,
  Books_0.modifiedAt,
  Books_0.title,
  Books_0.descr,
  Books_0.author_ID,
  Books_0.genre_ID,
  Books_0.stock,
  Books_0.price,
  Books_0.currency_code,
  Books_0.rating,
  Books_0.isReviewable
FROM localized_de_my_bookshop_Books AS Books_0;

CREATE VIEW localized_fr_CatalogService_Books AS SELECT
  Books_0.ID,
  Books_0.createdAt,
  Books_0.modifiedAt,
  Books_0.title,
  Books_0.descr,
  Books_0.author_ID,
  Books_0.genre_ID,
  Books_0.stock,
  Books_0.price,
  Books_0.currency_code,
  Books_0.rating,
  Books_0.isReviewable
FROM localized_fr_my_bookshop_Books AS Books_0;

CREATE VIEW localized_de_ReviewService_Books AS SELECT
  Books_0.ID,
  Books_0.createdAt,
  Books_0.modifiedAt,
  Books_0.title,
  Books_0.descr,
  Books_0.author_ID,
  Books_0.genre_ID,
  Books_0.stock,
  Books_0.price,
  Books_0.currency_code,
  Books_0.rating,
  Books_0.isReviewable
FROM localized_de_my_bookshop_Books AS Books_0;

CREATE VIEW localized_fr_ReviewService_Books AS SELECT
  Books_0.ID,
  Books_0.createdAt,
  Books_0.modifiedAt,
  Books_0.title,
  Books_0.descr,
  Books_0.author_ID,
  Books_0.genre_ID,
  Books_0.stock,
  Books_0.price,
  Books_0.currency_code,
  Books_0.rating,
  Books_0.isReviewable
FROM localized_fr_my_bookshop_Books AS Books_0;

CREATE VIEW localized_de_AdminService_Genres AS SELECT
  Genres_0.name,
  Genres_0.descr,
  Genres_0.ID,
  Genres_0.parent_ID
FROM localized_de_my_bookshop_Genres AS Genres_0;

CREATE VIEW localized_fr_AdminService_Genres AS SELECT
  Genres_0.name,
  Genres_0.descr,
  Genres_0.ID,
  Genres_0.parent_ID
FROM localized_fr_my_bookshop_Genres AS Genres_0;

CREATE VIEW localized_de_AdminService_Currencies AS SELECT
  Currencies_0.name,
  Currencies_0.descr,
  Currencies_0.code,
  Currencies_0.symbol
FROM localized_de_sap_common_Currencies AS Currencies_0;

CREATE VIEW localized_fr_AdminService_Currencies AS SELECT
  Currencies_0.name,
  Currencies_0.descr,
  Currencies_0.code,
  Currencies_0.symbol
FROM localized_fr_sap_common_Currencies AS Currencies_0;

CREATE VIEW localized_de_CatalogService_Genres AS SELECT
  Genres_0.name,
  Genres_0.descr,
  Genres_0.ID,
  Genres_0.parent_ID
FROM localized_de_my_bookshop_Genres AS Genres_0;

CREATE VIEW localized_fr_CatalogService_Genres AS SELECT
  Genres_0.name,
  Genres_0.descr,
  Genres_0.ID,
  Genres_0.parent_ID
FROM localized_fr_my_bookshop_Genres AS Genres_0;

CREATE VIEW localized_de_CatalogService_Currencies AS SELECT
  Currencies_0.name,
  Currencies_0.descr,
  Currencies_0.code,
  Currencies_0.symbol
FROM localized_de_sap_common_Currencies AS Currencies_0;

CREATE VIEW localized_fr_CatalogService_Currencies AS SELECT
  Currencies_0.name,
  Currencies_0.descr,
  Currencies_0.code,
  Currencies_0.symbol
FROM localized_fr_sap_common_Currencies AS Currencies_0;

CREATE VIEW localized_de_ReviewService_Genres AS SELECT
  Genres_0.name,
  Genres_0.descr,
  Genres_0.ID,
  Genres_0.parent_ID
FROM localized_de_my_bookshop_Genres AS Genres_0;

CREATE VIEW localized_fr_ReviewService_Genres AS SELECT
  Genres_0.name,
  Genres_0.descr,
  Genres_0.ID,
  Genres_0.parent_ID
FROM localized_fr_my_bookshop_Genres AS Genres_0;

CREATE VIEW localized_de_ReviewService_Currencies AS SELECT
  Currencies_0.name,
  Currencies_0.descr,
  Currencies_0.code,
  Currencies_0.symbol
FROM localized_de_sap_common_Currencies AS Currencies_0;

CREATE VIEW localized_fr_ReviewService_Currencies AS SELECT
  Currencies_0.name,
  Currencies_0.descr,
  Currencies_0.code,
  Currencies_0.symbol
FROM localized_fr_sap_common_Currencies AS Currencies_0;

CREATE VIEW localized_de_AdminService_Authors AS SELECT
  Authors_0.ID,
  Authors_0.createdAt,
  Authors_0.createdBy,
  Authors_0.modifiedAt,
  Authors_0.modifiedBy,
  Authors_0.name,
  Authors_0.dateOfBirth,
  Authors_0.dateOfDeath,
  Authors_0.placeOfBirth,
  Authors_0.placeOfDeath
FROM localized_de_my_bookshop_Authors AS Authors_0;

CREATE VIEW localized_fr_AdminService_Authors AS SELECT
  Authors_0.ID,
  Authors_0.createdAt,
  Authors_0.createdBy,
  Authors_0.modifiedAt,
  Authors_0.modifiedBy,
  Authors_0.name,
  Authors_0.dateOfBirth,
  Authors_0.dateOfDeath,
  Authors_0.placeOfBirth,
  Authors_0.placeOfDeath
FROM localized_fr_my_bookshop_Authors AS Authors_0;

CREATE VIEW localized_de_AdminService_OrderItems AS SELECT
  OrderItems_0.ID,
  OrderItems_0.parent_ID,
  OrderItems_0.book_ID,
  OrderItems_0.quantity,
  OrderItems_0.amount
FROM localized_de_my_bookshop_OrderItems AS OrderItems_0;

CREATE VIEW localized_fr_AdminService_OrderItems AS SELECT
  OrderItems_0.ID,
  OrderItems_0.parent_ID,
  OrderItems_0.book_ID,
  OrderItems_0.quantity,
  OrderItems_0.amount
FROM localized_fr_my_bookshop_OrderItems AS OrderItems_0;

CREATE VIEW localized_de_CatalogService_Authors AS SELECT
  Authors_0.ID,
  Authors_0.createdAt,
  Authors_0.createdBy,
  Authors_0.modifiedAt,
  Authors_0.modifiedBy,
  Authors_0.name,
  Authors_0.dateOfBirth,
  Authors_0.dateOfDeath,
  Authors_0.placeOfBirth,
  Authors_0.placeOfDeath
FROM localized_de_my_bookshop_Authors AS Authors_0;

CREATE VIEW localized_fr_CatalogService_Authors AS SELECT
  Authors_0.ID,
  Authors_0.createdAt,
  Authors_0.createdBy,
  Authors_0.modifiedAt,
  Authors_0.modifiedBy,
  Authors_0.name,
  Authors_0.dateOfBirth,
  Authors_0.dateOfDeath,
  Authors_0.placeOfBirth,
  Authors_0.placeOfDeath
FROM localized_fr_my_bookshop_Authors AS Authors_0;

CREATE VIEW localized_de_CatalogService_Reviews AS SELECT
  Reviews_0.ID,
  Reviews_0.createdAt,
  Reviews_0.createdBy,
  Reviews_0.modifiedAt,
  Reviews_0.modifiedBy,
  Reviews_0.book_ID,
  Reviews_0.rating,
  Reviews_0.title,
  Reviews_0.text
FROM localized_de_my_bookshop_Reviews AS Reviews_0;

CREATE VIEW localized_fr_CatalogService_Reviews AS SELECT
  Reviews_0.ID,
  Reviews_0.createdAt,
  Reviews_0.createdBy,
  Reviews_0.modifiedAt,
  Reviews_0.modifiedBy,
  Reviews_0.book_ID,
  Reviews_0.rating,
  Reviews_0.title,
  Reviews_0.text
FROM localized_fr_my_bookshop_Reviews AS Reviews_0;

CREATE VIEW localized_de_ReviewService_Reviews AS SELECT
  Reviews_0.ID,
  Reviews_0.createdAt,
  Reviews_0.createdBy,
  Reviews_0.modifiedAt,
  Reviews_0.modifiedBy,
  Reviews_0.book_ID,
  Reviews_0.rating,
  Reviews_0.title,
  Reviews_0.text
FROM localized_de_my_bookshop_Reviews AS Reviews_0;

CREATE VIEW localized_fr_ReviewService_Reviews AS SELECT
  Reviews_0.ID,
  Reviews_0.createdAt,
  Reviews_0.createdBy,
  Reviews_0.modifiedAt,
  Reviews_0.modifiedBy,
  Reviews_0.book_ID,
  Reviews_0.rating,
  Reviews_0.title,
  Reviews_0.text
FROM localized_fr_my_bookshop_Reviews AS Reviews_0;

CREATE VIEW localized_de_ReviewService_Authors AS SELECT
  Authors_0.ID,
  Authors_0.createdAt,
  Authors_0.createdBy,
  Authors_0.modifiedAt,
  Authors_0.modifiedBy,
  Authors_0.name,
  Authors_0.dateOfBirth,
  Authors_0.dateOfDeath,
  Authors_0.placeOfBirth,
  Authors_0.placeOfDeath
FROM localized_de_my_bookshop_Authors AS Authors_0;

CREATE VIEW localized_fr_ReviewService_Authors AS SELECT
  Authors_0.ID,
  Authors_0.createdAt,
  Authors_0.createdBy,
  Authors_0.modifiedAt,
  Authors_0.modifiedBy,
  Authors_0.name,
  Authors_0.dateOfBirth,
  Authors_0.dateOfDeath,
  Authors_0.placeOfBirth,
  Authors_0.placeOfDeath
FROM localized_fr_my_bookshop_Authors AS Authors_0;

CREATE VIEW localized_de_AdminService_Orders AS SELECT
  Orders_0.ID,
  Orders_0.createdAt,
  Orders_0.createdBy,
  Orders_0.modifiedAt,
  Orders_0.modifiedBy,
  Orders_0.OrderNo,
  Orders_0.buyer,
  Orders_0.total,
  Orders_0.currency_code,
  Orders_0.shippingAddress_ID,
  Orders_0.shippingAddress_businessPartner
FROM localized_de_my_bookshop_Orders AS Orders_0;

CREATE VIEW localized_fr_AdminService_Orders AS SELECT
  Orders_0.ID,
  Orders_0.createdAt,
  Orders_0.createdBy,
  Orders_0.modifiedAt,
  Orders_0.modifiedBy,
  Orders_0.OrderNo,
  Orders_0.buyer,
  Orders_0.total,
  Orders_0.currency_code,
  Orders_0.shippingAddress_ID,
  Orders_0.shippingAddress_businessPartner
FROM localized_fr_my_bookshop_Orders AS Orders_0;

