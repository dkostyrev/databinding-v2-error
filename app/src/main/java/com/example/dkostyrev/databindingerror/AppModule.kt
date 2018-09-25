package com.example.dkostyrev.databindingerror

import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideInjectable(): Injectable {
        return Injectable()
    }
}
