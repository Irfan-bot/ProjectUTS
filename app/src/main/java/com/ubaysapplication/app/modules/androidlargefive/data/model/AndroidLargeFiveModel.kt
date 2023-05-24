package com.ubaysapplication.app.modules.androidlargefive.`data`.model

import com.ubaysapplication.app.R
import com.ubaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargeFiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWeburl: String? = MyApp.getInstance().resources.getString(R.string.lbl_levelup_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)

)
