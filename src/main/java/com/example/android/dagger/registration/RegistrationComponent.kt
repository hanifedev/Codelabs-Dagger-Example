package com.example.android.dagger.registration

import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent


/**
 *Dagger'a yeni bir Bileşenin başka bir Bileşenin bir kısmını kullanmasını istediğimizi söylemenin yolu
 * Dagger Subcomponentlerdir.
 * RegistrationComponent, AppComponent'in subcomponentidir.
 *
 *
 * */
@Subcomponent
interface RegistrationComponent {

    //RegistrationComponent'in örneğini oluşturmak için oluşturulan factory
    @Subcomponent.Factory
    interface Factory {
        fun create(): RegistrationComponent
    }

    fun inject(activity: RegistrationActivity)
    fun inject(fragment: EnterDetailsFragment)
    fun inject(fragment: TermsAndConditionsFragment)
}