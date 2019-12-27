package com.example.android.dagger.di

import com.example.android.dagger.registration.RegistrationComponent
import dagger.Module

/**
 * AppComponent'in, RegistrationComponent interface'inin subcomponenti olduğunu bilmesi gerekir.
 * @author hanifekurnaz
 * @sınce 1.0
 * */
@Module(subcomponents = [RegistrationComponent::class])
class AppSubcomponents {
}