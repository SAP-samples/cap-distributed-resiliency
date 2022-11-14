package cds.gen.notesservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Boolean;
import java.lang.String;
import java.util.function.Function;

@CdsName("NotesService.Notes")
public interface Notes_ extends StructuredType<Notes_> {
  String CDS_NAME = "NotesService.Notes";

  ElementRef<String> ID();

  ElementRef<String> note();

  Addresses_ address();

  Addresses_ address(Function<Addresses_, CqnPredicate> filter);

  ElementRef<String> address_ID();

  ElementRef<String> address_businessPartner();

  ElementRef<Boolean> IsActiveEntity();

  ElementRef<Boolean> HasActiveEntity();

  ElementRef<Boolean> HasDraftEntity();

  DraftAdministrativeData_ DraftAdministrativeData();

  DraftAdministrativeData_ DraftAdministrativeData(
      Function<DraftAdministrativeData_, CqnPredicate> filter);

  ElementRef<String> DraftAdministrativeData_DraftUUID();

  Notes_ SiblingEntity();

  Notes_ SiblingEntity(Function<Notes_, CqnPredicate> filter);
}
