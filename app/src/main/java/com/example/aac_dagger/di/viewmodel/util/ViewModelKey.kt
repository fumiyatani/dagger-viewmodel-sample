package com.example.aac_dagger.di.viewmodel.util

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

@MustBeDocumented
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@Retention
@MapKey // ViewModelのクラス情報をキーとしたMapを生成するためのアノテーション。＠MapKeyはキーを独自に設定するために使用する。アノテーションのみに使用できる。
annotation class ViewModelKey(val value: KClass<out ViewModel>)