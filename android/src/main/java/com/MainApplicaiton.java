import com.reactlibrary.modules;

protected List<ReactPackage> getPackages() {
    return Arrays.<ReactPackage>asList(
            new MainReactPackage(),
            new FunctionPackage()); // <-- Add this line with your package name.
}
