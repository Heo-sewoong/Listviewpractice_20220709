package com.example.listviewpractice_20220709.adatpters

import android.content.Context
import android.widget.ArrayAdapter
import com.example.listviewpractice_20220709.StudentData
import java.math.MathContext

class StudentListAdapter(
    val mContext: Context,
    val resID : Int,
    val mList: ArrayList<StudentData>

    ) : ArrayAdapter<StudentData>(mContext, resID, mList) {
}