package poglavlje17znakovninizovi;

//Ilustracija upotrebe klase Package
public class PackageDemo {

    public static void main(String[] args) {

        Package pkgs[] = Package.getPackages();

        for (int i = 0; i < pkgs.length; i++) {
            System.out.println(
                      pkgs[i].getName() + ""
                    + pkgs[i].getImplementationTitle() + ""
                    + pkgs[i].getImplementationVendor() + ""
                    + pkgs[i].getImplementationVersion()
            );
        }
    }
}
