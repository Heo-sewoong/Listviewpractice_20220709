package com.example.listviewpractice_20220709.adatpters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listviewpractice_20220709.R
import com.example.listviewpractice_20220709.StudentData
import java.math.MathContext

class StudentListAdapter(
    val mContext: Context,
    val resID : Int,
    val mList: ArrayList<StudentData>

    ) : ArrayAdapter<StudentData>(mContext, resID, mList) {
    // 한 칸의 xml에 나타날 모양을 커스터마이징
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.student_list_item,null)

        }
        val row = tempRow!!

        return row
    }
}