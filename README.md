# AAC-Dagger

## About this repository
Dagger2 + ViewModel(Android Architecture Components)

## Sample Code
```
class ViewModelFactory @Inject constructor(
    private val creators: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        var creator: Provider<ViewModel>? = creators[modelClass]
        if (creator == null) {
            for ((key, value) in creators) {
                if (modelClass.isAssignableFrom(key)) {
                    creator = value
                    break
                }
            }
        }
        if (creator == null) {
            throw IllegalArgumentException("unknown model class $modelClass")
        }

        try {
            @Suppress("UNCHECKED_CAST")
            return creator.get() as T
        } catch (e: Exception) {
            throw  RuntimeException(e)
        }
    }
}
```

```
@MustBeDocumented
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@Retention
@MapKey // ViewModelのクラス情報をキーとしたMapを生成するためのアノテーション。＠MapKeyはキーを独自に設定するために使用する。アノテーションのみに使用できる。
annotation class ViewModelKey(val value: KClass<out ViewModel>)
```

```
    @Binds
    @IntoMap
    @ViewModelKey(value = MainViewModel::class)
    abstract fun bindSampleViewModel(viewModel: MainViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
```

```
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val mainViewModel: MainViewModel by viewModels {
        viewModelFactory
    }
    ...
}
```

## Reference URL
- [Using Dagger in your Android app - Kotlin](https://developer.android.com/codelabs/android-dagger)
- [Architecture Components を Dagger2 と併用する際の ViewModelProvider.Factory について](https://qiita.com/satorufujiwara/items/f42b176404287690f1d0)
- https://github.com/satoshun-example/DaggerArchitectureComponent



