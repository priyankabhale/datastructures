import java.util.List;

public class WebSeries {
	String name;
	Integer rating;
	List<Actors> actors;

	public WebSeries() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebSeries(String name, Integer rating, List<Actors> actors) {
		super();
		this.name = name;
		this.rating = rating;
		this.actors = actors;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public List<Actors> getActors() {
		return actors;
	}

	public void setActors(List<Actors> actors) {
		this.actors = actors;
	}

	@Override
	public String toString() {
		return "WebSeries [name=" + name + ", rating=" + rating + ", actors=" + actors + "]";
	}
	
	
}
