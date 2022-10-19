public enum TelevisionShop{

    SAMSUNG(1,50,60),
    LG(2,40,50),
    SKYWORTH(3,45,55),
    SONY(4,55,77),
    SHARP(5,59,73);

    public int inStore, minDiameter, maxDiameter;

    TelevisionShop(int inStore_, int minDiameter_, int maxDiameter_){
        this.inStore = inStore_;
        this.minDiameter = minDiameter_;
        this.maxDiameter = maxDiameter_;
    };

    public static void listMinimumSize(){
        for(TelevisionShop brand: TelevisionShop.values()){
            System.out.println(brand.minDiameter);
        }
    }
    public static void listMaximumSize(){
        for(TelevisionShop brand: TelevisionShop.values()){
            System.out.println(brand.maxDiameter);
        }
    }

    public static void listSizesByBrand(TelevisionShop brand){
        System.out.println(brand.minDiameter);
        System.out.println(brand.maxDiameter);
    }

    public static void listAllStorageItems(){
        for(TelevisionShop brand: TelevisionShop.values()){
            System.out.println(brand.ordinal() + ": " + brand.name());
            System.out.println("Number of items available: " + brand.inStore);
            System.out.println("Sizes available between: " + brand.minDiameter + " and " + brand.maxDiameter);
            System.out.println("---------------------------------------------------------------------------");
        }
    }
}