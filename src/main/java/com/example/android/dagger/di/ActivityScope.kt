package com.example.android.dagger.di

import javax.inject.Scope

/**
 * Oluşturduğumuz bir Scope sınıfı kullanıldığında, o nesne sadece o Activity varolduğu sürece yaşar.
 * Scope'lar farklı containerlarda bulunan nesne örneklerini yeniden kullanabilmemizi sağlar.
 * */
@Scope
@MustBeDocumented
@Retention(value = AnnotationRetention.RUNTIME)
annotation class ActivityScope {

}