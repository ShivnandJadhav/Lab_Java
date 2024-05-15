
public class Son extends Father{
	
	public Son(String name, String property, String physicalAppearance) {
        super(name, property, physicalAppearance);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getProperty() {
        return super.getProperty();
    }

    @Override
    public String getPhysicalAppearance() {
        return super.getPhysicalAppearance();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Son son = new Son("Ajay", "Toys", "Small,cute,beutiful");
	        System.out.println("\nSon:");
	        System.out.println("Name: " + son.getName());
	        System.out.println("Property: " + son.getProperty());
	        System.out.println("Physical Appearance: " + son.getPhysicalAppearance());
	        
	    }
	}


