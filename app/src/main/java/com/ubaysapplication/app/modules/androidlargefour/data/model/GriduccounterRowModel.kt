package com.ubaysapplication.app.modules.androidlargefour.`data`.model

import com.ubaysapplication.app.R
import com.ubaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GriduccounterRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUcCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_70_uc)

)
