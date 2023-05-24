package com.ubaysapplication.app.modules.androidlargetwo.`data`.model

import com.ubaysapplication.app.R
import com.ubaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargeTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWeburl: String? = MyApp.getInstance().resources.getString(R.string.lbl_levelup_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPCGame: String? = MyApp.getInstance().resources.getString(R.string.lbl_pc_game)

)
