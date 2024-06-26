package it.corso.dto;

public class CourseShowDto {

	private int id;

	private String courseName;

	private String shortDescription;

	private String longDescription;

	private int duration;

	private CategoryShowDto category;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public CategoryShowDto getCategory() {
		return category;
	}

	public void setCategory(CategoryShowDto category) {
		this.category = category;
	}

}
