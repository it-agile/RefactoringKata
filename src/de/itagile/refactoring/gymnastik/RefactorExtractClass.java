package de.itagile.refactoring.gymnastik;

public class RefactorExtractClass {
	// Extract both attributes as own class named Person
	// usage in this class should be via getters and setters
	private final String name;
	private final String vorname;

	public RefactorExtractClass() {
		name = "Greyhame";
		vorname = "Gandalf";
	}

	public String getNameFormatted() {
		return name + ", " + vorname;
	}

	// Result could look like this
	// private Person gandalf = new Person();
	// 
	// public RefactorExtractClass() {
	// 	  gandalf.setName("Greyhame");
	// 	  gandalf.setVorname("Gandalf");
	// }
	// 
	// public String getNameFormatted() {
	//    return gandalf.getName() + ", " + gandalf.getVorname();
	// }

}
