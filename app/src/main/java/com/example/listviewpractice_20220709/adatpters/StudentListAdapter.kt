package com.example.listviewpractice_20220709.adatpters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
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

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val ageTxt = row.findViewById<TextView>(R.id.ageTxT)
        val addressTxt = row.findViewById<TextView>(R.id.addressTxt)

        // mList[position] ==> mList의 position번째 있는 studentData

        nameTxt.text = mList[position].name
// 도전과제 => String을 가공(${} 활용) => 나이부분의 값이 (~~세)로 표시되도록 가공
        ageTxt.text = mList[position].birthYear.toString()
        addressTxt.text = mList[position].address

        return row
    }
}