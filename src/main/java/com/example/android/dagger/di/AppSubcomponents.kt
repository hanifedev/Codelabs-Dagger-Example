package com.example.android.dagger.di

import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.user.UserComponent
import dagger.Module

/**
 * AppComponent'in, RegistrationComponent interface'inin subcomponenti olduğunu bilmesi gerekir.
 * @author hanifekurnaz
 * @sınce 1.0
 * */
@Module(subcomponents = [RegistrationComponent::class, LoginComponent::class,UserComponent::class])
class AppSubcomponents {
}