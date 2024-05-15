
public class GrandFather {

	String name;
	String property;
	String physicalAppearance;
	
    public GrandFather(String name, String property, String physicalAppearance) {
        this.name = name;
        this.property = property;
        this.physicalAppearance = physicalAppearance;
    }

    public String getName() {
        return name;
    }

    public String getProperty() {
        return property;
    }

    public String getPhysicalAppearance() {
        return physicalAppearance;
    }
	        
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 GrandFather g = new GrandFather("Omkar", "Big home,Money,Farm", "Very tall,Handsome,Fit");
	        System.out.println("Grandfather:");
	        System.out.println("Name: " + g.getName());
	        System.out.println("Property: " + g.getProperty());
	        System.out.println("Physical Appearance: " + g.getPhysicalAppearance());
	}

}
