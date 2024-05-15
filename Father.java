
public class Father extends GrandFather {

	public Father(String name, String property, String physicalAppearance) {
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

		 Father father = new Father("Harshal", "Bank balance,Bussiness,Car", "Medium hight,Good looking,fatty");
	        System.out.println("\nFather:");
	        System.out.println("Name: " + father.getName());
	        System.out.println("Property: " + father.getProperty());
	        System.out.println("Physical Appearance: " + father.getPhysicalAppearance());
	}

}
