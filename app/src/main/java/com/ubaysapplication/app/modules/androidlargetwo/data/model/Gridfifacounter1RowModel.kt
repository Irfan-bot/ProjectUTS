package com.ubaysapplication.app.modules.androidlargetwo.`data`.model

import com.ubaysapplication.app.R
import com.ubaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Gridfifacounter1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFifaCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_fifa_23)

)
