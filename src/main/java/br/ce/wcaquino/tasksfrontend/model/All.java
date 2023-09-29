package br.ce.rodrigoganchieta.tasksfrontend.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class All {

	private Long id;
	private String task;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private LocalDate dueDate;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}
	
	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "All [id=" + id + ", task=" + task + ", dueDate=" + dueDate + "]";
	}
	
	
}