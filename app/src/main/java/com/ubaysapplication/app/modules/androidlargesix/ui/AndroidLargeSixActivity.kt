package com.ubaysapplication.app.modules.androidlargesix.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ubaysapplication.app.R
import com.ubaysapplication.app.appcomponents.base.BaseActivity
import com.ubaysapplication.app.databinding.ActivityAndroidLargeSixBinding
import com.ubaysapplication.app.modules.androidlargesix.`data`.viewmodel.AndroidLargeSixVM
import com.ubaysapplication.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class AndroidLargeSixActivity :
    BaseActivity<ActivityAndroidLargeSixBinding>(R.layout.activity_android_large_six) {
  private val viewModel: AndroidLargeSixVM by viewModels<AndroidLargeSixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeSixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnKembali.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_LARGE_SIX_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidLargeSixActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
