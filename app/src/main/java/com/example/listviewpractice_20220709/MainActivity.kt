package com.example.listviewpractice_20220709

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewpractice_20220709.adatpters.StudentListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val mStudentList = ArrayList<StudentData>()


    lateinit var mstudentListAdapter: StudentListAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 학생 데이터(더미 데이터 생성)
        // StudentData(~~~)라는 학생 데이터 객체들을 생성
        // ArrayList에 추가(mStudentList.add)
        mStudentList.add(StudentData("김민철",1990,"서울시 서대문구"))
        mStudentList.add(StudentData("김민철2",1990,"서울시 서대문구"))
        mStudentList.add(StudentData("김민철3",1990,"서울시 서대문구"))
        mStudentList.add(StudentData("김민철4",1990,"서울시 서대문구"))
        mStudentList.add(StudentData("김민철5",1990,"서울시 서대문구"))
        mStudentList.add(StudentData("김민철6",1990,"서울시 서대문구"))
        mStudentList.add(StudentData("김민철7",1990,"서울시 서대문구"))
        mStudentList.add(StudentData("김민철8",1990,"서울시 서대문구"))
        mStudentList.add(StudentData("김민철9",1990,"서울시 서대문구"))
        mStudentList.add(StudentData("김민철10",1990,"서울시 서대문구"))
        // 학생 데이터(더미 데이터 생성)

        // 실제 어댑터와 Arraylist를 연결(어댑터 클래스르

        mstudentListAdapter = StudentListAdapter(mContext = this, R.layout.student_list_item, mStudentList)

        // 액티비티 화면의 ListView 태그와 adpater를 연결

        mainListView.adapter = mstudentListAdapter


    }
}