package cds.gen.notesservice;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;

@CdsName("NotesService")
public interface NotesService_ {
  String CDS_NAME = "NotesService";

  Class<DraftAdministrativeData_> DRAFT_ADMINISTRATIVE_DATA = DraftAdministrativeData_.class;

  Class<Notes_> NOTES = Notes_.class;

  Class<Addresses_> ADDRESSES = Addresses_.class;
}
