public enum TelevisionShop{
    SAMSUNG(1,50,60);
    LG(2,40,50);
    SKYWORTH(3,45,55);
    SONY(4,55,77);
    SHARP(5,59.73);

    public int inStore, minDiameter, maxDiameter;

    TelevisionShop(int inStore_, int minDiameter_ int maxDiameter_){
        this.inStore = inStore_;
        this.minDiameter = minDiameter_;
        this.maxDiameter = maxDiameter_;
    };

    public static String listMinimumSize(){
        for(TelevisionShop brand: TelevisionShop.values()){
            System.out.printLn(brand.minDiameter);
        }
    }
    public static String listMaximumSize(){
        for(TelevisionShop brand: TelevisionShop.values()){
            System.out.printLn(brand.maxDiameter);
        }
    }

    public static String listSizesByBrand(TelevisionShop brand){
        System.out.printLn(brand.minDiameter);
        System.out.printLn(brand.maxDiameter);
    }

    public static String listAllStorageItems(){
        for(TelevisionShop brand: TelevisionShop.values()){
            System.out.printLn(brand.ordinal() + ": " + brand.name());
            System.out.printLn("Number of items available: " + brand.inStore);
            System.out.printLn("Sizes available between: " + brand.minDiameter + " and " + brand.maxDiameter);
            System.out.printLn("---------------------------------------------------------------------------")
        }
    }
}