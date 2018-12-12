package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import dao.DBUtil;

import model.Note;

public class NoteDaoImpl implements NoteDao{
	Connection conn = null;
	public NoteDaoImpl() {
		conn = DBUtil.getConnection();
	}
	
	@Override
	public void addNote(Note n) {
		// TODO Auto-generated method stub
		Statement stmt;
		try {
			stmt = conn.createStatement();
			stmt.executeQuery("insert into notes values("+n.getNoteId()+",'"+n.getTitle()+"','"+n.getNote()+"','"+n.getStickyDate()+"','"+n.getStatus()+"')");
			conn.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public List<Note> getAllNotes() {
		// TODO Auto-generated method stub
		List<Note> nList = new ArrayList<>();
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from notes");
			while(rs.next())
			{
				Note n = new Note(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				nList.add(n);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return nList;
	}

	@Override
	public void updateNote(Note n) {
		// TODO Auto-generated method stub
		Statement stmt;
		try {
			stmt = conn.createStatement();
			stmt.executeQuery("update notes set "
					+ "title='"+n.getTitle()+
					"', note='"+n.getNote()+
					"', stickyDate='"+n.getStickyDate()+
					"', status='"+n.getStatus()+"' where noteId="+n.getNoteId());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void deleteNote(int id) {
		// TODO Auto-generated method stub
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("delete from notes where noteId="+id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
