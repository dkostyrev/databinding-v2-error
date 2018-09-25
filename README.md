## Sample project that shows Android DataBinding v2 errors when 3rd party annotation processor fails.

```
./gradlew -Pandroid.databinding.enableV2=true clean assembleDebug
```

Output:
```
e: /Users/dkostyrev/Projects/DatabindingError/app/build/generated/data_binding_base_class_source_out/debug/dataBindingGenBaseClassesDebug/out/com/example/dkostyrev/databindingerror/databinding/MainActivityBinding.java:17: error: cannot find symbol
  protected MainActivityBinding(DataBindingComponent _bindingComponent, View _root,
                                ^
  symbol:   class DataBindingComponent
  location: class MainActivityBinding
e: /Users/dkostyrev/Projects/DatabindingError/app/build/generated/data_binding_base_class_source_out/debug/dataBindingGenBaseClassesDebug/out/com/example/dkostyrev/databindingerror/databinding/MainActivityBinding.java:37: error: cannot find symbol
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
                                                                ^
  symbol:   class DataBindingComponent
  location: class MainActivityBinding
e: /Users/dkostyrev/Projects/DatabindingError/app/build/generated/data_binding_base_class_source_out/debug/dataBindingGenBaseClassesDebug/out/com/example/dkostyrev/databindingerror/databinding/MainActivityBinding.java:48: error: cannot find symbol
      @Nullable DataBindingComponent component) {
                ^
  symbol:   class DataBindingComponent
  location: class MainActivityBinding
e: /Users/dkostyrev/Projects/DatabindingError/app/build/generated/data_binding_base_class_source_out/debug/dataBindingGenBaseClassesDebug/out/com/example/dkostyrev/databindingerror/databinding/MainActivityBinding.java:57: error: cannot find symbol
      @Nullable DataBindingComponent component) {
                ^
  symbol:   class DataBindingComponent
  location: class MainActivityBinding
e: /Users/dkostyrev/Projects/DatabindingError/app/build/tmp/kapt3/stubs/debug/com/example/dkostyrev/databindingerror/MainActivity.java:8: error: Dagger does not support injection into private fields
    private com.example.dkostyrev.databindingerror.Injectable injectable;
                                                              ^
e: /Users/dkostyrev/Projects/DatabindingError/app/build/tmp/kapt3/stubs/debug/com/example/dkostyrev/databindingerror/AppComponent.java:10: error: [Dagger/MissingBinding] com.example.dkostyrev.databindingerror.MainActivity cannot be provided without an @Inject constructor or an @Provides-annotated method.
    public abstract void inject(@org.jetbrains.annotations.NotNull()
                         ^
      com.example.dkostyrev.databindingerror.MainActivity is injected at
          com.example.dkostyrev.databindingerror.AppComponent.inject(com.example.dkostyrev.databindingerror.MainActivity)
> Task :app:kaptDebugKotlin FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':app:kaptDebugKotlin'.
> Compilation error. See log for more details
```

```
./gradlew -Pandroid.databinding.enableV2=false clean assembleDebug
```

Output:
```
e: /Users/dkostyrev/Projects/DatabindingError/app/build/tmp/kapt3/stubs/debug/com/example/dkostyrev/databindingerror/MainActivity.java:8: error: Dagger does not support injection into private fields
    private com.example.dkostyrev.databindingerror.Injectable injectable;
                                                              ^
e: /Users/dkostyrev/Projects/DatabindingError/app/build/tmp/kapt3/stubs/debug/com/example/dkostyrev/databindingerror/AppComponent.java:10: error: [Dagger/MissingBinding] com.example.dkostyrev.databindingerror.MainActivity cannot be provided without an @Inject constructor or an @Provides-annotated method.
    public abstract void inject(@org.jetbrains.annotations.NotNull()
                         ^
      com.example.dkostyrev.databindingerror.MainActivity is injected at
          com.example.dkostyrev.databindingerror.AppComponent.inject(com.example.dkostyrev.databindingerror.MainActivity)
> Task :app:kaptDebugKotlin FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':app:kaptDebugKotlin'.
> Compilation error. See log for more details
```
