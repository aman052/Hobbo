package com.pcon.hobbo.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pcon.hobbo.Models.SearchFragmentItemsModel;
import com.pcon.hobbo.R;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class SearchListFragmentAdapter extends RecyclerView.Adapter<SearchListFragmentAdapter.SearchListFragmentViewHolder> {

    //private LayoutInflater inflater;
    //private Context context;
    private List<SearchFragmentItemsModel> list = new ArrayList<>();

   public SearchListFragmentAdapter(List<SearchFragmentItemsModel> list)
   {
       //this.context=context;
       this.list=list;

   }

    @NonNull
    @Override
    public SearchListFragmentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //context = viewGroup.getContext();
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_search_fragment,viewGroup,false);
        return (new SearchListFragmentViewHolder(v));
    }

    @Override
    public void onBindViewHolder(@NonNull SearchListFragmentViewHolder searchListFragmentViewHolder, int i) {
        SearchFragmentItemsModel curr=list.get(i);
        searchListFragmentViewHolder.imageView.setImageResource(curr.getmItemImage());
        searchListFragmentViewHolder.itemName.setText(curr.getmItemName());
        searchListFragmentViewHolder.itemAddress.setText(curr.getmItemAddress());
        searchListFragmentViewHolder.itemActiveMembers.setText(curr.getmItemActiveMembers());
        searchListFragmentViewHolder.itemRating.setText(curr.getmItemRating());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class SearchListFragmentViewHolder extends RecyclerView.ViewHolder {
        public CircleImageView imageView;
        public TextView itemName;
        public TextView itemAddress;
        public TextView itemActiveMembers;
        public TextView itemRating;

        public SearchListFragmentViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.search_list_image);
            itemName=itemView.findViewById(R.id.topic);
            itemAddress=itemView.findViewById(R.id.address);
            itemActiveMembers=itemView.findViewById(R.id.activeMembers);
            itemRating=itemView.findViewById(R.id.rating);
        }
    }
}
