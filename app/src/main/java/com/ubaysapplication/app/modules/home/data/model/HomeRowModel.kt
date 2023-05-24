package com.ubaysapplication.app.modules.home.`data`.model

import com.ubaysapplication.app.R
import com.ubaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMobileGame: String? = MyApp.getInstance().resources.getString(R.string.lbl_mobile_game)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFifaCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_fifa_23)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtML: String? = MyApp.getInstance().resources.getString(R.string.lbl_ml)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPUBGM: String? = MyApp.getInstance().resources.getString(R.string.lbl_pubgm)

)
