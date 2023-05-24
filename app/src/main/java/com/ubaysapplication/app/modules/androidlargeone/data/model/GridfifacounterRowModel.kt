package com.ubaysapplication.app.modules.androidlargeone.`data`.model

import com.ubaysapplication.app.R
import com.ubaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GridfifacounterRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFifaCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_fifa_23)

)
