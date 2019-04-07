package com.pcon.hobbo.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.pcon.hobbo.Activities.FiltersActivity;
import com.pcon.hobbo.Adapters.SearchListFragmentAdapter;
import com.pcon.hobbo.Models.SearchFragmentItemsModel;
import com.pcon.hobbo.R;

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Fragment {
    private RecyclerView recyclerView;
    private SearchView searchView;
    private ImageView filters;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_search,container,false);
        searchView=view.findViewById(R.id.searchView);
        filters=view.findViewById(R.id.filterImage);
//        searchView.setIconifiedByDefault(false);
//        searchView.setIconified(false);
//        searchView.clearFocus();

        List<SearchFragmentItemsModel> list=new ArrayList<SearchFragmentItemsModel>();
        list.add(new SearchFragmentItemsModel(R.drawable.cake2,"Dance Fusion Academy","Kormangla,4th Street","45",20, (float) 4.0));
        list.add(new SearchFragmentItemsModel(R.drawable.cake2,"Dance Fusion Academy","Kormangla,4th Street","45",20, (float) 4));
        list.add(new SearchFragmentItemsModel(R.drawable.cake2,"Dance Fusion Academy","Kormangla,4th Street","45",20, (float) 4));
        list.add(new SearchFragmentItemsModel(R.drawable.cake2,"Dance Fusion Academy","Kormangla,4th Street","45",20, (float) 4));

        recyclerView=view.findViewById(R.id.recyclerSearchFragment);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        SearchListFragmentAdapter adapter=new SearchListFragmentAdapter(list);
        recyclerView.setAdapter(adapter);

        filters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(), FiltersActivity.class);
                startActivity(i);
            }
        });

        return view;
    }
}
