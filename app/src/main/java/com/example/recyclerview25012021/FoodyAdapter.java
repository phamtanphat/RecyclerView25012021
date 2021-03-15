package com.example.recyclerview25012021;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FoodyAdapter extends RecyclerView.Adapter<FoodyAdapter.FoodyViewHolder> {

    List<FoodyModel> listModel;

    @NonNull
    @Override
    public FoodyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // LayoutInflater lớp đối tượng sử dụng để chuyển đổi kiểu layout sang kiểu view
        // Các lớp cung cấp context : activity , view , viewgroup , service , fragment...
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_item_foody,parent,false);
        return new FoodyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodyViewHolder holder, int position) {

    }

    // Trả về số lượng dòng
    @Override
    public int getItemCount() {
        // Biểu thức 3 ngôi
        // điều kiện ? biểu thức cho điều kiện là true : biểu thức cho điều kiện là false
        return listModel != null ? listModel.size() : 0;

    }

    //View Holder dùng quản lý giao diện cho 1 item
    class FoodyViewHolder extends RecyclerView.ViewHolder{

        ImageView imgStatus,imgBackground;
        TextView txtName , txtAddress ,txtSalesOff , txtSaleOffMore;

        public FoodyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgStatus = itemView.findViewById(R.id.imageViewBackground);
            imgBackground = itemView.findViewById(R.id.imageStatus);
            txtAddress = itemView.findViewById(R.id.textViewAddress);
            txtName = itemView.findViewById(R.id.textViewName);
            txtSalesOff = itemView.findViewById(R.id.textViewSaleOff);
            txtSaleOffMore = itemView.findViewById(R.id.textViewSaleOffsMore);
        }
    }
}
