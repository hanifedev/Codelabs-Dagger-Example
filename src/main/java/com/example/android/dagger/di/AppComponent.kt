package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import com.example.android.dagger.settings.SettingsActivity
import com.example.android.dagger.user.UserComponent
import com.example.android.dagger.user.UserManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/**
 * Hangi sınıfların Injection istediği burada tanımlanır.
 *
 * AppComponent, örneklerin nasıl sağlanacağı bilgilerini içeren Module içerir.
 *
 * AppComponent, RegistrationActivity için RegistrationViewModel'i doldurması gerektiğinden,
 * RegistrationViewModel'in bir örneğini oluşturmak için bağımlılıklarını da karşılaması gerekir.
 * RegistrationViewModel, UserManager'a bağımlıdır. Bu yüzden UserManager'ın da bir nesnesini oluşturur.
 *
 * @Singleton işaretlenen nesneler bağlı oldukları component hayatta kaldığı sürece aynı değere sahip olurlar.
 * @author hanifekurnaz
 * @sınce 1.0
 * */


@Singleton
@Component (modules = [StorageModule::class, AppSubcomponents::class])
interface AppComponent{

    //AppComponent örneği oluşturur
    @Component.Factory
    interface Factory {
        //Context nesnesini içeri aktarmak için @BindsIntance kullanılır.
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun userManager(): UserManager

    //RegisterActivity'nin RegistrationComponent örneğini oluşturması için oluşturulmuştur
    fun registrationComponent(): RegistrationComponent.Factory
    fun loginComponent(): LoginComponent.Factory

}