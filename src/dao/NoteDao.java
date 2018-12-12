package dao;

import java.util.List;

import model.Note;

public interface NoteDao {
	public void addNote(Note n);
	public void updateNote(Note n);
	public void deleteNote(int id);
	public List<Note> getAllNotes();
}
