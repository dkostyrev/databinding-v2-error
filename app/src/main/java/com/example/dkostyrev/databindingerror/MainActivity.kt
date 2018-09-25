package com.example.dkostyrev.databindingerror

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.dkostyrev.databindingerror.databinding.MainActivityBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject private lateinit var injectable: Injectable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectSelf()
        val binding = DataBindingUtil.setContentView<MainActivityBinding>(this, R.layout.main_activity)
        binding.text = injectable.text
    }

    private fun injectSelf() {
        val componentProvider = requireNotNull(application as? ComponentProvider) {
            "Application must implement ComponentProvider"
        }
        componentProvider.getComponent().inject(this)
    }
}
