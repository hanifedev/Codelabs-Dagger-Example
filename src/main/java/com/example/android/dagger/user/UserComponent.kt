package com.example.android.dagger.user

import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.settings.SettingsActivity
import dagger.Subcomponent


/**
 *UserComponent'in her zaman aynı UserDataRepository örneğini sağlayabilmesi için
 * UserComponent ve UserDataRepository öğelerini @LoggedUserScope annotation ile ekleyebiliriz.
 * */

@LoggedUserScope
@Subcomponent
interface UserComponent {

    @Subcomponent.Factory
    interface Factory{
        fun create(): UserComponent
    }

    fun inject(activity:MainActivity)
    fun inject(activity: SettingsActivity)
}