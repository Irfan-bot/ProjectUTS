package com.ubaysapplication.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.activity.viewModels
import com.ubaysapplication.app.R
import com.ubaysapplication.app.appcomponents.base.BaseActivity
import com.ubaysapplication.app.databinding.ActivityHomeBinding
import com.ubaysapplication.app.modules.androidlargeone.ui.AndroidLargeOneActivity
import com.ubaysapplication.app.modules.androidlargethree.ui.AndroidLargeThreeActivity
import com.ubaysapplication.app.modules.home.`data`.model.HomeRowModel
import com.ubaysapplication.app.modules.home.`data`.viewmodel.HomeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val homeAdapter = HomeAdapter(viewModel.homeList.value?:mutableListOf())
    binding.recyclerHome.adapter = homeAdapter
    homeAdapter.setOnItemClickListener(
    object : HomeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeRowModel) {
        onClickRecyclerHome(view, position, item)
      }
    }
    )
    viewModel.homeList.observe(this) {
      homeAdapter.updateData(it)
    }
    binding.homeVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = AndroidLargeThreeActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.frameStack.setOnClickListener {
        val destIntent = AndroidLargeThreeActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.imageImageFive.setOnClickListener {
        val destIntent = AndroidLargeThreeActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    fun onClickRecyclerHome(
      view: View,
      position: Int,
      item: HomeRowModel
    ): Unit {
      when(view.id) {
        R.id.btnLihatSemua -> {
          val destIntent = AndroidLargeOneActivity.getIntent(this, null)
          startActivity(destIntent)
        }
      }
    }

    companion object {
      const val TAG: String = "HOME_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, HomeActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
