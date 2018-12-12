package model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = {"noteId", "title", "note", "stickyDate", "status"})
public class Note {
	private int noteId;
	private String title, note, stickyDate;
	private String status;
	public Note() {
		
	}
	public Note(int noteId, String title, String note, String stickyDate, String status) {
		super();
		this.noteId = noteId;
		this.title = title;
		this.note = note;
		this.stickyDate = stickyDate;
		this.status = status;
	}
	public int getNoteId() {
		return noteId;
	}
	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getStickyDate() {
		return stickyDate;
	}
	public void setStickyDate(String stickyDate) {
		this.stickyDate = stickyDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
