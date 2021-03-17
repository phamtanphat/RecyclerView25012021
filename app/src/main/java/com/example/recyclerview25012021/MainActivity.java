package com.example.recyclerview25012021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRcvFoody;
    ArrayList<FoodyModel> mArrFoody;
    FoodyAdapter mFoodyAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRcvFoody = findViewById(R.id.recyclerViewFoody);

        mArrFoody = new ArrayList<>();
        mArrFoody.add(
                new FoodyModel(
                        true,
                        R.drawable.hinhjinrobbq,
                        "Jinro BBQ - Huỳnh Thúc Kháng",
                        "Tòa M3-M4, 91A Nguyễn Chí Thanh (Đối diện 63 Huỳnh Thúc Kháng), Đống Đa",
                        new  String[]{
                                "Cả ngày - Giảm 15% ",
                                "Cả ngày - Tặng 01 lon đồ uống bất kỳ + Giảm 10%",
                                "Cả ngày - Đặt bàn để đảm bảo chỗ đến"}));
        mArrFoody.add(
                new FoodyModel(
                        true,
                        R.drawable.hinhbotoquanmoc,
                        "Bò Tơ Quán Mộc - Nguyễn Thị Định",
                        "B52 Nguyễn Thị Định, Thanh Xuân",
                        new  String[]{
                                "Cả ngày - Giảm 50%",
                                "Cả ngày - Giảm 50% các món Lẩu từ ngày 18/02 ~ 15/03",
                                "Cả ngày - Giảm 50% mẹt Bò Tơ Hấp Cuốn Bánh Tráng giá 175.000đ còn 88.000đ",
                                "Cả ngày - Giảm 10% tổng hóa đơn khi đặt chỗ qua NowTable",
                                "Cả ngày - Đặt bàn để đảm bảo chỗ đến ngày Lễ, Tết"}));
        mArrFoody.add(
                new FoodyModel(
                        true,
                        R.drawable.hinhboxbbq,
                        "Box BBQ - Đỗ Quang",
                        "37 Đỗ Quang, Cầu Giấy",
                        new  String[]{
                                "Ăn trưa - Giảm 23%",
                                "Ăn trưa - Giảm 23% Buffet 259.000đ còn 199.000đ/ khách",
                                "Cả ngày - Giảm 50% mẹt Bò Tơ Hấp Cuốn Bánh Tráng giá 175.000đ còn 88.000đ",
                                "Cả ngày - Đặt bàn để đảm bảo chỗ đến cho Lễ, Tết"}));

        mFoodyAdapter = new FoodyAdapter(mArrFoody);
        mRcvFoody.setAdapter(mFoodyAdapter);

        mFoodyAdapter.setOnItemClickListener(new OnItemClickRecyclerView() {
            @Override
            public void onClick(int position) {
                Toast.makeText(MainActivity.this, position + "", Toast.LENGTH_SHORT).show();
            }
        });
    }
}