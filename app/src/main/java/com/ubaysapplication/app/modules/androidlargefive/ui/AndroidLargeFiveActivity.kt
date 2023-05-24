package com.ubaysapplication.app.modules.androidlargefive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ubaysapplication.app.R
import com.ubaysapplication.app.appcomponents.base.BaseActivity
import com.ubaysapplication.app.databinding.ActivityAndroidLargeFiveBinding
import com.ubaysapplication.app.modules.androidlargefive.`data`.viewmodel.AndroidLargeFiveVM
import com.ubaysapplication.app.modules.androidlargesix.ui.AndroidLargeSixActivity
import com.ubaysapplication.app.modules.androidlargethree.ui.AndroidLargeThreeActivity
import kotlin.String
import kotlin.Unit

class AndroidLargeFiveActivity :
    BaseActivity<ActivityAndroidLargeFiveBinding>(R.layout.activity_android_large_five) {
  private val viewModel: AndroidLargeFiveVM by viewModels<AndroidLargeFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.androidLargeFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageImageFive.setOnClickListener {
      val destIntent = AndroidLargeThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnBeliSekarang.setOnClickListener {
      val destIntent = AndroidLargeSixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStack.setOnClickListener {
      val destIntent = AndroidLargeThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ANDROID_LARGE_FIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidLargeFiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
