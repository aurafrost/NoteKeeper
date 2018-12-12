package resources;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import model.Note;

import dao.NoteDaoImpl;

@Path("/note")
public class NoteResources {
	NoteDaoImpl dao;
	public NoteResources() {
		dao=new NoteDaoImpl();
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Note> getAllNotes()
	{
		return dao.getAllNotes();
	}
	
	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public void addNote(Note n) {
		dao.addNote(n);
	}
	
	@PUT
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	public void updateNote(Note n) {
		System.out.println("Updating");
		dao.updateNote(n);
	}
	
	@DELETE
	@Path("/delete/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteNote(@PathParam("id") int id) {
		dao.deleteNote(id);
	}
}
